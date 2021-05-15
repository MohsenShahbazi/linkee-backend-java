package ir.pt.diktee.resource.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.user.BlockedUser;
import ir.pt.diktee.resource.entity.user.ReportedUser;
import ir.pt.diktee.resource.repository.BlockedUserDAO;
import ir.pt.diktee.resource.repository.ReportedUserDAO;
import org.springframework.stereotype.Repository;

@Repository
public class ReportedUserDAOImpl extends BaseDAOImpl<ReportedUser> implements ReportedUserDAO {

}
