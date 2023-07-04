package exercise.chapter_36;

public class InterfaceTest {

    public static void main(String[] args){
        // 속성
//        System.out.println(Flyable.atmosphereLimit);
//        Flyable.atmosphereLimit = 100;

        // Flyable
        Flyable bird = new Bird();
        Flyable airplane = new Airplane("AB1112");

//        bird.fly();
//        airplane.fly();
//
        // Walkable
        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("아이유");

        Walkable robot = new Robot("RB1233");

        person.walk();
        robot.walk();

        if ( robot instanceof Robot ){
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2);
        }
    }
}
