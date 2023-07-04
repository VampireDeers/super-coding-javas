package exercise.chapter_52;

import java.util.Optional;

public class OptionalThrowTest {

    public static void main(String[] args){
        String str = null;
        Optional<String> stringOptional = Optional.ofNullable(str);

        int length = stringOptional.orElseThrow( () -> { throw new CustomException("CustomException이 발생했습니다."); } )
                                   .length();

        System.out.println(length);
    }
}
