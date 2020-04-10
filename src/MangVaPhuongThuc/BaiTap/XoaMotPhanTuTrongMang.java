package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class XoaMotPhanTuTrongMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("nhap so muon xoa:");
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                b += i;
            }
        }
        System.out.println("gia tri nhap vao o vi tri: " + (b + 1));
        System.out.println("mang sau khi xoa la:");
        for (int i = b; i < array.length; i++) {
            array[i] = array[i + 1];
            if (i == array.length - 2) {
                array[array.length-1] = 0;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
