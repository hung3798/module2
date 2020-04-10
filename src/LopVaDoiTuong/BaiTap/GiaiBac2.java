package LopVaDoiTuong.BaiTap;

import java.util.Scanner;

public class GiaiBac2 {
    public static void main(String[] args) {
        System.out.println("Ban dang muon giai phuong trinh bac hai");
        System.out.println("Ban can nhap he so a, b, c (ax2+bx=c)");
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("nhap a:");
        a = scanner.nextDouble();
        System.out.println("nhap b:");
        b = scanner.nextDouble();
        System.out.println("nhap c:");
        c = scanner.nextDouble();
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2(a, b, c);
        System.out.println( phuongTrinhBac2.ketQua());
    }
}
