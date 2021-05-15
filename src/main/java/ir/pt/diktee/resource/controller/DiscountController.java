package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.shopModels.CommentModel;
import ir.pt.diktee.resource.model.shopModels.DiscountModel;
import ir.pt.diktee.resource.service.CommentService;
import ir.pt.diktee.resource.service.DiscountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = {"/discount"})
public class DiscountController extends CustomBaseController<DiscountModel> {

    public DiscountController(DiscountService discountService, DiscountService discountService1) {
        super(discountService, discountService1);
    }

}
