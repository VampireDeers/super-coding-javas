package exercise.chapter_41;

public class JvmTest {

    public static void main(String[] args){

        int myInt = 5;
        final long MY_LONG = 5L;
        Customer customer = new Customer("장민철");
        int[] intArr = new int[5];
        String str1 = "Hello World";
        String str2 = new String("Hello World");
        customer = null;

        myMethod(myInt);

        // 종료
    }
    static void myMethod(int param){
        int myInt2 = param;
        Customer customer2 = new Customer("안유진");
    }
}
