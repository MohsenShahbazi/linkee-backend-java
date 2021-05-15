package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class CurrencyListModel extends BaseModel {

    private List<CurrencyModel> currencyModelList;

}
