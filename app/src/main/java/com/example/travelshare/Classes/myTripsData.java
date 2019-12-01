package com.example.travelshare.Classes;

public class myTripsData {

    private String src_dest;
    private String crrydate;
    private String crrytime;
    private String Crrdate;

    public myTripsData(String srcdst,String crdate,String crtime,String crrdate)
    {
        this.src_dest=srcdst;
        this.crrydate=crdate;
        this.crrytime=crtime;
        this.Crrdate=crrdate;
    }

    public String getSrc_dest() {
        return src_dest;
    }

    public void setSrc_dest(String src_dest) {
        this.src_dest = src_dest;
    }

    public String getCrrydate() {
        return crrydate;
    }

    public void setCrrydate(String crrydate) {
        this.crrydate = crrydate;
    }

    public String getCrrytime() {
        return crrytime;
    }

    public void setCrrytime(String crrytime) {
        this.crrytime = crrytime;
    }

    public String getCrrdate() {
        return Crrdate;
    }

    public void setCrrdate(String crrdate) {
        Crrdate = crrdate;
    }
}
