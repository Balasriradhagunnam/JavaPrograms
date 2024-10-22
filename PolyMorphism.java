class A {
    public void show()
    {
        System.out.println("in parent method");
    }
}
class B extends A{
    public void show(){
        System.out.println("I have overriding the parent method");
    }
}
public class Main{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}

// Output
//   I have overriding the parent method
