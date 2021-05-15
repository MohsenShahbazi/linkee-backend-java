package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.Billing;
import ir.pt.diktee.resource.entity.shop.Cart;
import ir.pt.diktee.resource.mapper.BillingMapper;
import ir.pt.diktee.resource.mapper.CartMapper;
import ir.pt.diktee.resource.model.shopModels.BillingModel;
import ir.pt.diktee.resource.model.shopModels.CartModel;
import ir.pt.diktee.resource.service.BillingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BillingServiceImpl extends BaseServiceImpl<Billing, BillingModel, BillingMapper> implements BillingService {

}
