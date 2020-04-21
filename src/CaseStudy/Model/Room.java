package CaseStudy.Model;

public class Room extends Service {
    private String freeService = "bua sang mien phi";
    @Override
    public String showInformation() {
        return "this is room";
    }
}
