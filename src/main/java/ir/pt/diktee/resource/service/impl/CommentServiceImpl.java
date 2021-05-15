package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.Comments;
import ir.pt.diktee.resource.mapper.CommentsMapper;
import ir.pt.diktee.resource.model.shopModels.CommentModel;
import ir.pt.diktee.resource.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommentServiceImpl extends BaseServiceImpl<Comments, CommentModel, CommentsMapper> implements CommentService {

}
