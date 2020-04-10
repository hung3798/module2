package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int chosse;
        do {
            System.out.println("Menu:\n1. Fahrenheit to Celsius.\n2. Celsius to Fahrenheit.\n0. Exit");
            chosse = scanner.nextInt();
            switch (chosse) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Enter Fahrenheit:");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Celsius: "+ fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celcius:");
                    celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit: "+ celsiusToFahrenheit(celsius));
                    break;
            }
        } while (chosse != 0);
    }
}
