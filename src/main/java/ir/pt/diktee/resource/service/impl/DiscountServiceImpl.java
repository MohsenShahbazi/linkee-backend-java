package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.Comments;
import ir.pt.diktee.resource.entity.shop.Discount;
import ir.pt.diktee.resource.mapper.CommentsMapper;
import ir.pt.diktee.resource.mapper.DiscountMapper;
import ir.pt.diktee.resource.model.shopModels.CommentModel;
import ir.pt.diktee.resource.model.shopModels.DiscountModel;
import ir.pt.diktee.resource.service.CommentService;
import ir.pt.diktee.resource.service.DiscountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DiscountServiceImpl extends BaseServiceImpl<Discount, DiscountModel, DiscountMapper> implements DiscountService {

}
