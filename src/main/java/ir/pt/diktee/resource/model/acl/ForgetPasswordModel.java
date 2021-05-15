package ir.pt.diktee.resource.model.acl;

import lombok.Data;

import java.io.Serializable;

@Data
public class ForgetPasswordModel implements Serializable {
    private String pc;
    private String code;
    private String password;
}
