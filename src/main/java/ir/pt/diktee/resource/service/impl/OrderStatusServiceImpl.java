package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.OrderStatus;
import ir.pt.diktee.resource.entity.shop.Orders;
import ir.pt.diktee.resource.mapper.OrderStatusMapper;
import ir.pt.diktee.resource.mapper.OrdersMapper;
import ir.pt.diktee.resource.model.shopModels.OrderStatusModel;
import ir.pt.diktee.resource.model.shopModels.OrdersModel;
import ir.pt.diktee.resource.service.OrderStatusService;
import ir.pt.diktee.resource.service.OrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderStatusServiceImpl extends BaseServiceImpl<OrderStatus, OrderStatusModel, OrderStatusMapper> implements OrderStatusService {

}
