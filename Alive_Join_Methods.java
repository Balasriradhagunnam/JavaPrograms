class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
        try {
            Thread.sleep(2000); // Simulate some work with sleep
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Start thread1
        thread2.start(); // Start thread2

        // Check if thread1 is alive
        if (thread1.isAlive()) {
            System.out.println(thread1.getName() + " is alive.");
        }

        try {
            // Wait for thread1 to finish
            thread1.join();
            System.out.println(thread1.getName() + " has completed. Now continuing in main thread.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Check if thread2 is alive after thread1 has finished
        if (thread2.isAlive()) {
            System.out.println(thread2.getName() + " is still alive.");
        } else {
            System.out.println(thread2.getName() + " has completed.");
        }
    }
}
// Output
// Thread-0 is running.
// Thread-1 is running.
// Thread-0 is alive.
// Thread-0 has finished.
// Thread-0 has completed. Now continuing in main thread.
// Thread-1 has finished.
// Thread-1 has completed.

