package exercise.chapter_27;

public class Student {
    // 속성
    private String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumber; // 몇 반
    private int studentNumber; // 몇 번

    // 기본 정보
    private String name;
    private String gender;

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    // 생성자
    Student(){
    }
    Student(String pName, String pGender){
        name = pName;
        gender = pGender;
    }

    Student(String pSchoolName, int pClassYear, int pClassroomNum, int pStudentNum, String pName,String pGender){
        schoolName = pSchoolName;
        classYear = pClassYear;
        classroomNumber = pClassroomNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }

    // getter
    public String getName() {
        return name;
    }
}
