package ir.pt.diktee.resource.model.gsm;

import java.util.ArrayList;
import java.util.List;

public class JsonResponseListT<T> {
    public JsonResponseListT()
    {
        data = new ArrayList<T>();
    }

    private boolean success;
    private String message;
    private List<T> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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
