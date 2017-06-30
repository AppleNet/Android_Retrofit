package com.llc.retrofit.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * WareEntity
 *
 * @author liulongchao
 * @since 2017/2/8
 */

public class WareEntity implements Parcelable{
    private String fid;
    private String loanApplyNo;
    private String userToken;
    private String applyProgress;
    private String goodsTotal;
    private String periodProduct;
    private String periodProductCode;
    private String smallTicket;
    private List<WareEntityDetatils> wareEntityDetatilList;


    protected WareEntity(Parcel in) {
        loanApplyNo = in.readString();
        userToken = in.readString();
        applyProgress = in.readString();
        goodsTotal = in.readString();
        periodProduct = in.readString();
        periodProductCode = in.readString();
        smallTicket = in.readString();
        wareEntityDetatilList = in.createTypedArrayList(WareEntityDetatils.CREATOR);
        fid = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(loanApplyNo);
        dest.writeString(userToken);
        dest.writeString(applyProgress);
        dest.writeString(goodsTotal);
        dest.writeString(periodProduct);
        dest.writeString(periodProductCode);
        dest.writeString(smallTicket);
        dest.writeTypedList(wareEntityDetatilList);
        dest.writeString(fid);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<WareEntity> CREATOR = new Creator<WareEntity>() {
        @Override
        public WareEntity createFromParcel(Parcel in) {
            return new WareEntity(in);
        }

        @Override
        public WareEntity[] newArray(int size) {
            return new WareEntity[size];
        }
    };

    public List<WareEntityDetatils> getWareEntityDetatilList() {
        return wareEntityDetatilList;
    }

    public void setWareEntityDetatilList(List<WareEntityDetatils> wareEntityDetatilList) {
        this.wareEntityDetatilList = wareEntityDetatilList;
    }

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

    public String getGoodsTotal() {
        return goodsTotal;
    }

    public void setGoodsTotal(String goodsTotal) {
        this.goodsTotal = goodsTotal;
    }

    public String getPeriodProduct() {
        return periodProduct;
    }

    public void setPeriodProduct(String periodProduct) {
        this.periodProduct = periodProduct;
    }

    public String getPeriodProductCode() {
        return periodProductCode;
    }

    public void setPeriodProductCode(String periodProductCode) {
        this.periodProductCode = periodProductCode;
    }

    public String getSmallTicket() {
        return smallTicket;
    }

    public void setSmallTicket(String smallTicket) {
        this.smallTicket = smallTicket;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }
}
