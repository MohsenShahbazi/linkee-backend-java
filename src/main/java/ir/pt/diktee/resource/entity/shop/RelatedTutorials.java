package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "RELATEDTUTORIALS")
@SequenceGenerator(name = "id_Sequence", sequenceName = "RELATEDTUTORIALS_SEQ", allocationSize = 1)
@Data
public class RelatedTutorials extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "CATEGORYID", referencedColumnName = "ID",nullable = false)
    private TutorialsCategory categoryId;

    @ManyToOne
    @JoinColumn(name = "TUTORIALID", referencedColumnName = "ID",nullable = false)
    private Tutorial tutorialsId;


}
