package ir.pt.diktee.resource.entity.user;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "BLOCKEDUSER")
@SequenceGenerator(name = "id_Sequence", sequenceName = "BLOCKEDUSER_SEQ", allocationSize = 1)
@Data
public class BlockedUser extends BaseEntity {

    @Column(name = "USERID", length = 1000,nullable = false)
    private Long userId;


    @Column(name="USERBLOCKEDID",length = 1000,nullable = false)
    private Long userBlockedId;
}
