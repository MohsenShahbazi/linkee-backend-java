package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import ir.pt.diktee.resource.entity.shop.RelatedTutorials;
import lombok.Data;

import java.util.List;


@Data
public class RelatedTutoriaList extends BaseModel {

    private List<RelatedTutorials> relatedTutorialsList;


}
