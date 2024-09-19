package com.example.arrayliststudycases;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudyCase3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        Random createdNums = new Random();

        int randomNumber = createdNums.nextInt(100);
        nums.add(randomNumber);

        boolean guessedCorrectly = false;


        for (int x = 0; x < 5; x++) {
            System.out.print("Please enter the number you guessed : ");
            int guessedNumber = scanner.nextInt();

                if (guessedNumber == randomNumber) {
                    System.out.println("Congrats! You guessed the correct number.");
                    guessedCorrectly = true;
                    break;
                }
                  else if (guessedNumber<randomNumber && x<4 ){
                        System.out.println("Enter new value. Must be greater than this value! ");
                    } else if (guessedNumber>randomNumber && x<4){
                        System.out.println("Enter new value. Must be smaller than this value! ");
                    }
                }

        if (!guessedCorrectly){
            System.out.println("Random Number : " +randomNumber);
            System.out.println("FAIL! You couldn't guess the number.");
        }


            }


        }


