package ir.pt.diktee.resource.model;

import ir.pt.core.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EnumTypeModel extends BaseModel {
    private Long id;
    private Long version;
    private String key;
    private String value;
    private Integer priority;
    private Long parent;
    private List<EnumTypeModel> child;
}
