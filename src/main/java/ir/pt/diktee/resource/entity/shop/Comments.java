package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.entity.user.User;
import lombok.Data;
import org.hibernate.annotations.Filter;

import javax.persistence.*;

@Entity
@Table(name = "COMMENTS")
@SequenceGenerator(name = "id_Sequence", sequenceName = "COMMENTS_SEQ", allocationSize = 1)
@Data
public class Comments extends BaseEntity {

    @Column(name = "DISCUS", length = 1000)
    private String discus;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "STATUS")
    private Boolean status;


    @ManyToOne
    @JoinColumn(name = "Tutorial_ID", referencedColumnName = "ID")
    private Tutorial tutorial;


}
