package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TUTORIALSCATEGORY")
@SequenceGenerator(name = "id_Sequence", sequenceName = "TUTORIALSCATEGORY_SEQ", allocationSize = 1)
@Data
public class TutorialsCategory extends BaseEntity {

    @JoinColumn(name="CATEGORYPARENTID",referencedColumnName = "ID", nullable = false)
    @ManyToOne
    private TutorialsCategory categoryParentId;

    @Column(name = "NAME",length = 1000,nullable = false)
    private String name;

    @Column(name = "DESCRIPTION",length = 1000,nullable = false)
    private String description;

    @Column(name="PUBLISHED",nullable = false)
    private Boolean published;
}
