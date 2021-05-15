package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.shopModels.DiscountModel;
import ir.pt.diktee.resource.model.shopModels.OrdersModel;
import ir.pt.diktee.resource.service.DiscountService;
import ir.pt.diktee.resource.service.OrdersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = {"/orders"})
public class OrdersController extends CustomBaseController<OrdersModel> {

    public OrdersController(OrdersService ordersService, OrdersService ordersService1) {
        super(ordersService, ordersService1);
    }

}
