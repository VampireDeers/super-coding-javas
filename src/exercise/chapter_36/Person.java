package exercise.chapter_36;

public class Person extends Animal implements Walkable {
    private String name;
    private String job;
    private int height;

    @Override
    public void eat(String food) {
        System.out.printf("사람이 %s을 젓가락으로 먹는다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("사람이 자고 있습니다.");
    }

    @Override
    public void walk(){
        System.out.println("사람이 걷고 있습니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
