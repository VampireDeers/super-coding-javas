package exercise.chapter_52;

public class StringNullThrowTest {

    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            throw new CustomException("CustomException이 발생했습니다.");
        }
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

