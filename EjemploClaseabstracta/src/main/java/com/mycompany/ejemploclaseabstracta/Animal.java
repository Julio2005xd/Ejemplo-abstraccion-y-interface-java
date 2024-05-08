// Julio Cesar Hernández Monroy 8/05/24
// Programa que usa abstraccion para simular la alimentacion de un perro y un gato

package com.mycompany.ejemploclaseabstracta;

abstract class Animal {
    
    abstract void makeSound();
    
    void eat() {
        System.out.println("El animal come");
    }
}