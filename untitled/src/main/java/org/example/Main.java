package org.example;
import java.util.Scanner;
/*Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
        El valor acumulado de todos los elementos del vector.
        El valor aumulado de los elementos del vector que sean mayores a 36.
        Cantidad de valores mayores r acumulado de los elea 50.*/
public class Main {
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("ingrese el valor: ");
            numeros [i] = objread.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma = suma + numeros [i];
        }
        System.out.println("la suma de todos los elementos del vector es: " + suma);
        for (int i = 0; i < numeros.length; i++){}
}

