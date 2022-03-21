package com.uts.TegarFarisNurhakim.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Klub implements Parcelable{
    private String name,desc,detail;

    public Klub(String name,String desc,String detail){
        this.name=name;
        this.desc=desc;
        this.detail=detail;
    }

    protected Klub(Parcel in) {
        name = in.readString();
        desc = in.readString();
        detail = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(desc);
        dest.writeString(detail);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Klub> CREATOR = new Creator<Klub>() {
        @Override
        public Klub createFromParcel(Parcel in) {
            return new Klub(in);
        }

        @Override
        public Klub[] newArray(int size) {
            return new Klub[size];
        }
    };

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
    public  String getDetail(){
        return detail;
    }
    public void setDetail(String detail){
        this.detail=detail;
    }
}
