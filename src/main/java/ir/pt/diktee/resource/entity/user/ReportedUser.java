package ir.pt.diktee.resource.entity.user;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "REPORTEDUSER")
@SequenceGenerator(name = "id_Sequence", sequenceName = "REPORTEDUSER_SEQ", allocationSize = 1)
@Data
public class ReportedUser extends BaseEntity {

    @Column(name = "USERID", length = 1000,nullable = false)
    private Long userId;


    @Column(name="REPORTEDUSERID",length = 1000,nullable = false)
    private Long reportedUserId;
}
