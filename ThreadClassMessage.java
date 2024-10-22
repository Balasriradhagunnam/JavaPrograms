// Thread class implementation
class MorningThread extends Thread {
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

class HelloThread extends Thread {
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

class WelcomeThread extends Thread {
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

public class ThreadExample {
    public static void main(String[] args) {
        MorningThread thread1 = new MorningThread();
        HelloThread thread2 = new HelloThread();
        WelcomeThread thread3 = new WelcomeThread();

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
        thread3.start(); // Start the third thread
    }
}
// Output
//   Good Morning
//   Hello
//   Welcome
//   Good Morning
//   Hello
//   Good Morning
//   Welcome
//   Hello
//   Welcome
