
package ir.pt.diktee.resource.entity.adress;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.entity.user.UserAvatar;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "COUNTRY", uniqueConstraints = { @UniqueConstraint(columnNames = {"CODE", "DELETEDATE"})})
@SequenceGenerator(name = "id_Sequence", sequenceName = "COUNTRY_SEQ", allocationSize = 1)
@Data
public class Country extends BaseEntity {

    @Column(name = "CODE", nullable = false)
    private Integer code;


    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(mappedBy = "country")
    private List<State> stateList;
}
