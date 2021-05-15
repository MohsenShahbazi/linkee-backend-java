package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.Comments;
import ir.pt.diktee.resource.entity.shop.Discount;
import ir.pt.diktee.resource.model.shopModels.CommentModel;
import ir.pt.diktee.resource.model.shopModels.DiscountModel;
import org.mapstruct.Mapper;

/**
 * Created by Mohammadzadeh on 11/16/2019.
 */
@Mapper(componentModel = "spring")
public interface DiscountMapper extends BaseMapper<Discount, DiscountModel> {
}
