package exercise.chapter_55;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalOpsTest {
    public static void main(String[] args){
        // List ( 미리 복사해오기 )
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        // 1. forEach(): 출력
        fruits.stream().forEach( (fruit) ->  System.out.println("for-each 출력: " + fruit) );

        // 2. collect(): 다른 또는 같은 컬렉션 반환
        Set<String> fruitSet = fruits.stream().collect(Collectors.toSet());
        System.out.println("fruitSet: "+ fruitSet);

        // 3. findFirst(): Stream의 첫번째 값 산출,Optional
        Optional<String> fruitOptional = fruits.stream().findFirst();
        System.out.println("optional fruit: " + fruitOptional.orElseGet(() -> "기본 과일"));

        // List Integers
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        // 4.sum, average
        System.out.println("sum 값은: " + integers.stream().mapToInt((i) -> i).sum() );
        System.out.println("Average 값은: " + integers.stream().mapToInt((i) -> i).average() );

        // 5.count(), max(), min()
        System.out.println("Stream의 길이: " + integers.stream().count());
        System.out.println("Stream의 가장 Max 값: " + integers.stream().mapToInt((i)-> i).max());
        System.out.println("Stream의 가장 min 값: " + integers.stream().mapToInt((i)-> i).min());

        // 6.reduce() 로 소모 값 구하기
        int result = integers.stream().reduce(0, (int1, int2) -> int1 * int2);
        System.out.println("reduce로 구한 값: "+ result);
    }
}
