package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("input element array at index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("min in array is: " + min);
    }
}
