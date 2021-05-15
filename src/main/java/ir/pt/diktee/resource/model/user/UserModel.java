package ir.pt.diktee.resource.model.user;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.user.UserAvatar;
import ir.pt.diktee.resource.entity.user.UserProfile;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class UserModel extends BaseModel {

    private String userName;
    @NotNull
    private String password;
    @NotNull
    private String email;

    private Boolean status = true;

    private Boolean isOnline = true;

    private UserProfile userProfile;

    private List<UserAvatar> avatarList;
}
