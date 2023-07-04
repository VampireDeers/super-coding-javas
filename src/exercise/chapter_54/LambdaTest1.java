package exercise.chapter_54;



public class LambdaTest1 {

    public static void main(String[] args){

        MultipleNum multipleNum1 = (x) -> x * 1;
        MultipleNum multipleNum2 = (i) -> i * 2;
        MultipleNum multipleNum3 = (x) -> { return x * 3; };
        MultipleNum multipleNum4 = (int myInt) -> {return myInt * 4;};

        System.out.println(multipleNum1.calculate(5));
        System.out.println(multipleNum2.calculate(5));
        System.out.println(multipleNum3.calculate(5));
        System.out.println(multipleNum4.calculate(5));

        StringNum stringNum1 = (x, y) -> System.out.println("stringNum1: " + x);

        StringNum stringNum2 = (x, y) -> {
            for(int i =0; i < y; i++){
                System.out.println("stringNum2: " + x);
            }
        };

        StringNum stringNum3 = (String x,int y) -> {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i < y; i++){
                sb.append(x);
            }
            System.out.println("stringNum3: " +sb.toString());
        };

        stringNum1.printString("Hello", 5);
        stringNum2.printString("Hello", 5);
        stringNum3.printString("Hello", 5);

    }
}
