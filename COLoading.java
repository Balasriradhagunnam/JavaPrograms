import java.util.*;
public class COLoading{
    int rollno;
    String name;
    COLoading(int a,int b)
    {
       System.out.println(a+b);
    }
   COLoading(int a,int b,int c){
         System.out.println(a+b+c);
    }
    public static void main(String args[]){
        COLoading obj1= new COLoading(1,2);
        COLoading obj2= new COLoading(1,2,3);
    }
}

// Output
// 3
// 6
