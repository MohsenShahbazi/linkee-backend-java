package ir.pt.diktee.resource.model.gsm;

public class JContactModel {

    private int contacttype; //1: sazmani , 2: gheyre sazmani
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String personalcode;
    private String nationalcode;
    private String fathername;


    public int getContacttype() {
        return contacttype;
    }

    public void setContacttype(int contacttype) {
        this.contacttype = contacttype;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPersonalcode() {
        return personalcode;
    }

    public void setPersonalcode(String personalcode) {
        this.personalcode = personalcode;
    }

    public String getNationalcode() {
        return nationalcode;
    }

    public void setNationalcode(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }
}