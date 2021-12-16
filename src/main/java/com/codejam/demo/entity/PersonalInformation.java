package com.codejam.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "PERSONAL_INFORMATION")
public class PersonalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "real_name")
    private String realName;

    @Column(name = "idol_name")
    private String idolName;

    @Column(name = "address")
    private String address;

    @Column(name = "idol_status")
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
}
