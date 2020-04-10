package NgonNguLapTrinhJava.BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien can chuyen: ");
        double usd = scanner.nextDouble();
        double vnd = usd * 23756;
        System.out.println("so tien sau khi chuyen la: " + vnd);
    }
}
