package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.Shipping;
import ir.pt.diktee.resource.entity.shop.Vote;
import ir.pt.diktee.resource.model.shopModels.ShippingModel;
import ir.pt.diktee.resource.model.shopModels.VoteModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VoteMapperMapper extends BaseMapper<Vote, VoteModel> {
}
