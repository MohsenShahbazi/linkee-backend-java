package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TUTORIALSIMAGE")
@SequenceGenerator(name = "id_Sequence", sequenceName = "TUTORIALSIMAGE_SEQ", allocationSize = 1)
@Data
public class TutorialsImage extends BaseEntity {

    @Column(name = "NAME", length = 1000)
    private String name;
}
