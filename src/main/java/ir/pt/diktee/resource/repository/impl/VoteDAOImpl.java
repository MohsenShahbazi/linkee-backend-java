package ir.pt.diktee.resource.repository.impl;


import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.shop.Vote;
import ir.pt.diktee.resource.repository.VoteDAO;
import org.springframework.stereotype.Repository;

@Repository
public class VoteDAOImpl extends BaseDAOImpl<Vote> implements VoteDAO {
}
