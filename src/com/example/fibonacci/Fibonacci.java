package com.example.fibonacci;
import java.util.Scanner;

//import com.sun.tools.javac.Main;

//superclass
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

//subclasses
class Pig extends Animal {
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound(){
        System.out.println("The dog barks: wao, waoo");
    }
}
//subclass (child)
public class Fibonacci extends Vehicle{
    int fibonacciNumber = 5;
    private String name;
    private String modelName = "Mustang";

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    public Fibonacci(int number) {
        fibonacciNumber = number;
    }
    //methods/functions
    static void myMethod() {
        System.out.println("I get married");
    }

    public void myPublicMehothd(){
        System.out.println("Public method");
    }

    public static void main(String[] args){
        Fibonacci myObj = new Fibonacci(30);

        Scanner myOb = new Scanner(System.in);
        System.out.println("Ingresa el nombre de usuario");
        String userName = myOb.nextLine();
        System.out.println("El nombre de usuario es: " + userName);

        int fibonacci(int n){
            //System.out.println("Ingresa el numero fibonacci");
            if(n > 1){
                return fibonacci(n-1) + fibonacci(n+1);
            }
            else if (n == 1){
                return 1;
            }
            else if(n == 0){
                return 0;
            }
        }

        //call the subclasses inherited form superclass Animal
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

        myObj.fibonacciNumber = 25;
        System.out.println(myObj.fibonacciNumber);
        myObj.myPublicMehothd();
        myObj.setName("Johny");
        System.out.println(myObj.getName());
        //myMethod();
        myObj.honk();
        System.out.println(myObj.brand + " " + myObj.modelName);
        
    }

}

//superclass (parent)
class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuu, tuut");

    }
}
