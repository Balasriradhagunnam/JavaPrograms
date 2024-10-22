//super with variables
class A {
    int a=10;
}
class B extends A {
   int a=20;
    public void display(){
        System.out.println(super.a);
    }
}
public class Main{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        System.out.println(obj.a);
    }
}

// Output
//   10
//   20

//super with methods
class A {
    public void show(){
        System.out.println("Parent class");
    }
}

class B extends A {
    public void show(){
        System.out.println("Child class");
    }
    public void display(){
        super.show();
        show(); 
    }
}
public class Main{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}

// Output
// Parent class
// Child class

//super constructor
class A {
    A(){
         System.out.println("Parent Constructor");
    }
}
class B extends A {
   B(){
        super();
        System.out.println("Child Constructor");
    }
}
public class Main{
    public static void main(String[] args) {
        B obj = new B();
    }
}

// Output
//   Parent Constructor
//   Child Constructor
