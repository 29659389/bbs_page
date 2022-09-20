package com.wusan.forum.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class UserInfo {
    @Id
    private Integer uid;
    private String uname;
    private String upwd;
    private String uphone;
    private String address;
    private String email;
    private String uicon;
    private Integer gid;
    private Integer state;
    private Integer realstate;

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uphone='" + uphone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", uicon='" + uicon + '\'' +
                ", gid=" + gid +
                ", state=" + state +
                ", realstate=" + realstate +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUicon() {
        return uicon;
    }

    public void setUicon(String uicon) {
        this.uicon = uicon;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRealstate() {
        return realstate;
    }

    public void setRealstate(Integer realstate) {
        this.realstate = realstate;
    }
}
