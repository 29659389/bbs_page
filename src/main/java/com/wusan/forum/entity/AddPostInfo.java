package com.wusan.forum.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class AddPostInfo {
    @Id
    private Integer pid;
    private String pname;
    private String pcontent;
    private String ptime;
    private Integer pstate;

    @Override
    public String toString() {
        return "AddPostInfo{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcontent='" + pcontent + '\'' +
                ", ptime='" + ptime + '\'' +
                ", pstate=" + pstate +
                '}';
    }
}
