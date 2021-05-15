
package ir.pt.diktee.resource.model.AddressModels;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.adress.State;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class CountryModel extends BaseModel {
    @NotNull(message = "NotNull.CountryModel.code")
    @NotEmpty(message = "NotNull.CountryModel.code")
    private Integer code;

    @NotNull(message = "NotNull.CountryModel.name")
    @NotEmpty(message = "NotNull.CountryModel.name")
    private String name;

    @NotNull(message = "NotNull.CountryModel.state")
    @NotEmpty(message = "NotNull.CountryModel.state")
    private State state;
}
