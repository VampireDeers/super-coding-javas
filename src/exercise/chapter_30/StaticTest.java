package exercise.chapter_30;

public class StaticTest {

    public static void main(String[] args){
        // 클래스 변수
        int num = Student.getSerialNum();
        String city = Student.city;

        System.out.println(num);
        System.out.println(city);

        Student.setSerialNum(10);

        // 4명 만들어보기
        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Tom", "Male");
        Student student3 = new Student("Taylor", "Female");
        Student student4 = new Student("Mike", "Male");

        int num4 = Student.getSerialNum();
        System.out.println(num4);

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();

    }
}
