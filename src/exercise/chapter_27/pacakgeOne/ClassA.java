package exercise.chapter_27.pacakgeOne;

public class ClassA {
    // Public
    public String publicStr;

    // private
    private String privateStr;

    // default
    String defaultStr;

    public void methodPublic(){};

    private void methodPrivate(){};

    void methodDefault(){};

    void testPrivate(){
        String str = privateStr;
        methodPrivate();
    }
}
