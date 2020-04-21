package CaseStudy.Model;

public  abstract class Service {
    private String nameService = "villa";

    private double areaUse = 550;

    private double rentExpenses = 1000;

    private int maxPeople = 7;

    private String typeRent = "day";

    public Service(String nameService, double areaUse, double rentExpenses, int maxPeople, String typeRent) {
        this.nameService = nameService;
        this.areaUse = areaUse;
        this.rentExpenses = rentExpenses;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public Service() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentExpenses() {
        return rentExpenses;
    }

    public void setRentExpenses(double rentExpenses) {
        this.rentExpenses = rentExpenses;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInformation();

    public void useAccompaniedService() {

    }
}
