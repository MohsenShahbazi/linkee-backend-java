package ir.pt.diktee.resource.model.user;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.user.User;
import ir.pt.diktee.resource.enums.GENDER;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;


@Data
public class UserProfileModel extends BaseModel {

    @NotNull
    private String firsName;

    @NotNull
    private String lastName;

    private String address1;

    private String address2;

    @NotNull
    private String city;

    private String country;

    private String state;

    private String street;

    private Date birthDate;

    private GENDER gender;

    private String invitedCode;

    private String displayName;

    private String location;

    private Float latitud;

    private Float longitude;

    private Boolean blocked = false;

    private Date lastOnline;

    private User user;
}
