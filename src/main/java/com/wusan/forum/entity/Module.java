package com.wusan.forum.entity;

import java.util.Date;

public class Module {
    private int mid;
    private String mname;
    private String mstate;
    private String micon;
    private int smid;
    private String smname;
    private String smstate;
    private String smicon;
    private String pname;
    private Date ptime;
    private Integer pid;
    private Integer pstate;
    private String uicon;
    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Module{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mstate='" + mstate + '\'' +
                ", micon='" + micon + '\'' +
                ", smid=" + smid +
                ", smname='" + smname + '\'' +
                ", smstate='" + smstate + '\'' +
                ", smicon='" + smicon + '\'' +
                ", pname='" + pname + '\'' +
                ", ptime=" + ptime +
                ", pid=" + pid +
                ", pstate=" + pstate +
                ", uicon='" + uicon + '\'' +
                ", uid=" + uid +
                '}';
    }

    public String getUicon() {
        return uicon;
    }

    public void setUicon(String uicon) {
        this.uicon = uicon;
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMstate() {
        return mstate;
    }

    public void setMstate(String mstate) {
        this.mstate = mstate;
    }

    public String getMicon() {
        return micon;
    }

    public void setMicon(String micon) {
        this.micon = micon;
    }

    public int getSmid() {
        return smid;
    }

    public void setSmid(int smid) {
        this.smid = smid;
    }

    public String getSmname() {
        return smname;
    }

    public void setSmname(String smname) {
        this.smname = smname;
    }

    public String getSmstate() {
        return smstate;
    }

    public void setSmstate(String smstate) {
        this.smstate = smstate;
    }

    public String getSmicon() {
        return smicon;
    }

    public void setSmicon(String smicon) {
        this.smicon = smicon;
    }
}
