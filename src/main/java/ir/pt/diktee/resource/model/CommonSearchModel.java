package ir.pt.diktee.resource.model;

import lombok.Data;

@Data
public class CommonSearchModel {
    private String userName;
    private String personalCode;
    private String cesr;
    private String serl;
    private Boolean haveSupervisor;
    private Integer lifeStatus;
}
