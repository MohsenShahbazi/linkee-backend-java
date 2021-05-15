package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.OrderStatus;
import ir.pt.diktee.resource.entity.shop.PaymentMethod;
import ir.pt.diktee.resource.mapper.OrderStatusMapper;
import ir.pt.diktee.resource.mapper.PaymentMethodMapper;
import ir.pt.diktee.resource.model.shopModels.OrderStatusModel;
import ir.pt.diktee.resource.model.shopModels.PaymentMethodModel;
import ir.pt.diktee.resource.service.OrderStatusService;
import ir.pt.diktee.resource.service.PaymentMethodService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaymentMethodServiceImpl extends BaseServiceImpl<PaymentMethod, PaymentMethodModel, PaymentMethodMapper> implements PaymentMethodService {

}
