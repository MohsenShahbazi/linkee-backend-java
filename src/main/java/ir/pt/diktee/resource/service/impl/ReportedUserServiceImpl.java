package ir.pt.diktee.resource.service.impl;

import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.user.BlockedUser;
import ir.pt.diktee.resource.entity.user.ReportedUser;
import ir.pt.diktee.resource.mapper.BlockedUserMapper;
import ir.pt.diktee.resource.mapper.ReportedUserMapper;
import ir.pt.diktee.resource.model.user.BlockedUserModel;
import ir.pt.diktee.resource.model.user.ReportedUserModel;
import ir.pt.diktee.resource.service.BlockedUserService;
import ir.pt.diktee.resource.service.ReportedUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReportedUserServiceImpl extends BaseServiceImpl<ReportedUser, ReportedUserModel, ReportedUserMapper> implements ReportedUserService {

}
