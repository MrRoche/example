package edu.demo.model;

import org.evergreen.db.helper.Column;

public class Users {

    @Column("U_ID")
    private String uid;
    @Column("U_NAME")
    private String userName;
    @Column("U_TEL")
    private String tel;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
