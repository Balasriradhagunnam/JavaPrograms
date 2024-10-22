// import java.util.*;
public class Default{
    byte Byte;
    boolean bool;
    char chara;
    short Short;
    int integer;
    float floated;
    long longed;
    double doubled;
    public void show(){
        System.out.println(Byte);
        System.out.println(bool);
        System.out.println(chara);
        System.out.println(Short);
        System.out.println(integer);
        System.out.println(floated);
        System.out.println(longed);
        System.out.println(doubled);

    }
    public static void main(String[] args) 
    {
        Default obj= new Default();
        obj.show();
    } 
}

//output
0
false

0
0
0.0
0
0.0
