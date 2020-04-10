package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        double[][] matrix = new double[7][7];
        double total = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter " + matrix.length + " row and " + matrix[0].length + " column: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = scanner.nextInt();
//            }
//        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (double) (Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.println(total);
    }
}
