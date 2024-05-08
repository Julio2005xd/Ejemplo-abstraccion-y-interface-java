//Julio Cesar Hernández Monroy 8/05/24
//Programa que a traves de las interfaces crea una calculadora funcional

package com.mycompany.ejemploimplementacion;

public interface Operaciones {
    int calcular(int num1, int num2);

    default void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    static Operaciones obtenerOperacion(String tipo) {
        switch (tipo) {
            case "suma":
                return (num1, num2) -> num1 + num2;
            case "resta":
                return (num1, num2) -> num1 - num2;
            case "multiplicacion":
                return (num1, num2) -> num1 * num2;
            case "division":
                return (num1, num2) -> {
                    if (num2 == 0) {
                        throw new IllegalArgumentException("No se puede dividir por cero.");
                    }
                    return num1 / num2;
                };
            case "Suma":
                return (num1, num2) -> num1 + num2;
            case "Resta":
                return (num1, num2) -> num1 - num2;
            case "Multiplicacion":
                return (num1, num2) -> num1 * num2;
            case "Division":
                return (num1, num2) -> {
                    if (num2 == 0) {
                        throw new IllegalArgumentException("No se puede dividir por cero.");
                    }
                    return num1 / num2;
                };
            default:
                    throw new IllegalArgumentException("Operacion no soportada.");
        }
    }
}