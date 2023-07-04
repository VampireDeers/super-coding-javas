package exercise.chapter_61;

public class GoldCustomer extends Customer {

    double discountRatio;

    public GoldCustomer(String name) {
        this.customerID = "Customer" + Customer.serialNum++;
        this.customerName = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.bonusRatio = 0.03;
        this.discountRatio = 0.03;
    }

    @Override
    @Deprecated
    public int calculatePrice(int price) {
        price -= price * discountRatio;
        this.bonusPoint += price * bonusRatio;
        return price;
    }
}
