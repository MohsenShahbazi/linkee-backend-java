package ir.pt.diktee.resource.model;

import ir.pt.common.model.CredentialModel;

import java.io.Serializable;

/**
 * Created by Paytam on 07/08/2016.
 */
public class SubMernuCredentailaModel implements Serializable {

    private Long parentID;

    private CredentialModel credentialModel;

    public Long getParentID() {
        return parentID;
    }

    public void setParentID(Long parentID) {
        this.parentID = parentID;
    }

    public CredentialModel getCredentialModel() {
        return credentialModel;
    }

    public void setCredentialModel(CredentialModel credentialModel) {
        this.credentialModel = credentialModel;
    }
}
