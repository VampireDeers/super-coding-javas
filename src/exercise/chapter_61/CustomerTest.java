package exercise.chapter_61;

public class CustomerTest {

    public static void main(String[] args){
        GoldCustomer customer = new GoldCustomer("이순신");

        long price = customer.calculatePrice(100);
        System.out.println("price: " + price);
    }
}
