import java.io.*;
class IODemo {
    public static void main(String args[]) {
        try (FileInputStream fis = new FileInputStream("abc.txt");
             FileOutputStream fos = new FileOutputStream("xyz.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("Copied");
        } catch (IOException e) {
          System.out.println("Exception");
        }
    }
}
