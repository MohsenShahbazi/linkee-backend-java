package ir.pt.diktee.resource.entity.user;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.enums.GENDER;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Table(name = "USERPROFILE")
@SequenceGenerator(name = "id_Sequence", sequenceName = "USERPROFILE_SEQ", allocationSize = 1)
@Data
public class UserProfile extends BaseEntity {

    @Column(name = "FNAME", length = 1000,nullable = false)
    private String firsName;


    @Column(name = "LNAME", length = 1000,nullable = false)
    private String lastName;

    @Column(name = "ADDRESS1", length = 1000,nullable = true)
    private String address1;

    @Column(name = "ADDRESS2", length = 1000,nullable = true)
    private String address2;

    @Column(name = "CITY", length = 1000,nullable = false)
    private String city;


    @Column(name="COUNTRY",length = 1000,nullable = false)
    private String country;

    @Column(name="STATE",length = 1000,nullable = false)
    private String state;

    @Column(name="STREET",length = 1000,nullable = false)
    private String street;

    @Column(name="BIRTHDATE",length = 1000)
    private Date birthDate;

    @Column(name="GENDER",length = 1000)
    private GENDER gender;

    @Column(name="INVITEDCODE",length = 1000)
    private String invitedCode;

    @Column(name="DISPLAYNAME",length = 1000)
    private String displayName;

    @Column(name="LOCATION",length = 1000)
    private String location;

    @Column(name="LATITUD",length = 1000)
    private Float latitud;

    @Column(name="LONGITUDE",length = 1000)
    private Float longitude;

    @Column(name="BLOCKED",length = 1000)
    private Boolean blocked = false;

    @Column(name="lASTONLINE",length = 1000)
    private Date lastOnline;


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;



}
