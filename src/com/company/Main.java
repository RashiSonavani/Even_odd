package com.company;

public class Main {

    public static void main(String[] args) {

        int RandNumber = (int) (Math.random() * (100 - 1));

        if(RandNumber%2 == 0){
            System.out.println(RandNumber + "is an even number");

        }
        else {
            System.out.println(RandNumber + "is an odd number");
            
        }
    }
}
