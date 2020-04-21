package CaseStudy.Model;

public class House extends Service {
    private String roomStandard = "vip";
    private String convenient = "free lunch";
    private int numberFloor = 3;

    public House(String nameService, double areaUse, double rentExpenses, int maxPeople, String typeRent) {
        super(nameService, areaUse, rentExpenses, maxPeople, typeRent);
    }

    public House() {
    }

    public House(String nameService, double areaUse, double rentExpenses, int maxPeople, String typeRent, String roomStandard, String convenient, int numberFloor) {
        super(nameService, areaUse, rentExpenses, maxPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.numberFloor = numberFloor;
    }

    public House(String roomStandard, String convenient, int numberFloor) {
        this.roomStandard = roomStandard;
        this.convenient = convenient;
        this.numberFloor = numberFloor;
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

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public void useAccompaniedService() {
        super.useAccompaniedService();
    }

    @Override
    public String showInformation() {
        return "this is house";
    }
}
