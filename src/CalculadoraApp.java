import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            //Mostramos el Menu
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones solicitadas
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { //Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                //Imprimimos un salto de linea antes de romper el ciclo
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            } //Fin try
        } //Fin while
    } //Fin main
    private static void mostrarMenu() {
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacin
                    4. Division
                    5. Salir
                    """);
        System.out.print("Escoge una operacion a realizar");
    }

    //Funciones
    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("Proporciona el valor del operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el valor del operando 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { //Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado suma: " + resultado);
            }
            case 2 -> { //Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado resta: " + resultado);
            }
            case 3 -> { //Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicacion: " + resultado);
            }
            case 4 -> { //Division
                resultado = operando1 / operando2;
                System.out.println("Resultado division: " + resultado);
            }
            default -> {
                System.out.println("Opcion erronea: " + operacion);
            }
        }
    }
} //Fin class
