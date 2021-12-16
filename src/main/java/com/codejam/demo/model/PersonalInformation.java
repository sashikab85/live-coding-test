package com.codejam.demo.model;

public class PersonalInformation {


    private int id;

    private String realName;

    private String idolName;

    private String address;

    private String idolStatus;

    public PersonalInformation(int id, String realName, String idolName, String address, String idolStatus) {
        this.id = id;
        this.realName = realName;
        this.idolName = idolName;
        this.address = address;
        this.idolStatus = idolStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdolName() {
        return idolName;
    }

    public void setIdolName(String idolName) {
        this.idolName = idolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdolStatus() {
        return idolStatus;
    }

    public void setIdolStatus(String idolStatus) {
        this.idolStatus = idolStatus;
    }


    @Override
    public String toString() {
        return "PersonalInformation{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", idolName='" + idolName + '\'' +
                ", address='" + address + '\'' +
                ", idolStatus='" + idolStatus + '\'' +
                '}';
    }
}
