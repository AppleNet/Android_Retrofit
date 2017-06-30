package com.llc.retrofit.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * InstalmentEntity
 *
 * @author liulongchao
 * @since 2017/2/8
 */

public class InstalmentEntity implements Parcelable{
    private String fid;
    private String loanApplyNo;
    private String userToken;
    private String applyProgress;
    private String downPaymentRatio;
    private String downPaymentAmount;
    private String loanTerm;
    private String flexiblePayBag;// 灵活还款包
    private String flexiblePayBagName;
    private String personalInsurance;// 保障服务包
    private String personalInsuranceName;
    private String situation;
    private String saveFlag;

    protected InstalmentEntity(Parcel in) {
        loanApplyNo = in.readString();
        userToken = in.readString();
        applyProgress = in.readString();
        downPaymentRatio = in.readString();
        downPaymentAmount = in.readString();
        loanTerm = in.readString();
        flexiblePayBag = in.readString();
        personalInsurance = in.readString();
        situation = in.readString();
        saveFlag = in.readString();
        fid = in.readString();
        flexiblePayBagName = in.readString();
        personalInsuranceName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(loanApplyNo);
        dest.writeString(userToken);
        dest.writeString(applyProgress);
        dest.writeString(downPaymentRatio);
        dest.writeString(downPaymentAmount);
        dest.writeString(loanTerm);
        dest.writeString(flexiblePayBag);
        dest.writeString(personalInsurance);
        dest.writeString(situation);
        dest.writeString(saveFlag);
        dest.writeString(fid);
        dest.writeString(flexiblePayBagName);
        dest.writeString(personalInsuranceName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<InstalmentEntity> CREATOR = new Creator<InstalmentEntity>() {
        @Override
        public InstalmentEntity createFromParcel(Parcel in) {
            return new InstalmentEntity(in);
        }

        @Override
        public InstalmentEntity[] newArray(int size) {
            return new InstalmentEntity[size];
        }
    };

    public String getLoanApplyNo() {
        return loanApplyNo;
    }

    public void setLoanApplyNo(String loanApplyNo) {
        this.loanApplyNo = loanApplyNo;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getApplyProgress() {
        return applyProgress;
    }

    public void setApplyProgress(String applyProgress) {
        this.applyProgress = applyProgress;
    }

    public String getDownPaymentRatio() {
        return downPaymentRatio;
    }

    public void setDownPaymentRatio(String downPaymentRatio) {
        this.downPaymentRatio = downPaymentRatio;
    }

    public String getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(String downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getFlexiblePayBag() {
        return flexiblePayBag;
    }

    public void setFlexiblePayBag(String flexiblePayBag) {
        this.flexiblePayBag = flexiblePayBag;
    }

    public String getPersonalInsurance() {
        return personalInsurance;
    }

    public void setPersonalInsurance(String personalInsurance) {
        this.personalInsurance = personalInsurance;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getSaveFlag() {
        return saveFlag;
    }

    public void setSaveFlag(String saveFlag) {
        this.saveFlag = saveFlag;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFlexiblePayBagName() {
        return flexiblePayBagName;
    }

    public void setFlexiblePayBagName(String flexiblePayBagName) {
        this.flexiblePayBagName = flexiblePayBagName;
    }

    public String getPersonalInsuranceName() {
        return personalInsuranceName;
    }

    public void setPersonalInsuranceName(String personalInsuranceName) {
        this.personalInsuranceName = personalInsuranceName;
    }
}
