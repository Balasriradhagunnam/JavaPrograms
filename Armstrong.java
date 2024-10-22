//palindrome
import java.util.*;
class Armstrong{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        int temp=n;
        while(temp != 0){
            temp/=10;
            count++;
        }
        temp=n;
        while(temp != 0){
            int rem=temp%10;
            sum += Math.pow(rem,count);
            temp/=10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}

// Output
//   Enter value
//   8208
//   Armstrong
