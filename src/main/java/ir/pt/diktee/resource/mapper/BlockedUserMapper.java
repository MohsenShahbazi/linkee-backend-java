package ir.pt.diktee.resource.mapper;
import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.user.BlockedUser;
import ir.pt.diktee.resource.entity.user.User;
import ir.pt.diktee.resource.model.user.BlockedUserModel;
import ir.pt.diktee.resource.model.user.UserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlockedUserMapper extends BaseMapper<BlockedUser, BlockedUserModel> {
}
