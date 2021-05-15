
package ir.pt.diktee.resource.model.AddressModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CityModel extends BaseModel {
    @NotNull(message = "NotNull.cityModel.code")
    @NotEmpty(message = "NotNull.cityModel.code")
    private Integer code;
    @NotNull(message = "NotEmpty.cityModel.name")
    @NotEmpty(message = "NotEmpty.cityModel.name")
    private String name;
    @NotNull(message = "NotNull.cityModel.state")
    @NotEmpty(message = "NotNull.cityModel.state")
    private StateModel state;
}
