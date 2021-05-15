package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;

@Data
public class OrdersTutorialsModel extends BaseModel {

    private OrdersModel order;

    private TutorialsModel tutorialsModel;


}
