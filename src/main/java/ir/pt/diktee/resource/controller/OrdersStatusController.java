package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.shopModels.OrderStatusModel;
import ir.pt.diktee.resource.model.shopModels.OrdersModel;
import ir.pt.diktee.resource.service.OrderStatusService;
import ir.pt.diktee.resource.service.OrdersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = {"/orderStatus"})
public class OrdersStatusController extends CustomBaseController<OrderStatusModel> {

    public OrdersStatusController(OrderStatusService orderStatusService, OrderStatusService orderStatusService1) {
        super(orderStatusService, orderStatusService1);
    }

}
