package ir.pt.diktee.resource.model.gsm;

import java.util.List;

public class JMsgReqListModel {

    private String message;
    private List<JMsgReqModel> jMsgReqModelList;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<JMsgReqModel> getjMsgReqModelList() {
        return jMsgReqModelList;
    }

    public void setjMsgReqModelList(List<JMsgReqModel> jMsgReqModelList) {
        this.jMsgReqModelList = jMsgReqModelList;
    }
}
