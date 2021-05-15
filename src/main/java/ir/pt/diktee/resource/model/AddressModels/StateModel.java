
package ir.pt.diktee.resource.model.AddressModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class StateModel extends BaseModel {

    @NotNull(message = "NotNull.stateModel.code")
    @NotEmpty(message = "NotNull.stateModel.code")
    private Integer code;

    @NotNull(message = "NotNull.stateModel.name")
    @NotEmpty(message = "NotNull.stateModel.name")
    private String name;
}
