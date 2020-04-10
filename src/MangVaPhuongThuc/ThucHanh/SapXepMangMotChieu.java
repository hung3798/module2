package MangVaPhuongThuc.ThucHanh;
public class SapXepMangMotChieu {
    public static void main(String[] args) {
        int[] a = {1,9,3,2,7,6,4,5,8};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                //xếp theo thứ tự tăng dần ở đây ta dùng dấu lớn hơn
                //nếu xếp theo thứ tự giảm dần thì ta để dấu bé hơn
                if(a[i] > a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        for (int x: a
             ) {
            System.out.println(x);
        }
    }
}
