import java.util.*;
class CatchClauses{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        try{
            int div= a/b;
            System.out.println("Division of :" + div);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Divison by zero is not excepted");
        }
        catch(NumberFormatException aib){
            System.out.println("Numbering is wrong");
        }
        catch(ArrayIndexOutOfBoundsException ip){
            System.out.println("Array size Overed");
        }
    }
}

// Output1
// Enter a value
// 4
// Enter b value
// 2
// Division of :2

// Output2
// Enter a value
// 12
// Enter b value
// 0
// Divison by zero is not excepted
