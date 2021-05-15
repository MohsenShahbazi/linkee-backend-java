package ir.pt.diktee.resource.entity.user;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.enums.GENDER;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USERS")
@SequenceGenerator(name = "id_Sequence", sequenceName = "USERS_SEQ", allocationSize = 1)
@Data
public class User extends BaseEntity {

    @Column(name = "USERNAME", length = 1000,nullable = false)
    private String userName;


    @Column(name="PASSWORD",length = 1000,nullable = false)
    private String password;

    @Email
    @Column(name="EMAIL",length = 1000,nullable = false)
    private String email;


    @Column(name="STATUS",length = 1000)
    private Boolean status = true;

    @Column(name="ISONLINE",length = 1000)
    private Boolean isOnline = true;

    @OneToOne(mappedBy = "user")
    private UserProfile userProfile;

    @OneToMany(mappedBy = "user")
    private List<UserAvatar> avatarList;

    @OneToMany(mappedBy = "user")
    private List<UserLanguage> userLanguageList;
}
