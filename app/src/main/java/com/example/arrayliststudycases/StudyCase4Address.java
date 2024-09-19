package com.example.arrayliststudycases;

public class StudyCase4Address {
    private String city;
    private String province;

    public StudyCase4Address() {
    }

    public StudyCase4Address(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
