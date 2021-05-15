package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.adress.City;
import ir.pt.diktee.resource.entity.shop.Cart;
import ir.pt.diktee.resource.mapper.CartMapper;
import ir.pt.diktee.resource.mapper.CityMapper;
import ir.pt.diktee.resource.model.AddressModels.CityModel;
import ir.pt.diktee.resource.model.shopModels.CartModel;
import ir.pt.diktee.resource.service.CartService;
import ir.pt.diktee.resource.service.CityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CartServiceImpl extends BaseServiceImpl<Cart, CartModel, CartMapper> implements CartService {

}
