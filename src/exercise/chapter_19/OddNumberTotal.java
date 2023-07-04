package exercise.chapter_19;

public class OddNumberTotal {

    public static void main(String[] args){
        int total = 0;

        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
            total += i;
        }
        System.out.printf("0~100까지 홀수를 더한 값은 %d", total);
    }
}
