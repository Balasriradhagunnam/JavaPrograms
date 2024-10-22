import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        boolean isPalindrome =true;
        int length = str.length();
        for(int i=0;i<length;i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                isPalindrome =false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
