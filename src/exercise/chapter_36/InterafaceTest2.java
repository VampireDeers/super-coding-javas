package exercise.chapter_36;

public class InterafaceTest2 {

    public static void main(String[] args){
        // Drone
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB1233");

        drone.fly();
        airplane.fly();


        if ( drone instanceof Drone){
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }
    }
}
