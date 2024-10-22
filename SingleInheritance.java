class A {
    public void show1(){
        System.out.println("Parent class");
    }
}

class B extends A {
    public void show2(){
        System.out.println("Child class");
    }
}

public class Main{
    public static void main(String[] args) {
        B obj = new B();
        obj.show1();  // Method inherited from class A
        obj.show2();  // Method in class B
    }
}

// Output
// Parent class
// Child class
