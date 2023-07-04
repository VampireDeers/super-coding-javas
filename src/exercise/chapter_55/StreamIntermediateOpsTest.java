package exercise.chapter_55;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest {

    public static void main(String[] args){
        // List ( 미리 복사해오기 )
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        // filter: fruit 이름의 길이가 6 이상인 과일만 선택
        fruits.stream()
              .filter( (fruit) -> fruit.length() >= 6 )
              .forEach( (fruit) -> System.out.println("Filter 적용: " + fruit) );

        // distinct: 중복된 과일 제거
        List<String> fruitList = fruits.stream()
                                        .distinct()
                                        .collect(Collectors.toList());

        System.out.println("Distinct 적용 전:  " + fruits);
        System.out.println("Distinct 적용 후:  " + fruitList);


        // map: 과일 이름을 대문자로 변환
        List<String> fruitListMap = fruits.stream()
                                          .map((fruit) -> fruit.toUpperCase() )
                                          .collect(Collectors.toList());

        List<Integer> fruitListMap2 = fruits.stream()
                                          .map((fruit) -> fruit.length() )
                                          .collect(Collectors.toList());

        System.out.println("Map 이후: " + fruitListMap2);

        // limit: 처음 3개의 과일만 선택
        List<String> fruitList3 = fruits.stream().limit(3).collect(Collectors.toList());
        System.out.println("limit 적용 후 : " + fruitList3);

        // skip: 처음 3개의 과일을 제외한 나머지 과일 선택
        List<String> fruitList4 = fruits.stream().skip(3).collect(Collectors.toList());
        System.out.println("Skip 적용 후 : " + fruitList4);

        // sorted: 과일을 알파벳 순으로 정렬
        List<String> fruitList5 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("알파벳순: "+ fruitList5);

        // sorted: String 길이 짧은순 으로 정렬
        List<String> fruitList6 = fruits.stream().sorted( (fruit1, fruit2) -> fruit1.length() - fruit2.length() ).collect(Collectors.toList());
        System.out.println("String 길이 짧은 순: " +  fruitList6);

    }
}
