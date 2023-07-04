package exercise.chapter_24;


public class MethodExamples {

    // 일반적인 입력값, 출력값도 있는 경우
    // 둘 다 하나인 경우
    static int toUnicode(char ch){
        return (int) ch;
    }
    //
    static int sumAndMultiplyFour(int a, int b){
        return (a + b) * 4;
    }

    public static void main(String[] args){
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode);

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1, myInt2);
        System.out.println(result);

        String res = sayHello();
        System.out.println(res);

        printHello("printHello");
        printHi();

    }

    // 인자값이 없을 수 있다, 출력값은 있음.
    static String sayHello(){
        return "Hello";
    }
    // 인자값이 있는데, 출력값은 없는거.
    static void printHello(String str){
        System.out.printf("함수 안에서 실행합니다. %s\n", str);
    }
    // 인자값도 없고, 출력값도 없는거.
    static void printHi(){
        System.out.println("Hi");
    }
}
