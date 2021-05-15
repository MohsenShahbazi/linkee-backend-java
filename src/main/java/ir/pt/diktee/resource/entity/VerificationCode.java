package ir.pt.diktee.resource.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "VERIFICATIONCODE")
@SequenceGenerator(name = "id_Sequence", sequenceName = "VERIFICATIONCODE_SEQ", allocationSize = 1)
@Data
public class VerificationCode extends BaseEntity {
    @Column(name = "PC")
    private String pc;

    @Column(name = "CODE")
    private String code;

}
