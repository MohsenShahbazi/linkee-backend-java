package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.OrderStatus;
import ir.pt.diktee.resource.entity.shop.Orders;
import ir.pt.diktee.resource.model.shopModels.OrderStatusModel;
import ir.pt.diktee.resource.model.shopModels.OrdersModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderStatusMapper extends BaseMapper<OrderStatus, OrderStatusModel> {
}
