package com.hibernate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class pancard {

    @Id
    private int panId;

    private Long panNo;
    private String panName;
    private String gender;
    private String dob;

    @OneToOne(mappedBy = "pancard")
    private user1 user;

    public int getPanId() {
        return panId;
    }
    public void setPanId(int panId) {
        this.panId = panId;
    }
    public Long getPanNo() {
        return panNo;
    }
    public void setPanNo(Long panNo) {
        this.panNo = panNo;
    }
    public String getPanName() {
        return panName;
    }
    public void setPanName(String panName) {
        this.panName = panName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public user1 getUser() {
        return user;
    }
    public void setUser(user1 user) {
        this.user = user;
    }
}
