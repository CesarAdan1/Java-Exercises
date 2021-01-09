package com.example.orederlistnumbers;
import java.util.Arrays;
import java.util.stream.IntStream;

public class OrderListNumbers {




    public static void main(String[] args){
        int[] numbersArray = {10, 9, 5, 340, 42 , 1, 13, 0};
        int valorMayor = numbersArray[0];
        int valorMenor = numbersArray[0];
        int listNumbers = numbersArray[0];

        System.out.println("La lista en desorden es: " + String.valueOf(numbersArray) + '\n');
        System.out.println("La lista ordenada es: " );

        for(int i = 0; i < numbersArray.length; i++){
            if(numbersArray[i] > valorMayor){
                valorMayor = numbersArray[i];
            }
        }

        for(int j = 0; j < valorMayor; j++){
            listNumbers = valorMayor;
        }

        for(int i = 0; i < numbersArray.length; i++){
           if(numbersArray[i] < valorMayor){
               valorMenor = numbersArray[i];
           }
        }

        System.out.println(valorMayor);
        System.out.println(valorMenor);

    }
}
