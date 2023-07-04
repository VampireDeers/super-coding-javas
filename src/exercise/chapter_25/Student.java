package exercise.chapter_25;

public class Student {
    // 속성
    String schoolName;
    int classYear; // 몇 학년
    int classroomNumber; // 몇 반
    int studentNumber; // 몇 번

    // 기본 정보
    String name;
    String gender;

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }
}
