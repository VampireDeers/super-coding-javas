package exercise.chapter_40;

public class GolderCustomer extends Customer {

    private double discountRatio;

    static {
        System.out.println("GoldCustomer 클래스가 로딩 됩니다.");
    }

    @Override
    public int calculatePrice(int price) {
       this.bonusPoint += price * bonusPointRatio;
       price -= price * discountRatio;
       return price;
    }

    public GolderCustomer(String name){
        super();
        this.customerID = "Customer" + Customer.serialNums++;
        this.name = name;
        this.customerGrade = "GOLD";
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
        this.bonusPointRatio = 0.03;

    }
}
