package com.hibernate.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class user1 {

    @Id
    private int userId;

    private String name;
    private String email;
    private long mobileNum;
    private String dob;

    @OneToOne
    @JoinColumn(name = "pan_id")   // FK in USER table
    private pancard pancard;

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getMobileNum() {
        return mobileNum;
    }
    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public pancard getPancard() {
        return pancard;
    }
    public void setPancard(pancard pancard) {
        this.pancard = pancard;
    }
}
