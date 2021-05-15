package ir.pt.diktee.resource.controller;

import ir.pt.diktee.resource.model.AddressModels.CityModel;
import ir.pt.diktee.resource.model.shopModels.CartModel;
import ir.pt.diktee.resource.model.shopModels.CommentModel;
import ir.pt.diktee.resource.service.CartService;
import ir.pt.diktee.resource.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ahangari on 08/16/2017.
 */
@RestController
@RequestMapping(value = "/cart")
public class CartController extends CustomBaseController<CartModel> {
    public CartController(CartService cartService, CartService cartService1) {
        super(cartService, cartService1);
    }

/*    @Autowired
    CityService cityService;

    @Override
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity<JPresent<Boolean>> delete(@RequestParam(name = "id") Long id) {
        try {
            Boolean result = cityService.delete(id);
            return jPresent.getResponse(new JDataModel(result));
        } catch (BusinessException bx) {
            return jPresent.getResponse(bx);
        }
    }

    @Override
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public ResponseEntity<JPresent<Boolean>> get(@RequestParam(name = "id") Long id) {
        try {
            return jPresent.getResponse(cityService.get(id));
        } catch (BusinessException bx) {
            return jPresent.getResponse(bx);
        }
    }*/
}
