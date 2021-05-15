package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "SHIPPING")
@SequenceGenerator(name = "id_Sequence", sequenceName = "SHIPPING_SEQ", allocationSize = 1)
@Data
public class Shipping extends BaseEntity {

    @Column(name = "NAME", length = 1000)
    private String name;

}
