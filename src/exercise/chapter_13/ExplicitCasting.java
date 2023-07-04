package exercise.chapter_13;

public class ExplicitCasting {

    public static void main(String[] args){
        // 더 정밀한 타입 -> 덜 정밀한 타입
//        float myFloat = 5.55f;
//        int myInt = (int) myFloat;
//        System.out.println(myInt);
//
//        // Size 큰 -> Size 작은
//        int myInt2 = 120;
//        byte myByte = (byte) myInt2;
//        System.out.println(myByte);

        // 연산 "+"
        double myDouble1 = 5.5;
        double myDouble2 = 3.7;

        int result = (int) ( myDouble1 + myDouble2 );
        System.out.println(result);
    }
}
