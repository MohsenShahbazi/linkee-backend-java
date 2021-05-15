package ir.pt.diktee.resource.model.acl;

import ir.pt.core.model.BaseModel;
import lombok.Data;

@Data
public class MobileVersionModel extends BaseModel {

        private String versionNumber;
        private String message;

}
