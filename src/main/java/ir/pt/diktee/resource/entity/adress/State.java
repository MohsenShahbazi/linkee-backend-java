
package ir.pt.diktee.resource.entity.adress;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.entity.user.User;
import ir.pt.diktee.resource.entity.user.UserAvatar;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "STATE", uniqueConstraints = { @UniqueConstraint(columnNames = {"CODE", "DELETEDATE"})})
@SequenceGenerator(name = "id_Sequence", sequenceName = "STATE_SEQ", allocationSize = 1)
@Data
public class State extends BaseEntity {


    @Column(name = "CODE", nullable = false)
    private Integer code;


    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(mappedBy = "state")
    private List<City> cityList;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID")
    private Country country;
}
