package LopVaDoiTuong.BaiTap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private String color = "blue";

    public Fan(int speed, boolean on, String color) {
        this.speed = speed;
        this.on = on;
        this.color = color;
    }

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (!this.on) {
            return "The fan is " + this.color + " and is off";
        } else {
            return "The fan is on, speed: " + this.speed + " and color fan is: " + this.color;
        }
    }
}
