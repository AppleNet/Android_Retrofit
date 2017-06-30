package com.llc.retrofit.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * SellerEntity
 *
 * @author liulongchao
 * @since 2017/2/8
 */

public class SellerEntity implements Parcelable{

    private String loanApplyNo;
    private String userToken;
    private String applyProgress;
    private String sellerType;
    private String sellerName;
    private String sellerCode;
    private String storeName;
    private String storeCode;

    protected SellerEntity(Parcel in) {
        loanApplyNo = in.readString();
        userToken = in.readString();
        applyProgress = in.readString();
        sellerType = in.readString();
        sellerName = in.readString();
        sellerCode = in.readString();
        storeName = in.readString();
        storeCode = in.readString();
    }

    public static final Creator<SellerEntity> CREATOR = new Creator<SellerEntity>() {
        @Override
        public SellerEntity createFromParcel(Parcel in) {
            return new SellerEntity(in);
        }

        @Override
        public SellerEntity[] newArray(int size) {
            return new SellerEntity[size];
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

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(loanApplyNo);
        dest.writeString(userToken);
        dest.writeString(applyProgress);
        dest.writeString(sellerType);
        dest.writeString(sellerName);
        dest.writeString(sellerCode);
        dest.writeString(storeName);
        dest.writeString(storeCode);
    }
}
