package com.pruebas;
public class CalculadoraSimple {

    public static String calcular(double a, double b, char operador) {
        return switch (operador) {
            case '+' -> String.valueOf(a + b);
            case '-' -> String.valueOf(a - b);
            case '*' -> String.valueOf(a * b);
            case '/' -> {
                if (b == 0) {
                    yield "Error: División/0";
                }
                yield String.valueOf(a / b);
            }
            default -> "Error: Operador inválido";
        };
    }
}

