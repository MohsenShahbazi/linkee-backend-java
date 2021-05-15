package ir.pt.diktee.resource.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class SearchPersonModel implements Serializable {
    private String sessionId;
    private String memberCode;
    private String captchaKey;
    private String isFull;
}
