package com.refactoring;
import java.util.InputMismatchException;
import java.util.Scanner;
import static com.refactoring.CalculadoraRaiz.calcularRaiz;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora de Raíz Cuadrada ===");
        System.out.print("Ingrese un valor para x: ");
        try {
            int valor = scanner.nextInt();
            calcularRaiz(valor);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: La entrada no es un número entero válido.");
        }
    }
}
