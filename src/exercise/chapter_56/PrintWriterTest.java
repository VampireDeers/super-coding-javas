package exercise.chapter_56;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args){

        // 기존 FileWriter
        String filename = "src/exercise/chapter_56/output_print.txt"; // 출력할 파일의 이름

        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write("FileWriter를 사용한 예시입니다.\n");

            int number = 42;
            String formattedNumber = String.format("이 메서드는 형식화된 문자열을 출력합니다. 숫자: %d\n", number);
            fileWriter.write(formattedNumber);

            double value = 3.14;
            String formattedValue = String.format("format() 메서드도 형식화된 문자열을 출력할 수 있습니다. 값: %.2f\n", value);
            fileWriter.write(formattedValue);

        } catch (IOException e) {
            System.out.println("파일을 쓰는 도중 오류가 발생했습니다: " + e.getMessage());
        }


        filename = "src/exercise/chapter_56/output_print2.txt";

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(filename))) {
            printWriter.println("FileWriter를 사용한 예시입니다.");

            int number = 42;
            printWriter.printf("이 메서드는 형식화된 문자열을 출력합니다. 숫자: %d\n", number);

            double value = 3.14;
            printWriter.printf("format() 메서드도 형식화된 문자열을 출력할 수 있습니다. 값: %.2f\n", value);

        } catch (IOException e) {
            System.out.println("파일을 쓰는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
