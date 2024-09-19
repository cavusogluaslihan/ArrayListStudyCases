package com.example.arrayliststudycases;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Scanner;

public class StudyCase2 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a name : ");
        String searchingName = scanner.next();

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Jammie");
        nameList.add("Bloom");
        nameList.add("jack");
        nameList.add("elisa");
        nameList.add("Emma");
        nameList.add("Andrea");


        for (int i=0;i<6;i++) {
            if (searchingName.equalsIgnoreCase(nameList.get(i))){
                System.out.println("match-up");
                break;
        } if(!searchingName.equalsIgnoreCase(nameList.get(i))){
                System.out.println("The name does not found");
                break;
            }

        }

    }
}
