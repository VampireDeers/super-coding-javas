package exercise.chapter_59;

class IncrementRunnable implements Runnable {
    private Counter counter;

    public IncrementRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter.increment();
            System.out.println("Count: " + counter.getCount());
        }
    }
}



