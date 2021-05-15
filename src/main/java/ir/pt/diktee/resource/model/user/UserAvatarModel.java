package ir.pt.diktee.resource.model.user;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.user.User;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Data
public class UserAvatarModel extends BaseModel {

    @NonNull
    private String url;
    private Boolean active = false;
    private Boolean status = true;
    @NotNull
    private User user;
}
