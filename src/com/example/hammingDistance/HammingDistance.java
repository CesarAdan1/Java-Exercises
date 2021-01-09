package com.example.hammingDistance;
import java.util.Scanner;

public class HammingDistance {

    static int hamming(int V1, int V2){
        int x = V1 ^ V2;
        int dist = 0;

        while(x > 0){
            dist += x & 1;
            x >>= 1;
        }

        return dist;
    }

    public static void main(String[] args){
        HammingDistance val = new HammingDistance();
        Scanner input = new Scanner(System.in);

        int vector1;
        int vector2;

        System.out.println("Ingresa el vector binario 1: ");
        vector1 = input.nextInt();

        System.out.println("Ingresa el vector binario 1: ");
        vector2 = input.nextInt();

        System.out.println(hamming(vector1, vector2));
    }
}
