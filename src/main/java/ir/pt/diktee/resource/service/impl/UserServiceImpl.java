package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.user.User;
import ir.pt.diktee.resource.mapper.UserMapper;
import ir.pt.diktee.resource.model.user.UserModel;
import ir.pt.diktee.resource.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, UserModel, UserMapper> implements UserService {

}
