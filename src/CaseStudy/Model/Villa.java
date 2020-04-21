package CaseStudy.Model;

public class Villa extends Service {
    private String roomStandard = "vip";
    private String convenient = "free lunch";
    private double poolArea = 120;
    private int numberFloor = 3;

    public Villa(String nameService, double areaUse, double rentExpenses, int maxPeople, String typeRent, String roomStandard, String convenient, double poolArea, int numberFloor) {
        super(nameService, areaUse, rentExpenses, maxPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String roomStandard, String convenient, double poolArea, int numberFloor) {
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String nameService, double areaUse, double rentExpenses, int maxPeople, String typeRent) {
        super(nameService, areaUse, rentExpenses, maxPeople, typeRent);
    }

    public Villa() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInformation() {
        return "this is villa";
    }
}
