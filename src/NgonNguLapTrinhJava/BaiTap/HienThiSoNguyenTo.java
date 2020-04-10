package NgonNguLapTrinhJava.BaiTap;

public class HienThiSoNguyenTo {
    static boolean isSNT(int number) {
        if (number < 2){
            return false;
        }

        for (int i = 2; i < (number - 1); i++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (isSNT(i)) {
                System.out.println(i);
            }
        }
    }
}
