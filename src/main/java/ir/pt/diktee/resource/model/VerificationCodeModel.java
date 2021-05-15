package ir.pt.diktee.resource.model;

import ir.pt.core.model.BaseModel;
import lombok.Data;

@Data
public class VerificationCodeModel extends BaseModel {
    private String pc;
    private String code;
    private EnumTypeModel type;
    //TODO:this is for test and remove it
    @Deprecated
    private String description;
}
