import java.util.*;
public class StringBufferDemo{
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("Programming");
        sb.deleteCharAt(2);
        System.out.println("After deleting : " + sb);
    }
}

//output
After deleting : Prgramming
