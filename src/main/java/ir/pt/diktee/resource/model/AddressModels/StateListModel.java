package ir.pt.diktee.resource.model.AddressModels;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.model.AddressModels.StateModel;
import lombok.Data;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Data
public class StateListModel extends BaseModel {
    List<StateModel> modelList;
    private Long total;
}
