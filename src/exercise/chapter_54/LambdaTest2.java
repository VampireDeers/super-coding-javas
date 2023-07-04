package exercise.chapter_54;

public class LambdaTest2 {

    public static void main(String[] args){
        MultipleNum multipleNum = num -> num * 1;

        int i = 100;

        StringNum stringNum2 = (str, num) -> {
            System.out.println("i: " + i);
            for(int i1 = 0; i1 < num; i1++){
                System.out.println("stringNum2: " + str);
            }
        };
    }
}
