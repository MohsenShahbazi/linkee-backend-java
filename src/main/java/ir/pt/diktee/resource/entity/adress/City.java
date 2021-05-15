
package ir.pt.diktee.resource.entity.adress;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.entity.user.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CITY",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"CODE", "DELETEDATE"})
        })
@SequenceGenerator(name = "id_Sequence", sequenceName = "CITY_SEQ", allocationSize = 1)
@Data
public class City extends BaseEntity {
    @Basic
    @Column(name = "CODE", nullable = false)
    private Integer code;

    @Basic
    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "STATE_ID", referencedColumnName = "ID")
    private State state;
}
