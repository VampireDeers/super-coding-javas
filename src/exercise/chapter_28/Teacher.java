package exercise.chapter_28;

public class Teacher {
    // 속성

    private static String subjectCode;
    // 학교 정보
    private String schoolName;

    // 담당 과목
    private Subject subject;

    // 기본 정보
    private String name;
    private String gender;

    // 행위
    void teach(Student student, String subjectName){
        String studentName = student.getName();
        System.out.printf("선생: %s 학생에게 %s 과목을 가르치고 있습니다.\n", studentName, subjectName);
    }

    Teacher() {}
    Teacher(String name, String gender, String subjectName, String subjectCode){
        this.name = name;
        this.gender = gender;

        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectCode(subjectCode);

        this.subject = subject;
    }
    // getter
    public String getName(){
        return name;
    }
}
