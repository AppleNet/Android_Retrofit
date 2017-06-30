package com.llc.retrofit.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * SaleControl
 *
 * @author liulongchao
 * @since 2017/3/2
 */

public class SaleControl implements Parcelable {
    private String fid;
    private String storeCode;
    private String personNo;
    private String storeProvinceCode;
    private String storeCityCode;
    private String storeDetailedAddress;
    private String storeName;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getPersonNo() {
        return personNo;
    }

    public void setPersonNo(String personNo) {
        this.personNo = personNo;
    }

    public String getStoreProvinceCode() {
        return storeProvinceCode;
    }

    public void setStoreProvinceCode(String storeProvinceCode) {
        this.storeProvinceCode = storeProvinceCode;
    }

    public String getStoreCityCode() {
        return storeCityCode;
    }

    public void setStoreCityCode(String storeCityCode) {
        this.storeCityCode = storeCityCode;
    }

    public String getStoreDetailedAddress() {
        return storeDetailedAddress;
    }

    public void setStoreDetailedAddress(String storeDetailedAddress) {
        this.storeDetailedAddress = storeDetailedAddress;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fid);
        dest.writeString(this.storeCode);
        dest.writeString(this.personNo);
        dest.writeString(this.storeProvinceCode);
        dest.writeString(this.storeCityCode);
        dest.writeString(this.storeDetailedAddress);
        dest.writeString(this.storeName);
    }

    public SaleControl() {
    }

    protected SaleControl(Parcel in) {
        this.fid = in.readString();
        this.storeCode = in.readString();
        this.personNo = in.readString();
        this.storeProvinceCode = in.readString();
        this.storeCityCode = in.readString();
        this.storeDetailedAddress = in.readString();
        this.storeName = in.readString();
    }

    public static final Creator<SaleControl> CREATOR = new Creator<SaleControl>() {
        public SaleControl createFromParcel(Parcel source) {
            return new SaleControl(source);
        }

        public SaleControl[] newArray(int size) {
            return new SaleControl[size];
        }
    };
}
