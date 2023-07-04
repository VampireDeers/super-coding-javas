package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {

    public static void main(String[] args){
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test2.txt");

            int i = 10;
            int data = 100 / i;

            String str = null;
            System.out.println(str.toUpperCase());

            int index = 10;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);

        }
        catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수가 없습니다.");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("최종 Excepiton 필터에 걸렸습니다.");
            e.printStackTrace();
        }
//        catch (ArithmeticException | NullPointerException e){
//            System.out.println("Arthimetic Exception 또는 NullPointException이 발생했습니다.");
//            e.printStackTrace();
//        }
//        catch ( e){
//            System.out.println("NullPointException이 발생했습니다.");
//            e.printStackTrace();
//        }
        System.out.println("메인 메소드가 종료됩니다.");
    }
}
