package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.user.User;
import lombok.Data;

@Data
public class OrdersModel extends BaseModel {

    private String description;

    private Long orderNumber;

    private Float price;

    private OrderStatusModel orderStatusModel;

    private PaymentMethodModel paymentMethod;

    private CurrencyModel currencyModel;

    private User user;

    private ShippingModel shippingModel;

    private DiscountModel discountModel;


}
