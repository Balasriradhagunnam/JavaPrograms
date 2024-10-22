interface A{
    public void show();
}
class B implements A{
    public void show(){
        System.out.println("Iam from interface Method");
    }
}
public class Main{
    public static void main(String args[]){
        B obj =new B();
        obj.show();
    }
}

// Output
//   Iam from interface Method
