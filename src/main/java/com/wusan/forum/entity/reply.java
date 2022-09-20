package com.wusan.forum.entity;

import java.util.Date;

public class reply {
    private int rid;
    private String uid;
    private String rcontent;
    private String pname;
    private String pcontent;

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    @Override
    public String toString() {
        return "reply{" +
                "rid=" + rid +
                ", uid='" + uid + '\'' +
                ", rcontent='" + rcontent + '\'' +
                ", pname='" + pname + '\'' +
                ", pcontent='" + pcontent + '\'' +
                ", pid=" + pid +
                '}';
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    private Integer pid;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }
}
