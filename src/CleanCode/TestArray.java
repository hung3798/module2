package CleanCode;

import java.util.Scanner;

//nhập một mảng số nguyên sau đó tính tổng mảng dó, in ra tổng, in ra mảng số nguyên đó
public class TestArray {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        inputArray(arrayInt);
        int b = getSum(arrayInt);
        soutArray(arrayInt, b);
    }

    private static void soutArray(int[] arrayInt, int b) {
        System.out.println("sum:" + b);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }

    private static int getSum(int[] arrayInt) {
        int b = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            b += arrayInt[i];
        }
        return b;
    }

    private static void inputArray(int[] arrayInt) {
        System.out.println("input array:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = scanner.nextInt();
        }
    }
}
