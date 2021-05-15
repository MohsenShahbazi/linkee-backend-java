package ir.pt.diktee.resource.model.gsm;


import java.io.Serializable;
import java.util.List;

public class JContactListModel implements Serializable{

    private List<JContactModel> listModel;
    private Integer total;

    public List<JContactModel> getListModel() {
        return listModel;
    }

    public void setListModel(List<JContactModel> listModel) {
        this.listModel = listModel;
        if (listModel == null)
            this.total = 0;
        else
            this.total = listModel.size();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
