package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENTMETHOD")
@SequenceGenerator(name = "id_Sequence", sequenceName = "PAYMENTMETHOD_SEQ", allocationSize = 1)
@Data
public class PaymentMethod extends BaseEntity {

    @Column(name = "NAME", length = 1000,nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "PAYMENT_IMAGE", length = 1000)
    private String paymentImage;

    @Column(name = "PUBLISHED", length = 1000)
    private Boolean published;

    @Column(name = "PAYMENTCURRENCY", length = 1000)
    private String paymentCurrency;


}
