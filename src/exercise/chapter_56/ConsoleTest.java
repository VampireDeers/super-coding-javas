package exercise.chapter_56;

import java.io.IOException;

public class ConsoleTest {

    public static void main(String[] args){
        // Console System.in
        int i = 0;

        System.out.println("입력값을 넣어주세요.");
        try {
            StringBuilder sb = new StringBuilder();
            while( (i = System.in.read()) != '\n' ){
                sb.append((char) i);
            }
            System.out.println("String 출력: " + sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
