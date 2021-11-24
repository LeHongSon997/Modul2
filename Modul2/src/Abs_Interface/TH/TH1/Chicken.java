package Abs_Interface.TH.TH1;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuc ta cuc tac";
    }

    @Override
    public String howtoEat() {
        return "How to eat: shark";
    }
}
