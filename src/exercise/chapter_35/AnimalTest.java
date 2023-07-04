package exercise.chapter_35;

public class AnimalTest {

    public static void main(String[] args){
//        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal animal5 = new Dog();

//        feed(animal, "빼뺴로");
        feed(animal2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "김밥");
        feed(animal5, "고기");

    }

    public static void feed(Animal animal, String food){
        animal.eat(food);
    }
}
