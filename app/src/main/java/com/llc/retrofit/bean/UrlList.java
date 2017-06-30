package com.llc.retrofit.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * UrlList
 *
 * @author liulongchao
 * @since 2017/3/4
 */

public class UrlList implements Parcelable {
    private String count;
    private String lastUrl;
    private String patch;
    private String picType;
    private String upload;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.count);
        dest.writeString(this.lastUrl);
        dest.writeString(this.patch);
        dest.writeString(this.picType);
        dest.writeString(this.upload);
    }

    public UrlList() {
    }

    protected UrlList(Parcel in) {
        this.count = in.readString();
        this.lastUrl = in.readString();
        this.patch = in.readString();
        this.picType = in.readString();
        this.upload = in.readString();
    }

    public static final Creator<UrlList> CREATOR = new Creator<UrlList>() {
        public UrlList createFromParcel(Parcel source) {
            return new UrlList(source);
        }

        public UrlList[] newArray(int size) {
            return new UrlList[size];
        }
    };

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getLastUrl() {
        return lastUrl;
    }

    public void setLastUrl(String lastUrl) {
        this.lastUrl = lastUrl;
    }

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    public String getUpload() {
        return upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
    }
}
