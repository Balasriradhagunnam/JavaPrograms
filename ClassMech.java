import java.util.*;
public class ClassMech {
       public void show1()
       {
        System.out.println("in show1 method");
       } 
       public void show2(){
              System.out.println("in show2 method");     
       }
       public static void main(String[] args) {
              ClassMech obj = new ClassMech();
              obj.show1();
              obj.show2();
       }
}

/*Output
  in show1 method
  in show2 method
*/
