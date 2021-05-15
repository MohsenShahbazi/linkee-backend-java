package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import lombok.Data;

@Data
public class CurrencyModel extends BaseModel {

    private String currencySymbol;

    private String currencyCode;

    private String currencyName;

    private String currencyFormat;

    private Boolean published;
}
