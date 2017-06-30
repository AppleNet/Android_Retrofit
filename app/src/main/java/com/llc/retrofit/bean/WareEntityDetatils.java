package com.llc.retrofit.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * WareEntityDetatils
 *
 * @author liulongchao
 * @since 2017/2/8
 */

public class WareEntityDetatils implements Parcelable{
    private String id;
    private String sku;
    private String goodName;
    private String goodDescription;
    private String quantity;
    private String goodAmount;
    private String promoterMobile;
    private String promoter;
    private String promoterName;
    private String downPayment;
    private String goodsType;
    private String heasbuyCount;
    private String startTime;
    private String endTime;


    public WareEntityDetatils(){}

    protected WareEntityDetatils(Parcel in) {
        id = in.readString();
        sku = in.readString();
        goodName = in.readString();
        goodDescription = in.readString();
        quantity = in.readString();
        goodAmount = in.readString();
        promoterMobile = in.readString();
        promoter = in.readString();
        promoterName = in.readString();
        downPayment = in.readString();
        goodsType = in.readString();
        heasbuyCount = in.readString();
        startTime = in.readString();
        endTime = in.readString();
    }

    public static final Creator<WareEntityDetatils> CREATOR = new Creator<WareEntityDetatils>() {
        @Override
        public WareEntityDetatils createFromParcel(Parcel in) {
            return new WareEntityDetatils(in);
        }

        @Override
        public WareEntityDetatils[] newArray(int size) {
            return new WareEntityDetatils[size];
        }
    };

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodDescription() {
        return goodDescription;
    }

    public void setGoodDescription(String goodDescription) {
        this.goodDescription = goodDescription;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getGoodAmount() {
        return goodAmount;
    }

    public void setGoodAmount(String goodAmount) {
        this.goodAmount = goodAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPromoterMobile() {
        return promoterMobile;
    }

    public void setPromoterMobile(String promoterMobile) {
        this.promoterMobile = promoterMobile;
    }

    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter;
    }

    public String getPromoterName() {
        return promoterName;
    }

    public void setPromoterName(String promoterName) {
        this.promoterName = promoterName;
    }

    public String getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(String downPayment) {
        this.downPayment = downPayment;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getHeasbuyCount() {
        return heasbuyCount;
    }

    public void setHeasbuyCount(String heasbuyCount) {
        this.heasbuyCount = heasbuyCount;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(sku);
        dest.writeString(goodName);
        dest.writeString(goodDescription);
        dest.writeString(quantity);
        dest.writeString(goodAmount);
        dest.writeString(promoterMobile);
        dest.writeString(promoter);
        dest.writeString(promoterName);
        dest.writeString(downPayment);
        dest.writeString(goodsType);
        dest.writeString(heasbuyCount);
        dest.writeString(startTime);
        dest.writeString(endTime);
    }
}
