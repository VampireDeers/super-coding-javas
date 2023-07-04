package exercise.chapter_61.meta;

public class MyClass {

    @Repeat(value = 20)
    public void printMessage() {
        System.out.println("Hello, world!");
    }

    @Repeat(value = 10)
    public void foo() {
        System.out.println("This is another method.");
    }

}
