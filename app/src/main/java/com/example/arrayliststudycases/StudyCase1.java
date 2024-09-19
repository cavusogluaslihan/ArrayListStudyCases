package com.example.arrayliststudycases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StudyCase1 {
    public static void main(String args[]){

        ArrayList<Integer> nums = new ArrayList<>();

        Random createdNums = new Random();

        for (int i=0;i<100;i++){
            int randomNumber = createdNums.nextInt(100);
            nums.add(randomNumber);
        }

        Collections.sort(nums);
        for (Integer i: nums) {
            System.out.println(i);
        }
    }
}
