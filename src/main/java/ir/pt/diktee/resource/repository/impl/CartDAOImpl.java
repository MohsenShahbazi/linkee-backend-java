package ir.pt.diktee.resource.repository.impl;

import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.adress.City;
import ir.pt.diktee.resource.entity.shop.Cart;
import ir.pt.diktee.resource.repository.CartDAO;
import ir.pt.diktee.resource.repository.CityDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartDAOImpl extends BaseDAOImpl<Cart> implements CartDAO {

}
