package ir.pt.diktee.resource.repository.impl;

import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.shop.OrderStatus;
import ir.pt.diktee.resource.entity.shop.Orders;
import ir.pt.diktee.resource.repository.OrderStatusDAO;
import ir.pt.diktee.resource.repository.OrdersDAO;
import org.springframework.stereotype.Repository;

@Repository
public class OrderStatusDAOImpl extends BaseDAOImpl<OrderStatus> implements OrderStatusDAO {


}
