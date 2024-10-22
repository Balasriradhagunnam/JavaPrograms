import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[20];
        int i,j,temp;
        System.out.println("Enter count of all elements");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                if(a[j] > a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array");
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}

//output
Enter count of all elements
5
Enter elements
7
2
4
9
1
sorted array
1 2 4 7 9
