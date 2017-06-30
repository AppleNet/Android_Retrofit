package com.llc.retrofit.bean;

/**
 * com.llc.retrofit.bean.Commit
 *
 * @author liulongchao
 * @since 2017/6/30
 */


public class Commit {

    private String token;
    private String loanApplyNo;
    private String businessType;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLoanApplyNo() {
        return loanApplyNo;
    }

    public void setLoanApplyNo(String loanApplyNo) {
        this.loanApplyNo = loanApplyNo;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}
