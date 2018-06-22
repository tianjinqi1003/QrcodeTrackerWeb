package com.qdhualing.qrcodetracker.bean;

import java.util.List;

/**
 * @author 马鹏昊
 * @date {date}
 * @des
 * @updateAuthor
 * @updateDate
 * @updateDes
 */

public class SmallCpTrackResult {

    private String cpName	;
    private String sortName	;
    private String cpCode	;
    private String ylpc	;
    private String scpc	;
    private String scTime	;
    private String dw	;
    private float dwzl	;
    private String gg	;
    private String czy	;
    private String zjy	;
    private String jyzt	;

    //组成成分
    private List<ComponentBean> componentBeans ;

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getCpCode() {
        return cpCode;
    }

    public void setCpCode(String cpCode) {
        this.cpCode = cpCode;
    }

    public String getYlpc() {
        return ylpc;
    }

    public void setYlpc(String ylpc) {
        this.ylpc = ylpc;
    }

    public String getScpc() {
        return scpc;
    }

    public void setScpc(String scpc) {
        this.scpc = scpc;
    }

    public String getScTime() {
        return scTime;
    }

    public void setScTime(String scTime) {
        this.scTime = scTime;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public float getDwzl() {
        return dwzl;
    }

    public void setDwzl(float dwzl) {
        this.dwzl = dwzl;
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }

    public String getCzy() {
        return czy;
    }

    public void setCzy(String czy) {
        this.czy = czy;
    }

    public String getZjy() {
        return zjy;
    }

    public void setZjy(String zjy) {
        this.zjy = zjy;
    }

    public String getJyzt() {
        return jyzt;
    }

    public void setJyzt(String jyzt) {
        this.jyzt = jyzt;
    }

    public List<ComponentBean> getComponentBeans() {
        return componentBeans;
    }

    public void setComponentBeans(List<ComponentBean> componentBeans) {
        this.componentBeans = componentBeans;
    }
}
