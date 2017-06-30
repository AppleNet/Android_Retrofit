package com.llc.retrofit.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * RechekData
 *
 * @author liulongchao
 * @since 2017/2/8
 */

public class RechekData implements Parcelable {

    private SellerEntity sellerEntity;
    private WareEntity wareEntity;
    private InstalmentEntity instalmentEntity;
    private SaleControl saleControl;
    private List<UrlList> list;
    private String goodsTotalSave;// 商品总价攒单
    private String downPaymentRatioSave;// 首付比例攒单
    private String downPaymentAmountSave; //首付金额 攒单


    public RechekData() {
    }

    public SellerEntity getSellerEntity() {
        return sellerEntity;
    }

    public void setSellerEntity(SellerEntity sellerEntity) {
        this.sellerEntity = sellerEntity;
    }

    public WareEntity getWareEntity() {
        return wareEntity;
    }

    public void setWareEntity(WareEntity wareEntity) {
        this.wareEntity = wareEntity;
    }

    public InstalmentEntity getInstalmentEntity() {
        return instalmentEntity;
    }

    public void setInstalmentEntity(InstalmentEntity instalmentEntity) {
        this.instalmentEntity = instalmentEntity;
    }

    public SaleControl getSaleControl() {
        return saleControl;
    }

    public void setSaleControl(SaleControl saleControl) {
        this.saleControl = saleControl;
    }

    public List<UrlList> getList() {
        return list;
    }

    public void setList(List<UrlList> list) {
        this.list = list;
    }

    public String getGoodsTotalSave() {
        return goodsTotalSave;
    }

    public void setGoodsTotalSave(String goodsTotalSave) {
        this.goodsTotalSave = goodsTotalSave;
    }

    public String getDownPaymentRatioSave() {
        return downPaymentRatioSave;
    }

    public void setDownPaymentRatioSave(String downPaymentRatioSave) {
        this.downPaymentRatioSave = downPaymentRatioSave;
    }

    public String getDownPaymentAmountSave() {
        return downPaymentAmountSave;
    }

    public void setDownPaymentAmountSave(String downPaymentAmountSave) {
        this.downPaymentAmountSave = downPaymentAmountSave;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.sellerEntity, 0);
        dest.writeParcelable(this.wareEntity, 0);
        dest.writeParcelable(this.instalmentEntity, 0);
        dest.writeParcelable(this.saleControl, 0);
        dest.writeTypedList(list);
        dest.writeString(this.goodsTotalSave);
        dest.writeString(this.downPaymentRatioSave);
        dest.writeString(this.downPaymentAmountSave);
    }

    protected RechekData(Parcel in) {
        this.sellerEntity = in.readParcelable(SellerEntity.class.getClassLoader());
        this.wareEntity = in.readParcelable(WareEntity.class.getClassLoader());
        this.instalmentEntity = in.readParcelable(InstalmentEntity.class.getClassLoader());
        this.saleControl = in.readParcelable(SaleControl.class.getClassLoader());
        this.list = in.createTypedArrayList(UrlList.CREATOR);
        this.goodsTotalSave = in.readString();
        this.downPaymentRatioSave = in.readString();
        this.downPaymentAmountSave = in.readString();
    }

    public static final Creator<RechekData> CREATOR = new Creator<RechekData>() {
        public RechekData createFromParcel(Parcel source) {
            return new RechekData(source);
        }

        public RechekData[] newArray(int size) {
            return new RechekData[size];
        }
    };
}
