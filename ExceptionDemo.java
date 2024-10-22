import java.util.*; 
class ExceptionDemo{
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
        catch(Exception e)
        {
            System.out.println("Divison by zero is not excepted");
        }
    }
}

// Output1
//   Enter a value
//   12
//   Enter b value
//   3
//   Division of :4

//Output2
// Enter a value
// 12
// Enter b value
// 0
// Divison by zero is not excepted
