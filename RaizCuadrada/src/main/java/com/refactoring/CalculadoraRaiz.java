package com.refactoring;

public class CalculadoraRaiz {
    public static void calcularRaiz(int entrada) {
        try {
            double x = entrada;

            if (x < 0) {
                System.out.println("ERROR: No se puede calcular la raíz de un número negativo.");
                return;
            }

            if (x == 0) {
                System.out.println("Resultado: 0");
                return;
            }

            double resultado = Math.sqrt(x);

            if (resultado % 1 == 0) {
                System.out.println("Resultado: " + (int) resultado);
            } else {
                System.out.println("Resultado: " + resultado);
            }

        } catch (NumberFormatException e) {
            System.out.println("ERROR: Entrada no numérica");
        }
    }
}