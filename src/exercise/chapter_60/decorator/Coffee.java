package exercise.chapter_60.decorator;

// Concrete Component
public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
