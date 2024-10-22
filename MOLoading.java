import.java.util.*;
public class MOLoading{
       public void add(int a, int b)
       {
        System.out.println("Addition: " + (a+b));
       } 
       public void add(int a,int b,int c){
              System.out.println("Addition is: " + (a+b+c));     
       }
       public static void main(String[] args) {
              MOLoading obj = new MOLoading();
              obj.add(1,2);
              obj.add(1,2,9);
       }
}

/* Output
  Addition: 3
Addition is: 12
*/
