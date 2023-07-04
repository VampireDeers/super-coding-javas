package exercise.chapter_60.singleton;

public class FileWriterSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            writer.writeToFile("Thread 1: Message 1");
            writer.writeToFile("Thread 1: Message 2");
        });

        Thread thread2 = new Thread(() -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            writer.writeToFile("Thread 2: Message 3");
            writer.writeToFile("Thread 2: Message 4");
        });

        thread1.start();
        thread2.start();

        // join
    }
}
