package com.example.matrrixnxn;
import java.lang.reflect.Array;
import java.util.Scanner;

public class MatrizNxN {
    static void matrixOrder(int n, int numberOfTimes){
       for (int x = 0; x < n; x++){
            for (int y = 0; y < n; y ++){
                int z;
                z = Math.min(Math.min(x, y), Math.min(n - 1 - x, n-1 - y));
                if(x < y) System.out.println((n-2 * z)*(n-2*z) - (x-z) - (y-z) + "\t");
                else System.out.println((n - 2 * z - 2) * (n - 2 * z - 2) + (x-z) + (y-z) + "\t");
            }
        }
    }

    public static void main(String[] args){
        MatrizNxN matrix = new MatrizNxN();
        Scanner numInput = new Scanner(System.in);
        int n;
        int numberOfTimes;

        System.out.println("Introduce la dimesion de la matriz, tendra lo mismo de columnas y filas");
        n = numInput.nextInt();

        System.out.println("Ingresa un número");
        numberOfTimes = numInput.nextInt();

        matrixOrder(n, numberOfTimes);
        if(numberOfTimes == String.valueOf(n).length()){
            System.out.println("El número " +  numberOfTimes + " aparece " + String.valueOf(numberOfTimes).length());
        }
    }
}
