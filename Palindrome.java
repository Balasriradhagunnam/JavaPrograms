//palindrome
import java.util.*;
class Palindrome{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0){
            int rem =n%10;
            rev= rev*10 +rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}

// Output
//   Enter value
//   121
//   Palindrome
