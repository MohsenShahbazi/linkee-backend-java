package ir.pt.diktee.resource.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by farshad on 13/11/2017.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EnumTypeFlatModel implements Serializable {
    private Long id;
    private Long version;
    private String key;
    private String value;
    private Integer priority;
    private Long parent;
}
