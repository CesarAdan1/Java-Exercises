package com.example.evaluatecharacter;
import java.util.Locale;
import java.util.Scanner;

public class EvaluateCharacter {
    public static void main(String[] args){
        System.out.println("Teclea un caracter válido");
        Scanner character = new Scanner(System.in);
        var input = character.nextLine();

        if (input == input.toLowerCase()) {
            System.out.println("El caracter introducido es minúscula");
        } else if (input == input.toUpperCase()){
            System.out.println("El caracter introducido es Mayúscula");
        } else if (input == input){
            System.out.println("El caracter introducido es un número");
        } else if(input == input){
            System.out.println("El caracter introducido es un caracter especial");
        } else {
            System.out.println("El caracter introducido no es válido");
        }
    }
}
