package AdvancedObjectOrientedDesign.thuchanh.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        System.out.println(chicken.makeSound());
        System.out.println(tiger.toString());
    }
}
