package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7,8,5,3,2,3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = scanner.nextInt();
        System.out.println("enter index: ");
        int index = scanner.nextInt();
        if (index <= 1 || index >= array.length - 1) {
            for (int a : array) {
                System.out.println(a);
            }
        } else {
            array[index] = x;
            for (int i = 0; i < array.length; i++) {
                if (i < index) {
                    continue;
                }
                if (i == array.length-1) {
                    break;
                }
                array[i + 1] = array[i];

            }
        }
        for (int b: array) {
            System.out.println(b);
        }
    }
}
