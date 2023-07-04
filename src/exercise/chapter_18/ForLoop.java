package exercise.chapter_18;

public class ForLoop {

    public static void main(String[] args){
        // 1 ~ 10까지 다 더할건데, for-loop
        int sum = 0;

        int num = 1;
        for(; num <= 10;){
            sum += num;
            num++;
        }
        System.out.printf("1~10까지 더한 수는 %d 입니다.", sum);
    }
}
