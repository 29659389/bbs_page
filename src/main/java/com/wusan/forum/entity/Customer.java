package com.wusan.forum.entity;

public class Customer {
    private int mid;
    private String mname;
    private String mstate;
    private String micon;

    @Override
    public String toString() {
        return "Need{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mstate='" + mstate + '\'' +
                ", micon='" + micon + '\'' +
                '}';
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
}
