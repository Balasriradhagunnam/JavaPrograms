import java.util.*;
public class Constructor{
    int rollno;
    String name;
    Constructor()
    {
        rollno=123;
        name="John";
    }
    Constructor(int rn,String person){
        rollno=rn;
        name=person;
    }
    public static void main(String args[]){
        Constructor obj1= new Constructor();
        Constructor obj2= new Constructor(567,"Jack");
        System.out.println("Default values are: " + obj1.rollno + " "+ obj1.name);
        System.out.println("parameter values: " + obj2.rollno +  " " +obj2.name);
    }
}


// Output
// Default values are: 123 John
// parameter values: 567 Jack
