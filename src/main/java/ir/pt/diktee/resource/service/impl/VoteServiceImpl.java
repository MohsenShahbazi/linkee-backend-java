package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.Vote;
import ir.pt.diktee.resource.mapper.VoteMapperMapper;
import ir.pt.diktee.resource.model.shopModels.VoteModel;
import ir.pt.diktee.resource.service.VoteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VoteServiceImpl extends BaseServiceImpl<Vote, VoteModel, VoteMapperMapper> implements VoteService {

}
