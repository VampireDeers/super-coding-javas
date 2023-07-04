package exercise.chapter_59;

public class JavaMultiThreadingIssue {

    public static void main(String[] args){
        Counter counter = new Counter();

        Thread thread1 = new Thread(new IncrementRunnable(counter));
        Thread thread2 = new Thread(new IncrementRunnable(counter));
        Thread thread3 = new Thread(new IncrementRunnable(counter));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
