package exercise.chapter_54;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {

    public static void main(String[] args){
        String str = null;

        Optional<String> stringOptional = Optional.ofNullable(str);
//        Supplier<String> stringSupplier =;

        String str2 = stringOptional.orElseThrow( () -> { throw  new CustomException("customExcpetiob 입니다"); }  )
                                    .toUpperCase();
        System.out.println(str2);
    }
}
