package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ORDERSTATUS")
@SequenceGenerator(name = "id_Sequence", sequenceName = "ORDERSTATUS_SEQ", allocationSize = 1)
@Data
public class OrderStatus extends BaseEntity {

    @Column(name = "NAMEKEY", length = 1000,nullable = false)
    private String nameKey;

    @Column(name = "NAME", length = 1000,nullable = false)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "published", length = 1000,nullable = false)
    private Boolean published;
}
