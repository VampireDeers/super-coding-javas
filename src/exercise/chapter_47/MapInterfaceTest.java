package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

    public static void main(String[] args){
        // Map 정의
        Map<String, Integer> fruitMap = new HashMap<>();

        // Map 에 데이터 들을 넣음
        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        System.out.println("fruitMap :" + fruitMap);

        // Get(Key)
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("사과 갯수: " + appleCount);
        System.out.println("바나나 갯수: " + bananaCount);

        // conatains(Key)
        Boolean isApple =  fruitMap.containsKey("Apple");
        Boolean isMango =  fruitMap.containsKey("Mango");

        System.out.println("Apple 있는지: " + isApple);
        System.out.println("Mango 있는지: " + isMango);

        // remove(key)
        fruitMap.remove("Apple");
        System.out.println("fruitMap :" + fruitMap);

        // size
        System.out.println("fruitMap 사이즈:" + fruitMap.size());

        // KeySet()
        System.out.println(fruitMap.keySet());
    }
}
