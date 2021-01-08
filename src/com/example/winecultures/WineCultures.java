package com.example.winecultures;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WineCultures {

    static double totalPrice(double precio, int cantidadPedida){
        return precio * cantidadPedida;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int cantidadPedida;
        int option;
        double total;

        String myStr = "La ganancia del productor por el embarque es: " + " " + "$" ;

        while(!exit){
            System.out.println("Ingrese tamaño del Embarque de uvas");
            cantidadPedida = input.nextInt();

            try{
            System.out.println("Escoge una opción");

            System.out.println("1. Tipo A y tamaño 1");
            System.out.println("2. Tipo A y tamaño 2");
            System.out.println("3. Tipo B y tamaño 1");
            System.out.println("4. Tipo B y tamaño 2");
            System.out.println("5. Salir");

            option = input.nextInt();

            switch (option){
                case 1:
                    total = totalPrice(0.20, cantidadPedida);
                    System.out.println(myStr + total);
                    break;
                case 2:
                    total = totalPrice(0.30, cantidadPedida);
                    System.out.println(myStr + total);
                    break;
                case 3:
                    total = totalPrice(0.30, cantidadPedida);
                    System.out.println(myStr + total);
                    break;
                case 4:
                    total = totalPrice(0.50, cantidadPedida);
                    System.out.println(myStr + total);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                input.next();
            }
        }

    }
}
