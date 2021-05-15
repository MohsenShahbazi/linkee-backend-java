package ir.pt.diktee.resource.model.gsm;

import java.util.ArrayList;
import java.util.List;

public class JConMsgReqListModel {

    private String message;
    private List<JConMsgReqModel> jConMsgReqModelList=new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<JConMsgReqModel> getjConMsgReqModelList() {
        return jConMsgReqModelList;
    }

    public void setjConMsgReqModelList(List<JConMsgReqModel> jConMsgReqModelList) {
        this.jConMsgReqModelList = jConMsgReqModelList;
    }
}
