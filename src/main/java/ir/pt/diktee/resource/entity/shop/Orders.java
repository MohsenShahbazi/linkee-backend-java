package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.entity.user.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
@SequenceGenerator(name = "id_Sequence", sequenceName = "ORDERS_SEQ", allocationSize = 1)
@Data
public class Orders extends BaseEntity {

    //توضیحات سفارش
    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "ORDERNUMBER", length = 1000, nullable = false)
    private Long orderNumber;

    @Column(name = "PRICE", length = 1000, nullable = false)
    private Float price;

    @ManyToOne
    @JoinColumn(name = "ORDERSTATUS", referencedColumnName = "ID", nullable = false)
    private OrderStatus orderStatus;


    @ManyToOne
    @JoinColumn(name = "PAYMENTMETHODID", referencedColumnName = "ID", nullable = false)
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "CURRENCYID", referencedColumnName = "ID", nullable = false)
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "USERID", referencedColumnName = "ID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "TUTORIALSSHIPPINGID", referencedColumnName = "ID", nullable = false)
    private Shipping shipping;

    @ManyToOne
    @JoinColumn(name = "DISCOUNT", referencedColumnName = "ID", nullable = false)
    private Discount discount;


}
