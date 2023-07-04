package exercise.chapter_60.strategy;

public class ReferenceFriendDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
