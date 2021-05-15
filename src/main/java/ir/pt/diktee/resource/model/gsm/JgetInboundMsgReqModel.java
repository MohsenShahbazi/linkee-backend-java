package ir.pt.diktee.resource.model.gsm;

public class JgetInboundMsgReqModel {

    private String phoneNumber;
    private String identifier;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
