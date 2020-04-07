package NgonNguLapTrinhJava.ThucHanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu cao: ");
        double height = scanner.nextDouble();
        System.out.println("nhap can nang: ");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("chi so BMI cua ban la: " + bmi);
    }
}
