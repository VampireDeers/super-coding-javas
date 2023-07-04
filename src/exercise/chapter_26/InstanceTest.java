package exercise.chapter_26;

public class InstanceTest {

    public static void main(String[] args){
        //
        Student student1 = new Student("School", 1, 3, 20, "Bob", "Male");
        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.studentNumber);

        Student student2 = new Student("School", 1, 3, 15, "Alice", "Female");
        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.studentNumber);

        Student student3 = new Student();
        System.out.println(student3.name);

        Student student4 = new Student();

        Teacher teacher = new Teacher("Tom", "Female", "korean", "AB001");

        System.out.println(teacher.name);
//        System.out.println(teacher.subject);
        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectName);
        System.out.println(teacher.subject.subjectCode);
    }
}
