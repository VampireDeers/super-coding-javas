package exercise.chapter_56;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args){
        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 입력해주세요!");
        String name = scanner.nextLine();

        System.out.println("직업을 입력해주세요!");
        String job = scanner.nextLine();

        System.out.println("나이를 입력해주세요!");
        int age = scanner.nextInt();

        System.out.printf("이름: %s, 직업: %s, 나이: %d\n", name, job, age);

    }
}
