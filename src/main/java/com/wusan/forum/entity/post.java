package com.wusan.forum.entity;

public class post {
    private int pid;
    private String pname;
    private String pcontent;
    private String ptime;
    private String uicon;
    private Integer pstate;
    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "post{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcontent='" + pcontent + '\'' +
                ", ptime='" + ptime + '\'' +
                ", uicon='" + uicon + '\'' +
                ", pstate=" + pstate +
                ", uid=" + uid +
                '}';
    }

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }

    public String getUicon() {
        return uicon;
    }

    public void setUicon(String uicon) {
        this.uicon = uicon;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }
}
