package MangVaPhuongThuc.BaiTap;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4,5,6,7,8,9,10};
        int[] array2 = {5, 6, 7, 9, 8,9,10,11,12,113};
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length, j = 0; i < array3.length; i++, j++) {
            array3[i] = array2[j];
        }
        for (int a: array3) {
            System.out.println(a);
        }
    }
}
