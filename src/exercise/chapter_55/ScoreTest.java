package exercise.chapter_55;

import java.util.ArrayList;
import java.util.List;

public class ScoreTest {
    public static void main(String[] args){
        // List 제공
        List<Student> students = new ArrayList<>();

        students.add(new Student("아이유", "여자", 95));
        students.add(new Student("카리나", "여자", 100));
        students.add(new Student("박보검", "남자", 92));
        students.add(new Student("송중기", "남자", 90));
        students.add(new Student("김태리", "여자", 85));
        students.add(new Student("전정국", "남자", 88));
        students.add(new Student("방탄소년단", "남자", 70));
        students.add(new Student("이지은", "여자", 63));
        students.add(new Student("윤아", "여자", 68));
        students.add(new Student("하정우", "남자", 75));
        students.add(new Student("공유", "남자", 80));

        // 1. 90점 넘는 학생들 이름 구하기
        students.stream()
                .filter((student -> student.getScore() > 90))
                .map( (student -> student.getName()))
                .forEach(name -> System.out.println(name));

        // 2. 중위값 구하기
        long size = students.stream().count();
        int medium = students.stream()
                             .map( student -> student.getScore() )
                             .sorted()
                             .skip( size / 2 )
                             .findFirst()
                             .orElseGet( () -> 0 );
        System.out.println("medium: " + medium);
    }
}
