package com.po;

import java.util.Date;

public class TrainDate {
    private Date traindate;

    private String typename;

    private Integer typeid;

    private Integer userid;

    public Date getTraindate() {
        return traindate;
    }

    public void setTraindate(Date traindate) {
        this.traindate = traindate;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    
    //日期字符表示
  	private String traindateStr;
  	
  	public String getTraindateStr() {
  		return traindateStr;
  	}

  	public void setTraindateStr(String traindateStr) {
  		this.traindateStr = traindateStr;
  	}
}