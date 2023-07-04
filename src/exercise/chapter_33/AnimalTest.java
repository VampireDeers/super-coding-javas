package exercise.chapter_33;

public class AnimalTest {

    public static void main(String[] args){
        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();

        feed(animal, "빼뺴로");
        feed(animal2, "벌레");
        feed(animal3, "모이");
    }

    public static void feed(Animal animal, String food){
        animal.eat(food);
    }
}
