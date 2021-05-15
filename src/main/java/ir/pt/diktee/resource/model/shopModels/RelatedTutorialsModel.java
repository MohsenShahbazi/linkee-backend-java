package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;


@Data
public class RelatedTutorialsModel extends BaseModel {

    private RelatedTutorialsModel relatedTutorialsModel;

    private TutorialsModel tutorialsModel;


}
