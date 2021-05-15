package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VOTE")
@SequenceGenerator(name = "id_Sequence", sequenceName = "VOTE_SEQ", allocationSize = 1)
@Data
public class Vote extends BaseEntity {

    @Column(name = "NAME", length = 1000)
    private String name;


    @Column(name = "STATUS")
    private Boolean status;

}
