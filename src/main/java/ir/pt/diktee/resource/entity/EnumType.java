package ir.pt.diktee.resource.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ENUMTYPE")
@SequenceGenerator(name = "id_Sequence", sequenceName = "ENUMTYPE_SEQ", allocationSize = 1)
@Data
public class EnumType extends BaseEntity {

    @Column(name = "KEY", length = 1000)
    private String key;

    @Column(name = "VALUE", length = 1000)
    private String value;

    @Column(name = "PRIORITY", length = 1000)
    private Integer priority;

    @Column(name = "PARENT", length = 1000)
    private Long parent;
}
