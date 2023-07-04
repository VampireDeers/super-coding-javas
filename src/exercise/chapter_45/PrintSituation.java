package exercise.chapter_45;

public class PrintSituation {

    public static void main(String[] args) {
        // 1. 기획: String을 출력하는 프린터 만들어주세요~
        GeneralPrint<String> print = new GeneralPrint();
        print.setMaterial("설계도");

        String material = print.getMaterial();
        print.printMyInfo();

        // 2. 기획: Integer을 출력하는 프린터 만들어주세요~
        GeneralPrint<Integer> print2 = new GeneralPrint<Integer>();
        print2.setMaterial(1235);

        Integer intMaterial = print2.getMaterial();
        print2.printMyInfo();

        // 3. 기획: Boolean을 출력하는 프린터 만들어주세요~
        GeneralPrint<Boolean> print3 = new GeneralPrint<Boolean>();
        print3.setMaterial(true);

        Boolean booleanMaterial = print3.getMaterial();
        print3.printMyInfo();

        GeneralPrint print4 = new GeneralPrint();
        print4.setMaterial("설계도");

        String material4 = (String) print4.getMaterial();
        print4.printMyInfo();
    }
}
