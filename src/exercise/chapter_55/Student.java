package exercise.chapter_55;


public class Student {
    // 속성 (1) 학교 정보
    private int schoolYear; // 몇 학년
    private int classroomNumber; // 몇 반
    private int studentNumber; // 학번

    // 속성 (2) 학생 개인정보
    private String name; // 이름 // 단축키 Ctrl + 마우스
    private String gender; // 성별

    private int score;

    // 행위
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    Student(){
        this("unknown", "unknown");
    }
    Student(String name, String gender){
        this(name, gender, 5, 10 , 0, 0);
    }

    Student(String name, String gender, int score){
        this(name, gender, 5, 10 , 0, score);
    }
    Student(String name, String gender, int schoolYear, int classroomNumber, int studentNumber, int score){
        this.name = name;
        this.gender = gender;
        this.schoolYear = schoolYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.score = score;
    }
}
