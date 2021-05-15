package ir.pt.diktee.resource.model.user;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.user.UserAvatar;
import ir.pt.diktee.resource.entity.user.UserProfile;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class BlockedUserModel extends BaseModel {

    @NotNull
    private Long userId;

    @NotNull
    private Long userBlockedId;
}
