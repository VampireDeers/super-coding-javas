package exercise.chapter_30;

import exercise.chapter_28.Teacher;

public class Student {
    private static int serialNum = 1;
    static String city = "Seoul";

    // 속성
    String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumber; // 몇 반
    private int studentNumber; // 몇 번

    private int studentID; // student 고유 ID

    // 기본 정보
    private String name;
    private String gender;

    // 정적 메소드
    public static int getSerialNum(){
        return serialNum;
    }
    public static void setSerialNum(int num){
        serialNum = num;
    }

    // 행위
    void study(Teacher teacher, String subjectName){
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    public void printMyInfo(){
        System.out.printf("[Student] schoolName: %s, classYear: %d, classroomNumber: %d" +
                          " studentNumber: %d, studentID: %d, name: %s, gender: %s\n",
                          this.schoolName, this.classYear, this.classroomNumber,
                          this.studentNumber, this.studentID, this.name, this.gender);
    }

    // 생성자
    Student(){
    }
    Student(String name, String gender){
        this("School", 1, 3, -1, name, gender);
    }

    Student(String schoolName, int classYear, int classroomNum, int studentNum, String name, String gender){
        this.studentID = serialNum++;
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumber = classroomNum;
        this.studentNumber = studentNum;
        this.name = name;
        this.gender = gender;
    }

    // getter
    public String getName() {
        return this.name;
    }
}
