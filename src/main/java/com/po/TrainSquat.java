package com.po;

import java.util.Date;

public class TrainSquat {
    private Integer userid;

    private Date traindate;

    private Date traintime;

    private Integer typeid;

    private Integer number;

    private Double weight;

    private Integer unit;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getTraindate() {
        return traindate;
    }

    public void setTraindate(Date traindate) {
        this.traindate = traindate;
    }

    public Date getTraintime() {
        return traintime;
    }

    public void setTraintime(Date traintime) {
        this.traintime = traintime;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }
}