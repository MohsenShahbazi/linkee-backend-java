package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CommentModel extends BaseModel {
    @NotNull(message = "NotNull.CommentsModel.discus")
    @NotEmpty(message = "NotNull.CommentsModel.discus")
    private String discus;
    @NotNull(message = "NotNull.CommentsModel.status")
    @NotEmpty(message = "NotNull.CommentsModel.status")
    private Boolean status;
    @NotNull(message = "NotNull.CommentsModel.userName")
    @NotEmpty(message = "NotNull.CommentsModel.userName")
    private String userName;
}
