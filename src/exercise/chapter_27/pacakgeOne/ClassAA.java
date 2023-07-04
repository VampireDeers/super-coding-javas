package exercise.chapter_27.pacakgeOne;

public class ClassAA {

    void testPublic(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();
    }

    void testPrivate(ClassA classA){
//        String str = classA.privateStr;
//        classA.methodPrivate();
    }

    void testDefault(ClassA classA){
        String str = classA.defaultStr;
        classA.methodDefault();
    }
}
