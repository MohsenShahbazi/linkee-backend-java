package ir.pt.diktee.resource.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.concurrent.Executor;

@Configuration
public class ThreadPoolTaskConfig {

    @Autowired
    private Dashboard dashboard;

    @Bean
    public TaskExecutor taskExecutor() {
        SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(Integer.parseInt(dashboard.TASK_CORE_POOL_SIZE));
        executor.setMaxPoolSize(Integer.parseInt(dashboard.TASK_POOL_SIZE));
        executor.setQueueCapacity(Integer.parseInt(dashboard.TASK_QUEUE_CAPACITY));
        executor.setThreadNamePrefix("ISAR-TASK-");
        executor.initialize();
        return executor;
    }

    @Bean
    public Executor threadPoolTaskExecutor() {
        SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(20);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("ISAR-TASK-");
        executor.initialize();
        return executor;
    }

}
