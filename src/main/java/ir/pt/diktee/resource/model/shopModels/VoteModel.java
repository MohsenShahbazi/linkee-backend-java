package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;


@Data
public class VoteModel extends BaseModel {

    private String name;
    private Boolean status;
}
