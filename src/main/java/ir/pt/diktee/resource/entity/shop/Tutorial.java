package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.entity.user.UserAvatar;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TUTORIAL")
@SequenceGenerator(name = "id_Sequence", sequenceName = "TUTORIAL_SEQ", allocationSize = 1)
@Data
public class Tutorial extends BaseEntity {

    @Column(name = "NAME", length = 1000)
    private String name;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name="CODE",length = 1000)
    private String code;

    @JoinColumn(name="TUTORIALSCATEGORY",referencedColumnName = "ID", nullable = false)
    @ManyToOne
    private TutorialsCategory tutorialsCategory;

    @Column(name="PUBLISHED",nullable = false)
    private Boolean published;

    @OneToMany(mappedBy = "tutorial")
    private List<Comments> commentsList;
}
