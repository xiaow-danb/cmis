package com.wander.cmis.bean;

import java.io.Serializable;

public class BankReturnDto  implements Serializable {

    //申请编号
    private String applyNo;
    //申请时间
    private String applyDate;
    //退回原因
    private String returnCaust;
    //退回时间
    private String returnDate;

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getReturnCaust() {
        return returnCaust;
    }

    public void setReturnCaust(String returnCaust) {
        this.returnCaust = returnCaust;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
