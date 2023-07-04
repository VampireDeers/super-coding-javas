package exercise.chapter_58;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C004", "윈터"));

        Customer myCustomer = new Customer("C001", "이순신");
        // Q) myCustomer와 동일한 객체는 몇 개인지 출력하라.
        long nums = customers.stream()
                             .filter(myCustomer::equals)
                             .count();

        System.out.println("몇 개인지: "+ nums);

        // Q) customers의 각각의 bonusPoint를 얻어라.
        List<Integer> bonusPoints = customers.stream()
                                             .map(Customer::getBonusPoint)
                                             .collect(Collectors.toList());

        System.out.println("bonusPoints: " + bonusPoints);

    }
}
