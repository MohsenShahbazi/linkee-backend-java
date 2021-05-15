package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.shop.Billing;
import ir.pt.diktee.resource.entity.shop.Shipping;
import ir.pt.diktee.resource.model.shopModels.BillingModel;
import ir.pt.diktee.resource.model.shopModels.ShippingModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BillingMapper extends BaseMapper<Billing, BillingModel> {
}
