package ir.pt.diktee.resource.model.gsm;

import java.util.ArrayList;
import java.util.List;

public class JsonRequestListT<T> {
    public JsonRequestListT()
    {
        data = new ArrayList<T>();
    }

    private String userName;
    private String password;
    private String message;
    private List<T> data;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
