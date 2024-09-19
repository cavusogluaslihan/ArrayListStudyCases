package com.example.arrayliststudycases;

public class StudyCase4Personnel {
    private int personnelNo;
    private String personnelName;
    private StudyCase4Address address;

    public StudyCase4Personnel() {
    }

    public StudyCase4Personnel(int personnelNo, String personnelName, StudyCase4Address address) {
        this.personnelNo = personnelNo;
        this.personnelName = personnelName;
        this.address = address;
    }

    public int getPersonnelNo() {
        return personnelNo;
    }

    public void setPersonnelNo(int personnelNo) {
        this.personnelNo = personnelNo;
    }

    public String getPersonnelName() {
        return personnelName;
    }

    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName;
    }

    public StudyCase4Address getAddress() {
        return address;
    }

    public void setAddress(StudyCase4Address address) {
        this.address = address;
    }
}
