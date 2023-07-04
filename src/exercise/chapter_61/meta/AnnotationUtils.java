package exercise.chapter_61.meta;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUtils {
    public static void executeMethodsByRepeatAnnotation(Object object) {
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Repeat) {
                    Repeat repeatAnnotation = (Repeat) annotation;
                    int repeatCount = repeatAnnotation.value();

                    for (int i = 0; i < repeatCount; i++) {
                        try {
                            method.invoke(object);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
