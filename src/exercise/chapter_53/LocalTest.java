package exercise.chapter_53;

public class LocalTest {

    public static void main(String[] args){

        class LocalWalk implements Walkable {
            @Override
            public void walk() {
                System.out.println("LocalWalk: Walking");
            }
        }

        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        int i = 100;

        // 익명 클래스
        Walkable anonymousWalk = new Walkable() {
            @Override
            public void walk() {
                System.out.println("i: " + i);
                System.out.println("AnonymousWalk: Walking");
            }
        };

        anonymousWalk.walk();
    }

}
