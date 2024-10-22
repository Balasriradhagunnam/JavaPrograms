class A {
    public void show1(){
        System.out.println("GrandParent class");
    }
}

class B extends A {
    public void show2(){
        System.out.println("Parent class");
    }
}
class C extends B{
   public void show3(){
        System.out.println("Child class");
    }
}
public class Main{
    public static void main(String[] args) {
        C obj = new C();
        obj.show1();
        obj.show2(); 
        obj.show3();
    }
}

// Output
// GrandParent class
// Parent class
// Child class
  
