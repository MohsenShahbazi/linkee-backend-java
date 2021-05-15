package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ORDERSTUTORIALS")
@SequenceGenerator(name = "id_Sequence", sequenceName = "ORDERSTUTORIAL_SEQ", allocationSize = 1)
@Data
public class OrdersTutorials extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "ORDERID", referencedColumnName = "ID", nullable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "TUTORIALID", referencedColumnName = "ID", nullable = false)
    private Tutorial tutorials;


}
