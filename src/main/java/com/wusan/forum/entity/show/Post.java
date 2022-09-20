package com.wusan.forum.entity.show;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Post {
    //用户 tab_user
    private Integer uid;
    private String uname;
    private String upwd;
    private String uphone;
    private String address;
    private String emial;
    private String uicon;
    private Integer gid;//用户等级
    private String rtime;

    @Override
    public String toString() {
        return "Post{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uphone='" + uphone + '\'' +
                ", address='" + address + '\'' +
                ", emial='" + emial + '\'' +
                ", uicon='" + uicon + '\'' +
                ", gid=" + gid +
                ", rtime='" + rtime + '\'' +
                ", mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mstate=" + mstate +
                ", micon='" + micon + '\'' +
                ", smid=" + smid +
                ", smname='" + smname + '\'' +
                ", smstate=" + smstate +
                ", smicon='" + smicon + '\'' +
                ", pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcontent='" + pcontent + '\'' +
                ", ptime='" + ptime + '\'' +
                ", rid=" + rid +
                ", rcontent='" + rcontent + '\'' +
                ", id=" + id +
                '}';
    }

    public String getRtime() {
        return rtime;
    }

    public void setRtime(String rtime) {
        this.rtime = rtime;
    }

    //主版块 tab_module
    private Integer mid;
    private String mname;
    private Integer mstate;//状态
    private String micon;//图标
    //子版块 tab_son_module
    private Integer smid;
    private String smname;
    private Integer smstate;
    private String smicon;
//帖子 tab_post
    private Integer pid;
    private String pname;
    private String pcontent;
    private String ptime;
    //用户回帖表 tab_reply
    private Integer rid;
    private String rcontent;
    //回帖-帖子中间表 tab_r_p
    private Integer id;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
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

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }

    public String getMicon() {
        return micon;
    }

    public void setMicon(String micon) {
        this.micon = micon;
    }

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public String getSmname() {
        return smname;
    }

    public void setSmname(String smname) {
        this.smname = smname;
    }

    public Integer getSmstate() {
        return smstate;
    }

    public void setSmstate(Integer smstate) {
        this.smstate = smstate;
    }

    public String getSmicon() {
        return smicon;
    }

    public void setSmicon(String smicon) {
        this.smicon = smicon;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
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
