import java.util.*; 
class Finally{
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
        finally{
            System.out.println("Exeution Completed");
        }
    }
} 

 /* Output
Enter a value
10
Enter b value
0
Divison by zero is not excepted
Exeution Completed
*/
