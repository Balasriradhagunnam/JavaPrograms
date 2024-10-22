// Runnable implementation
class MorningRunnable implements Runnable {
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MorningRunnable());
        Thread thread2 = new Thread(new HelloRunnable());
        Thread thread3 = new Thread(new WelcomeRunnable());

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
        thread3.start(); // Start the third thread
    }
}

// Output
//   Hello
//   Good Morning
//   Welcome
//   Good Morning
//   Hello
//   Good Morning
//   Welcome
//   Hello
//   Welcome
