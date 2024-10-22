import java.util.*;
public class Binary{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int low=0,high=4,mid;
        int flag=0;
        System.out.println("enter your key value");
        int key=sc.nextInt();
        while(low<=high){
            mid=(low+high)/2;
            if (key == a[mid]){
                flag=1;
                break;
            }
            else if(key < a[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(flag==1){
            System.out.println("key is found" + key);
        }
        else{
            System.out.println("key is not found" + key);
        }
    }
}
