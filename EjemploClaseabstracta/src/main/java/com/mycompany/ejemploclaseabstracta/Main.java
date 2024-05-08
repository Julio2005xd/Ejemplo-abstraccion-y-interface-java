// Julio Cesar Hernández Monroy 8/05/24
// Programa que usa abstraccion para simular la alimentacion de un perro y un gato

package com.mycompany.ejemploclaseabstracta;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        System.out.println("Programa para alimentar animales");
        System.out.println("Por favor digite el animal al que quiere alimentar: Perro - Gato");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        if ("Perro".equalsIgnoreCase(entrada) || "perro".equalsIgnoreCase(entrada)){
            perro.makeSound(); 
            perro.eat(); 
        } else if ("Gato".equalsIgnoreCase(entrada) || "gato".equalsIgnoreCase(entrada)){
            gato.makeSound();
            gato.eat();
        } else {
            System.out.println("Animal incorrecto");
        }
    }
}