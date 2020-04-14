package AdvancedObjectOrientedDesign.thuchanh.Animal;

public class Tiger extends Animal implements Edible {
    private String name = "ho van";

    public Tiger() {
    }

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "grum grummmmmmmm";
    }

    @Override
    public String howToEat() {
        return "thit ho gac bep";
    }

    @Override
    public String toString() {
        return "toi la:" + this.name + "\ncach de an toi la: " + this.howToEat()
                + "\ntoi co the keu: " + this.makeSound();
    }
}
