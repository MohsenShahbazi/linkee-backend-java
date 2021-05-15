package ir.pt.diktee.resource.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by farshad on 04/12/2017.
 */
@Data
public class EnumTypeKeyValueModel implements Serializable {
    private Long id;
    private String key;
    private String value;
    private List<EnumTypeKeyValueModel> child;
}
