package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.shopModels.OrdersModel;
import ir.pt.diktee.resource.model.shopModels.PaymentMethodModel;
import ir.pt.diktee.resource.service.OrdersService;
import ir.pt.diktee.resource.service.PaymentMethodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = {"/paymentMethod"})
public class PaymentMethodController extends CustomBaseController<PaymentMethodModel> {

    public PaymentMethodController(PaymentMethodService paymentMethodService, PaymentMethodService paymentMethodService1) {
        super(paymentMethodService, paymentMethodService1);
    }

}
