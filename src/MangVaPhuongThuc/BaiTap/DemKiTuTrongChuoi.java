package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class DemKiTuTrongChuoi {
    public static void main(String[] args) {
        String chuoi = "pham thai hung manh me";
        System.out.println("nhập kí tự bạn muốn đếm: ");
        Scanner scanner = new Scanner(System.in);
        String kiTu = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (kiTu.equals(chuoi.charAt(i))) {
                count++;
            }
        }
        System.out.println("ki tu "+ kiTu +" duoc lap "+count+" lan.");
    }
}
