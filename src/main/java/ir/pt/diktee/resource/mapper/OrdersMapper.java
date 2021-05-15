package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.Discount;
import ir.pt.diktee.resource.entity.shop.Orders;
import ir.pt.diktee.resource.model.shopModels.DiscountModel;
import ir.pt.diktee.resource.model.shopModels.OrdersModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdersMapper extends BaseMapper<Orders, OrdersModel> {
}
