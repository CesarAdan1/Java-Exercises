package com.example.matrrixnxn;
import java.lang.reflect.Array;
import java.util.Scanner;

public class MatrizNxN {
     int z;
    static void matrixOrder(int n, int numberOfTimes){
            //int in =
        int z;
        //int[] appear = new int[];
        int val = 0;

       for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y ++){
                z = Math.min(Math.min(x, y), Math.min(n - 1 - x, n-1 - y));
                if(x < y) System.out.println((n-2 * z)*(n-2*z) - (x-z) - (y-z) + "\t");
                else System.out.println((n - 2 * z - 2) * (n - 2 * z - 2) + (x-z) + (y-z) + "\t");
            }
        }

        if(n == numberOfTimes){
            System.out.println("El numero " + numberOfTimes + " aparece " + n);
        } else{
            System.out.println("El número introducido no aparece en la matriz");
        }
    }

    public static void main(String[] args){
        MatrizNxN matrix = new MatrizNxN();
        Scanner numInput = new Scanner(System.in);
        int n;
        int numberOfTimes;
        int timesIsShown = 0;

        System.out.println("Introduce la dimesion de la matriz, tendra lo mismo de columnas y filas");
        n = numInput.nextInt();

        System.out.println("Ingresa un número");
        numberOfTimes = numInput.nextInt();

        matrixOrder(n, numberOfTimes);
    }
}
