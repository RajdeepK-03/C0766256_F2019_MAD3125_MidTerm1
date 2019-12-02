package com.example.c0766256_f2019_mad3125_midterm;

import android.os.Parcel;
import android.os.Parcelable;

public class CRACustomer implements Parcelable
{
    private String sinNumber,age;
    String fName,lName;
    String fullName;
    String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public CRACustomer(String sinNumber, String age, String fName, String lName) {
        this.sinNumber = sinNumber;
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        this.fullName = fullName;
        this.gender = gender;
    }

    //    public CRACustomer(String fullName)
//    {
//       this.fullName = fullName;
//    }
    public static final Creator<CRACustomer> CREATOR = new Creator<CRACustomer>() {
        @Override
        public CRACustomer createFromParcel(Parcel in) {
            return new CRACustomer(in);
        }

        @Override
        public CRACustomer[] newArray(int size) {
            return new CRACustomer[size];
        }
    };

    public String getLname() {
        return lName;
    }

    public void setLname(String lname) {
        this.lName = lname;
    }

    public String getSinNumber() {
        return sinNumber;
    }

    public void setSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFullName() {
        return lName.toUpperCase() + " , " + fName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fName);
        dest.writeString(lName);
        dest.writeString(fullName);
        dest.writeString(sinNumber);
        dest.writeString(age);
        dest.writeString(gender);

    }
    public CRACustomer(Parcel parcel)
    {
        fName = parcel.readString();
        lName = parcel.readString();
        fullName =parcel.readString();
        sinNumber = parcel.readString();
        age = parcel.readString();
        gender = parcel.readString();
    }
}

