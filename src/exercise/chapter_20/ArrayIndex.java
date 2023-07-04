package exercise.chapter_20;

import java.util.Arrays;

public class ArrayIndex {

    public static void main(String[] args){
        // index get
        // {90, 87, 88, 75, 99, 65}

        int[] studentScores = {90, 87, 88, 75, 99, 65};
        int score1 = studentScores[0];
        System.out.println(score1);

        studentScores[2] = 93;
        System.out.println(Arrays.toString(studentScores));

        // Error
        int score6 = studentScores[-1];
        System.out.println(score6);

    }
}
