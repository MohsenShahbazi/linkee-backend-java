package ir.pt.diktee.resource.model;

import ir.pt.common.enums.DataStatus;
import lombok.Data;

import java.util.List;

@Data
public class MenuModel {
    private Long id;
    private Long version;
    private Integer STATUS = DataStatus.Active.getStatus();
    private String menu_key;
    private String title;
    private String farsi_title;
    private String icon;
    private String sref;
    private Long idref;
    //private MenuModel parent;
    private List<MenuModel> children;
    private Integer postpriority;
    private Integer prepriority;
}
