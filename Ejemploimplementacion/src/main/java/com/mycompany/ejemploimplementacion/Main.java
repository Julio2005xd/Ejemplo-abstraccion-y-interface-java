//Julio Cesar Hernández Monroy 8/05/24
//Programa que a traves de las interfaces crea una calculadora funcional
package com.mycompany.ejemploimplementacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora Interactiva");
        System.out.print("Por favor, ingresa la operacion (suma, resta, multiplicacion, division): ");
        String operacion = sc.nextLine();

        System.out.print("Ingresa el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();

        try {
            Operaciones op = Operaciones.obtenerOperacion(operacion);
            int resultado = op.calcular(num1, num2);
            op.mostrarResultado(resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}