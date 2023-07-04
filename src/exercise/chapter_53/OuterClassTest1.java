package exercise.chapter_53;

public class OuterClassTest1 {

    public static void main(String[] args){
        // 일반 중첩 클래스
        OuterClass outerClass = new OuterClass(20);

        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass(10);
        innerClass1.display();

        // 정적 중첩클래스
        OuterStaticClass outerStaticClass = new OuterStaticClass(10);
        OuterStaticClass.InnerClass innerClass2 = new OuterStaticClass.InnerClass(20);

        innerClass2.display();
    }
}
