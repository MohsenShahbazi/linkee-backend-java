package ir.pt.diktee.resource.model.acl;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class MyLoginModel implements Serializable {
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}
