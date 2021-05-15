package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.user.BlockedUser;
import ir.pt.diktee.resource.entity.user.User;
import ir.pt.diktee.resource.mapper.BlockedUserMapper;
import ir.pt.diktee.resource.mapper.UserMapper;
import ir.pt.diktee.resource.model.user.BlockedUserModel;
import ir.pt.diktee.resource.model.user.UserModel;
import ir.pt.diktee.resource.service.BlockedUserService;
import ir.pt.diktee.resource.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BlockedUserServiceImpl extends BaseServiceImpl<BlockedUser, BlockedUserModel, BlockedUserMapper> implements BlockedUserService {

}
