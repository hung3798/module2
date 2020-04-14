package AdvancedObjectOrientedDesign.thuchanh.Animal;

public class Chicken extends Animal implements Edible {
    private String name = "Ga rung";

    public Chicken() {
    }

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public String howToEat() {
        return "cat tiet ham canh chua";
    }

    @Override
    public String makeSound() {
        return "quac quac";
    }

    @Override
    public String toString() {
        return "toi la loai ga: " + this.name
                + "\ncach de an toi la: " + this.howToEat()
                +"\ntoi co the keu: " + this.makeSound();
    }

}
