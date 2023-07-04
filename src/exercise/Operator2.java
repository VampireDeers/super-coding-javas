package exercise;

public class Operator2 {

    public static void main(String[] args){
        // > , < >=,, <=, ==
        String str1 = "ABC";
        String str2 = "ABC";

        boolean result= str1 == str2;
        // System.out.println(result);

        // && || ! 논리연산자
        boolean condition1 = 5 < 3;
        boolean condition2 = 4 >= 4;

        boolean result2 = !(condition1 || condition2);
        System.out.println(result2);
    }
}
