package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
public class DiscountModel extends BaseModel {

    private String name;

    private Long discountStart;

    private Long discountEnd;

    private Float discountAmount;

    private Float discountPercentAmount;

    private Float discountMinimumOrder;

    private Boolean published;


}
