package ir.pt.diktee.resource.mapper;

import ir.pt.core.mapper.BaseMapper;
import ir.pt.diktee.resource.entity.adress.City;
import ir.pt.diktee.resource.entity.shop.Cart;
import ir.pt.diktee.resource.model.AddressModels.CityModel;
import ir.pt.diktee.resource.model.shopModels.CartModel;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface CartMapper extends BaseMapper<Cart, CartModel> {
}
