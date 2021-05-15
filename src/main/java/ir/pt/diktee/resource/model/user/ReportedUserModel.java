package ir.pt.diktee.resource.model.user;

import ir.pt.core.model.BaseModel;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ReportedUserModel extends BaseModel {

    @NotNull
    private Long userId;

    @NotNull
    private Long userReportedId;
}
