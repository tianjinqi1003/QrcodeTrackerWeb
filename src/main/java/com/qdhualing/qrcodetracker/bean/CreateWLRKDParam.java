package com.qdhualing.qrcodetracker.bean;

/**
 * @author 马鹏昊
 * @date {date}
 * @des
 * @updateAuthor
 * @updateDate
 * @updateDes
 */

public class CreateWLRKDParam {
	//发货单位
    private String FhDw;
    //收货日期
    private String ShRq;
    //入库单号
    private String InDh;
    //收货人
    private String Shr;
    //发货人
    private String Fhr;

    private String ShFzr;
    private String JhFzr;

    public String getShFzr() {
        return ShFzr;
    }

    public void setShFzr(String shFzr) {
        ShFzr = shFzr;
    }

    public String getJhFzr() {
        return JhFzr;
    }

    public void setJhFzr(String jhFzr) {
        JhFzr = jhFzr;
    }

    public String getFhDw() {
        return FhDw;
    }

    public void setFhDw(String fhDw) {
        FhDw = fhDw;
    }

    public String getShRq() {
        return ShRq;
    }

    public void setShRq(String shRq) {
        ShRq = shRq;
    }

    public String getInDh() {
        return InDh;
    }

    public void setInDh(String inDh) {
        InDh = inDh;
    }

    public String getShr() {
        return Shr;
    }

    public void setShr(String shr) {
        Shr = shr;
    }

    public String getFhr() {
        return Fhr;
    }

    public void setFhr(String fhr) {
        Fhr = fhr;
    }
}
