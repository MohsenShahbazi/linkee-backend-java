package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TUTORIALSFILE")
@SequenceGenerator(name = "id_Sequence", sequenceName = "TUTORIALSFILE_SEQ", allocationSize = 1)
@Data
public class TutorialsFile extends BaseEntity {

    @Column(name = "NAME", length = 1000)
    private String name;

}
