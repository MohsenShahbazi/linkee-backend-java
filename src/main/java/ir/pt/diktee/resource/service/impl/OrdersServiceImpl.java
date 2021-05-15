package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.Discount;
import ir.pt.diktee.resource.entity.shop.Orders;
import ir.pt.diktee.resource.mapper.DiscountMapper;
import ir.pt.diktee.resource.mapper.OrdersMapper;
import ir.pt.diktee.resource.model.shopModels.DiscountModel;
import ir.pt.diktee.resource.model.shopModels.OrdersModel;
import ir.pt.diktee.resource.service.DiscountService;
import ir.pt.diktee.resource.service.OrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrdersServiceImpl extends BaseServiceImpl<Orders, OrdersModel, OrdersMapper> implements OrdersService {

}
