package exercise.chapter_54;

@FunctionalInterface
public interface GenericLambda<T> {
    T calculate(T t);
}
