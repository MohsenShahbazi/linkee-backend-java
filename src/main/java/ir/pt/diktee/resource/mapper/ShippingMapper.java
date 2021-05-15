package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.adress.State;
import ir.pt.diktee.resource.entity.shop.Shipping;
import ir.pt.diktee.resource.model.AddressModels.StateModel;
import ir.pt.diktee.resource.model.shopModels.ShippingModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShippingMapper extends BaseMapper<Shipping, ShippingModel> {
}
