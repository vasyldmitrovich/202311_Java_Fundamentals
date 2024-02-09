package softserve.edu15.hw;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Task 1: Run three threads and output different messages for 5 times
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        thread1.start();
        thread2.start();
        thread2.join();
        thread3.start();

        // Task 2: Cause a deadlock
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread threadA = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread A holds lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread A waits for lock2");
                synchronized (lock2) {
                    System.out.println("Thread A holds lock1 and lock2");
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread B holds lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread B waits for lock1");
                synchronized (lock1) {
                    System.out.println("Thread B holds lock2 and lock1");
                }
            }
        });

        threadA.start();
        threadB.start();

        // Task 3: Create threads "one", "two", and "three"
        Thread threadOne = new Thread(() -> {
            Thread threadTwo = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            });
            Thread threadThree = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            threadTwo.start();
            threadThree.start();
        });
        threadOne.start();

        System.out.println("End of main() method");
    }
}

class MyRunnable implements Runnable {
    private final String message;

    public MyRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}
