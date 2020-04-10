package NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class SntNhapVao {
    static boolean isSNT(int number) {
        if (number < 2){
            return false;
        }

        for (int i = 2; i < (number - 1); i++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to can in ra: ");
        int SoLuong = scanner.nextInt();
        int count = 0;
        int number = 0;
        System.out.println("\n\n\n ta co " + SoLuong + " so nguyen to can in ra la:");
        while (count < SoLuong) {
            if (isSNT(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
