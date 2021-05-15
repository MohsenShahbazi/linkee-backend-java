package ir.pt.diktee.resource.repository.impl;

import ir.pt.core.repository.BaseDAOImpl;
import ir.pt.diktee.resource.entity.shop.OrderStatus;
import ir.pt.diktee.resource.entity.shop.PaymentMethod;
import ir.pt.diktee.resource.repository.OrderStatusDAO;
import ir.pt.diktee.resource.repository.PaymentMethodDAO;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentMethodDAOImpl extends BaseDAOImpl<PaymentMethod> implements PaymentMethodDAO {


}
