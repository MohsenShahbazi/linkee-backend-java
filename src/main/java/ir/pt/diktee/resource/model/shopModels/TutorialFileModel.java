package ir.pt.diktee.resource.model.shopModels;

import ir.pt.core.model.BaseModel;
import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Data
public class TutorialFileModel extends BaseModel {
    private String name;

}
