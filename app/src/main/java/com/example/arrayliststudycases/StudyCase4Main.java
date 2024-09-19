package com.example.arrayliststudycases;

import java.util.ArrayList;
import java.util.Scanner;

public class StudyCase4Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        ArrayList<StudyCase4Personnel> personnel = new ArrayList<>();


        for (int i=0;i<5;i++){
            System.out.print((i+1)+" th Personnel Name: ");
            String nameOfThePersonnel = scanner.next();
            System.out.print((i+1)+" nd Personnel City: ");
            String cityOfThePersonnel = scanner.next();
            System.out.print((i+1)+" rd Personnel Province: ");
            String provinceOfThePersonnel = scanner.next();

            StudyCase4Address newAddress = new StudyCase4Address(cityOfThePersonnel,provinceOfThePersonnel);

            StudyCase4Personnel newPersonnel = new StudyCase4Personnel((i+1),nameOfThePersonnel,newAddress);

            personnel.add(newPersonnel);

        }
        for (StudyCase4Personnel p: personnel){
            System.out.println("--------");
            System.out.println("Personnel No: "+p.getPersonnelNo());
            System.out.println("Name :"+p.getPersonnelName());
            System.out.println("-----ADDRESS-----");
            System.out.println("City: "+p.getAddress().getCity());
            System.out.println("Province: "+p.getAddress().getProvince());
        }
    }
}
