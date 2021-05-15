package ir.pt.diktee.resource.model.acl;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginModel implements Serializable {
    private Long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String description;
    private Integer status;
}
