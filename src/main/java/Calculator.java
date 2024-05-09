import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double firstNumber = sc.nextDouble();

        System.out.println("Introduce el segundo número:");
        double secondNumber = sc.nextDouble();

        System.out.println("Introduzca la operación: ");
        String operation = sc.next();

        double result = Calculate(firstNumber, secondNumber, operation);

        if (result != -1) {
            System.out.println("El resultado de la operación " + operation + " es: " + result);
        }
    }

    public static double Calculate (double firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+":
                return sum(firstNumber, secondNumber);
            case "-":
                return minus(firstNumber, secondNumber);
            case "*":
                return multiply(firstNumber, secondNumber);
            case "/":
                return divide(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException("Operación Desconocida");
        }


    }

    public static double sum (double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public static double minus (double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public static double multiply (double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    public static double divide (double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }
}
