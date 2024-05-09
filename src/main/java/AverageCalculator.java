import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[3];

        for (int i = 0; i < 3; i++) {
           System.out.println("Introduzca el número " + (i+1));
           numbers[i] = sc.nextDouble();
        }

        double result = calculateAverage(numbers);

       System.out.println("El resultado de la media es: " + result);

    }

    public static double calculateAverage (double[] numbers) {

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }


}
