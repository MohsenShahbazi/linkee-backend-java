package ir.pt.diktee.resource.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.user.BlockedUser;
import ir.pt.diktee.resource.entity.user.User;
import ir.pt.diktee.resource.repository.BlockedUserDAO;
import ir.pt.diktee.resource.repository.UserDAO;
import org.springframework.stereotype.Repository;

@Repository
public class BlockedUserDAOImpl extends BaseDAOImpl<BlockedUser> implements BlockedUserDAO {

}
