package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.shop.Comments;
import lombok.Data;

import java.util.List;

@Data
public class TutorialsModel extends BaseModel {

    private String name;

    private String description;

    private String code;

    private TutorialsCategoryModel tutorialsCategoryModel;

    private Boolean published;

    private List<CommentModel> commentModelList;

}
