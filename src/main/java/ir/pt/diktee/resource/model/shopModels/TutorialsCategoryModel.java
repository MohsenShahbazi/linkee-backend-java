package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;

@Data
public class TutorialsCategoryModel extends BaseModel {

    private TutorialsCategoryModel tutorialCategoryModel;

    private String name;

    private String description;

    private Boolean published;
}
