package exercise.chapter_60.decorator;

public class Cream extends BeverageDecorator {
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return super.cost() + 0.6;
    }
}
