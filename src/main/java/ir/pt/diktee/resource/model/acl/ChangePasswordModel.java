package ir.pt.diktee.resource.model.acl;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChangePasswordModel implements Serializable {
    private String oldPassword;
    private String newPassword;
}
