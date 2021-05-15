package ir.pt.diktee.resource.entity;

import ir.pt.common.enums.DataStatus;
import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by Mohammadzadeh on 11/16/2019.
 */
@Entity
@Table(name = "MENU",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"MENU_KEY", "DELETEDATE"})
        })
@SequenceGenerator(name = "id_Sequence", sequenceName = "MENU_SEQ", allocationSize = 1)
@Data
public class Menu extends BaseEntity {

    @Column(name = "STATUS", length = 3)
    private Integer STATUS = DataStatus.Active.getStatus();

    @Column(name = "MENU_KEY", length = 200, nullable = false)
    private String menu_key;

    @Column(name = "TITLE", length = 200, nullable = false)
    private String title;

    @Column(name = "FARSI_TITLE", length = 200, nullable = false)
    private String farsi_title;

    @Column(name = "ICON", length = 200, nullable = false)
    private String icon;

    @Column(name = "SREF", length = 500)
    private String sref;

    @Column(name = "PREPRIORITY", length = 3)
    private Integer prepriority;

    @Column(name = "POSTPRIORITY", length = 3)
    private Integer postpriority;

    @Column(name = "IDREF")
    private Long idref;

//    @ManyToOne
//    @JoinColumn(name = "IDREF")
//    private Menu parent;
}
