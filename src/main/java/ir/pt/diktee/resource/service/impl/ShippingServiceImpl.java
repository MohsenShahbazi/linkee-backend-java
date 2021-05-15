package ir.pt.diktee.resource.service.impl;


import ir.pt.core.service.BaseServiceImpl;
import ir.pt.diktee.resource.entity.shop.Shipping;
import ir.pt.diktee.resource.mapper.ShippingMapper;
import ir.pt.diktee.resource.model.shopModels.ShippingModel;
import ir.pt.diktee.resource.service.ShippingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ShippingServiceImpl extends BaseServiceImpl<Shipping, ShippingModel, ShippingMapper> implements ShippingService {

}
