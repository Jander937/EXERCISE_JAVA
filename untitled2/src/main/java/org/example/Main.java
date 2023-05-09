package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
//Desarrollar un programa que permita ingresar un vector de n elementos, ingresar n por teclado. Luego imprimir la suma de todos sus elementos
public class Main {
    public static void main(String[] args) {
        Scanner Boquita = new Scanner(System.in);
      int number1 = 0;
      int number2 = 0;
        System.out.println("Digite el primer Numero");
        number1 = Boquita.nextInt();
        System.out.println("Digite el segundo Numero");
        number2 = Boquita.nextInt();
        if (number1 > 0 && number2 > 0){
            System.out.println("Los dos numeros son Mayores a Cero" + " " + number1 + " " + number2);
        }else{
            if (number1 < 0 && number2 < 0){
                System.out.println("Los 2 numeros son Menores a Cero " + " "+ number1 + " " + number2);
            }else{
                if (number1 > 0){
                    System.out.println("Solo el numero 1 es mayor a Cero" + " " + number1);
                }else{
                    System.out.println("Solo el numero 2 es mayor a Cero " + " " + number2);
                }
            }
        }


    }
}



