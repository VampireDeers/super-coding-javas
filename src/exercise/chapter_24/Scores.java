package exercise.chapter_24;

public class Scores {

    public static void main(String[] args){
        // A class 학생들 점수
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        // B Class 학생 점수
        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        // Average
        double averageAClass = calculateAverage(studentAClass1, studentAClass2,studentAClass3);

        // B class
        double averageBClass = calculateAverage(studentBClass1, studentBClass2, studentBClass3);

        System.out.printf("A 학급의 평균 점수는 %.2f, B 학급 평균은 %.2f\n", averageAClass, averageBClass);
    }

    static double calculateAverage(int studentScore1, int studentScore2, int studentScore3){
        int sumClass = studentScore1 + studentScore2 + studentScore3;
        return sumClass / (double) 3;
    }
}
