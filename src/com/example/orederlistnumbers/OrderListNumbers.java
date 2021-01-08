package com.example.orederlistnumbers;
import java.util.Arrays;

public class OrderListNumbers {
    public static void main(String[] args){
        int[] numbersArray = {10, 9, 5, 340, 42 , 1, 13, 0};

        System.out.println("La lista en desorden es: " + Arrays.toString(numbersArray) + '\n');
        System.out.println("La lista ordenada es: " );
        for(int i = 0; i < numbersArray.length; i++){
            for(int j = 0; j < numbersArray.length-i-1; j ++){
                if(numbersArray[j] < numbersArray[j + 1]){
                    int newNumbersArray = numbersArray[j];
                    numbersArray[j+1] = numbersArray[j];
                    numbersArray[j] = newNumbersArray;
                    System.out.println(Arrays.toString(numbersArray));
                }
            }
        }
    }
}
