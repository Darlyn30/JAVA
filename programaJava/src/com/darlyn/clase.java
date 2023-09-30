package com.darlyn;

import java.util.ArrayList;
import java.util.Scanner;

public class clase {
    public static void main(String[] args) {
        /*
        * in this file i will take note for basic concepts of java
        * */
        System.out.println("hello world"); // with this we can write by console

        // types of variables
        String name = "hello i'm a string";
        int  num = 1543;
        float floatNum= 1.58f;
        double doubleNum = 1.70;
        char charChar = 'c';

        // arrays
        int[] arrayNum = {1,2,3,4,5,6,7,8,9,0};
        String[] arrayString = {"potato", "apple", "jose", "pineapple"};
        double[] arrayDouble = {1.5, 2.7, 6.3};

        System.out.println(arrayDouble[0]);

        // conditionals

        if(arrayNum[0] > arrayNum[3]){
            System.out.println(arrayString[3]);
        } else {
            System.out.println(arrayDouble[2]);
        }
        // switch
        switch(num){
            case 1:
                System.out.println(name);
                break;
            default:
                break;
        }
        // loops
        //for
        // running those arrays
        for(int i = 0; i < arrayNum.length; i++){
            System.out.println(arrayNum[i]);
        }
        // while

        int lap = 5;
        while(lap > 7){
            System.out.println(num);
        }
        // do while
        do {
            System.out.println(num);
        } while(lap > 6);

        // if the program wants receive a date by the user, it need an import call it Scanner
        Scanner sc = new Scanner(System.in); // like that it can receive data by user

        //EX:
        // enter your name
        System.out.println("please enter your name");
        String names = sc.next(); // you can use with all types of variables
        System.out.println("hi, welcome back MR " + names);

        // list
        ArrayList<String> list = new ArrayList<>();

        String fake = "it's joke";
        list.add(fake);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)); // this way we can read a list
        }

        // multidimensional arrays, this is like have 2 arrays into the same array
        int[] oneDimensionalArray = {1,2,3,4,5}; // this is the array we all know
        // this is the new array
        int[][] multiDimensionalArray = {{1,2,3,4,5}, {3,2,5,1}, {3,2,1,5}};

        // we have 3 arrays different but into the same , if we would want to run one specific
        // it would be like that
        System.out.println(multiDimensionalArray[2][0]); // in terminal we see number one of
        // 3rd array, in the 1st [] you choose the array & the 2nd [] you pick the index of it
        String[][] multiDimensionalStringArray= {{"pera", "uva", "apple"}, {"pineapple", "grape"}};

        System.out.println(multiDimensionalStringArray[1][0]);

        // this work like that


    }
}
