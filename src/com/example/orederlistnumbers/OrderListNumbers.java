package com.example.orederlistnumbers;
import java.util.Arrays;
import java.util.stream.IntStream;


public class OrderListNumbers {
    public static void main(String[] args){
        int[] numbersArray = {10, 9, 5, 340, 42 , 1, 13, 0};
        int valorMayor = numbersArray[0];
        int valorMenor = numbersArray[0];
        int num = 0;

        for(int n = 0; n < numbersArray.length; n++){
            for(int m = n + 1; m < numbersArray.length; m++){
                if(numbersArray[n] > numbersArray[m]){
                    num = numbersArray[n];
                    numbersArray[n] = numbersArray[m];
                    numbersArray[m] = num;
                }
            }
        }

        System.out.println("La lista ordenada ascendente es: ");
        for (int n = 0; n < numbersArray.length; n++) {
            System.out.print(numbersArray[n] + " ");
        }
        System.out.println("La lista ordenada descendente es: ");
        for (int n = numbersArray.length - 1; n > 0; n--) {
            System.out.print(numbersArray[n] + " ");
        }
    }
}
