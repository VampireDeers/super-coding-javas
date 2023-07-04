package exercise.chapter_46;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {

    public static void main(String[] args){
        // List 정의
        List<String> fruitList = new ArrayList<>();

        // add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");

        System.out.println("FruitList 요소:" + fruitList);

        // add(intdex, element)
        fruitList.add(3, "Mango");

        System.out.println("FruitList 요소:" + fruitList);

        // remove(index)
        fruitList.remove(3);
        System.out.println("FruitList 요소:" + fruitList);

        // get(Index)
        String myFruit = fruitList.get(3);
        System.out.println("가져온 과일은: " + myFruit);

        // set(Index, Element)
        fruitList.set(1, "PineApple");
        System.out.println("FruitList 요소:" + fruitList);

        // size
        System.out.println("리스트사이즈: " + fruitList.size());

        // isEmpty: 현래 리스트가 비었는지, 안비웠는지 확인
        List<String> fruitList2 = new ArrayList<>();

        System.out.println(fruitList2.isEmpty());
        System.out.println(fruitList.isEmpty());

        // Contains: 리스트에 해당 원소가 있는지 없는지 확인하는 메서드
        System.out.println(fruitList.contains("Kiwi"));
        System.out.println(fruitList.contains("Apple"));

        // IndexOf , Clear
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3));

        fruitList.clear();
        System.out.println("FruitList 요소:" + fruitList);
    }
}
