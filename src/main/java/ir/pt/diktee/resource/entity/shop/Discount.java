package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "DISCOUNT")
@SequenceGenerator(name = "id_Sequence", sequenceName = "DISCOUNT_SEQ", allocationSize = 1)
@Data
public class Discount extends BaseEntity {

    @Column(name = "NAME", length = 1000)
    private String name;

    @Column(name = "DISCOUNTSTART", length = 1000)
    private Long discountStart;

    @Column(name = "DISCOUNTEND", nullable = false)
    private Long discountEnd;

    @Column(name = "DISCOUNTAMOUNT", length = 1000, nullable = false)
    private Float discountAmount;

    @Column(name = "DISCOUNTPERCENTAMOUNT", length = 1000, nullable = false)
    private Float discountPercentAmount;

    @Column(name = "DISCOUNTMINIMUMORDER", nullable = false)
    private Float discountMinimumOrder;

    @Column(name = "PUBLISHED", nullable = false)
    private Boolean published;


}
