package LopVaDoiTuong.BaiTap;

public class PhuongTrinhBac2 {
    private double a,b,c;

    public PhuongTrinhBac2() {
    }

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double nghiemKep() {
        double nghiem = (-this.b) / (2 * this.a);
        return nghiem;
    }
    public double getDelta() {
        double delta = (this.b * this.b) - 4 * this.a * this.c;
        return delta;
    }

    public String ketQua() {
        if (this.getDelta() < 0) {
            return "phuong trinh vo nghiem";
        }
        if (this.getDelta() == 0) {
            String ketQuaKep = "phuong trinh co nghiem kep la: " + this.nghiemKep();
            return ketQuaKep;
        } else {
            double x1 = (-(this.b) + Math.pow(this.getDelta(), 0.5)) / (2 * this.a);
            double x2 = (-(this.b) - Math.pow(this.getDelta(), 0.5)) / (2 * this.a);
            String ketQua2 = "ket qua la x1= " + x1 + " x2= " + x2;
            return ketQua2;
        }
    }
}
