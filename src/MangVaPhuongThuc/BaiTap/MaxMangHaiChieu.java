package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class MaxMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x va y la toa do cua mang hai chieu");
        System.out.println("nhap x:");
        int x = scanner.nextInt();
        System.out.println("nhap y: ");
        int y = scanner.nextInt();
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("nhap gia tri tai array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        int maxArray = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxArray < array[i][j]) {
                    maxArray = array[i][j];
                }
            }
        }
        System.out.println("max array is: " + maxArray);

    }
}
