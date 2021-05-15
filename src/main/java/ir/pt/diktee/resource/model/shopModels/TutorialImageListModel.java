package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.shop.Tutorial;
import lombok.Data;

import java.util.List;


@Data
public class TutorialImageListModel extends BaseModel {
    private List <TutorialFileModel> tutorialFileModelList;
}
