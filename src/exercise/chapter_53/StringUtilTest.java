package exercise.chapter_53;

public class StringUtilTest {

    public static void main(String[] args) {
        String str = "Hello, World!";
        char target = 'o';

        // 1. 문자열이 비어 있는지 확인
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println("str이 비어있는지?: " + isEmpty);

        // 2. 문자열을 반대로 뒤집기
        String str2 = StringUtils.reverse(str);
        System.out.println("뒤짚은 문자열: " + str2);

        // 3. 주어진 문자열에서 특정 문자의 개수 세기
        int countChar = StringUtils.CharChecker.countChar(str, target);
        System.out.println("'o'는 몇개가 있을까?: " + countChar);

        // 4. 주어진 문자열에 특정 문자가 있는지 확인
        boolean containChar = StringUtils.CharChecker.containsChar(str, target);
        System.out.println("'o'가 있는지 확인: " + containChar);

    }
}
