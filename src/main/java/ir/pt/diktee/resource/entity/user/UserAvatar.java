package ir.pt.diktee.resource.entity.user;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "USERAVATAR")
@SequenceGenerator(name = "id_Sequence", sequenceName = "USERAVATAR_SEQ", allocationSize = 1)
@Data
public class UserAvatar extends BaseEntity {

    @Column(name = "URL", length = 1000, nullable = false)
    private String url;


    @Column(name = "ACTIVE", nullable = false)
    private Boolean active = false;


    @Column(name = "STATUS", nullable = false)
    private Boolean status = true;


    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User user;



}
