package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.Orders;
import ir.pt.diktee.resource.entity.shop.PaymentMethod;
import ir.pt.diktee.resource.model.shopModels.OrdersModel;
import ir.pt.diktee.resource.model.shopModels.PaymentMethodModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMethodMapper extends BaseMapper<PaymentMethod, PaymentMethodModel> {
}
