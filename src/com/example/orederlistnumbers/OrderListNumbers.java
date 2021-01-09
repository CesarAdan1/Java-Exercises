package com.example.orederlistnumbers;
import java.util.Arrays;
import java.util.stream.IntStream;


public class OrderListNumbers {
    public static void main(String[] args){
        int[] numbersArray = {10, 9, 5, 340, 42 , 1, 13, 0};
        int valorMayor = numbersArray[0];
        int valorMenor = numbersArray[0];
        int listNumbers = numbersArray[0];

       Arrays.sort(numbersArray);

       System.out.println(Arrays.toString(numbersArray));

    }
}
