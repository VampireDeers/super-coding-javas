package exercise.chapter_55;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

    public static void main(String[] args){
        // List
        List<TravelCustomer> customers = new ArrayList<>();
        customers.add(new TravelCustomer("아이유", 29, 200000));
        customers.add(new TravelCustomer("박보검", 28, 180000));
        customers.add(new TravelCustomer("송중기", 36, 250000));
        customers.add(new TravelCustomer("김태리", 32, 220000));
        customers.add(new TravelCustomer("전정국", 24, 190000));


        // 1. 고객 명단 이름, 추가된 순서로 출력
        customers.stream()
                .map( (customer) -> customer.getName() )
                .forEach( (name) -> System.out.println(name) );

        // 2. 총 고객들의 여행 비용 계산
        long total = customers.stream()
                              .map( (customer) -> customer.getPrice() )
                              .mapToInt( i -> i )
                              .sum();
        System.out.println("total 비용: "+ total);
    }
}
