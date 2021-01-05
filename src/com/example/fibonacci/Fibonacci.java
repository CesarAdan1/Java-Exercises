package com.example.fibonacci;


public class Fibonacci {
    //methods/functions
     String numberTwo;
    static void myMethod() {
        System.out.println("I get married");
    }

    public static void main(String[] args){


        final int myAge = 28;
        final String myName = "Cesar";
        final char a = 44, b = 66, c = 67;
        String hello = "Hello World";
        int number = 24;
        hello = "Hey You!";

        byte nyNum = -128;
        short num = -32768;
        System.out.println(hello + " " + number + " " + myAge);
        float f1 = 353e3f;
        double f2 = 35E3d;
        String[] cars = {"Volvo", "BMW", "Ford"};
        for(String i : cars){
            System.out.println(i);
        }
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        String txt = "ABXASDFDDQPOIWUER123 HEY asdfqwe ASW";
        String texto = "Mi nombre es \"Cesar\" ";


        myMethod();

    }

}

