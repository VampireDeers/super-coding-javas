package exercise.chapter_58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C004", "윈터"));

        // Q) StringUtils의 isLongName static 메소드를 이용하여 긴 이름의 손님들 이름을 출력
        customers.stream()
                 .map(customer -> customer.name)
                .filter(StringUtils::isLongName)
//                .forEach(name -> System.out.println(name))
                .forEach(System.out::println);

        List<String> customerNames = Arrays.asList(
                "이순신",
                "민지",
                "오해원",
                "아이유"
        );

        // Q) 손님들 이름을 가지고, 새로운 Customer List를 만들어라.
        List<Customer> customerList = customerNames.stream()
//                                                   .map(name -> new Customer(name))
                                                   .map(Customer::new)
                                                   .collect(Collectors.toList());

        System.out.println("customerList: " + customerList);
    }
}
