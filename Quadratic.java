import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        double a=sc.nextDouble();
        System.out.println("enter b value");
        double b=sc.nextDouble();
        System.out.println("enter c value");
        double c=sc.nextDouble();
        double disc=b*b-4*a*c;
        System.out.println("discriment is:"+disc);
        if(disc>0){
            double r1=(-b+ Math.sqrt(disc))/(2*a);
            double r2=(-b-Math.sqrt(disc))/(2*a);
            System.out.println("root1:" + r1);
            System.out.println("root2:" + r2);
            System.out.println("roots are real and distinct");
        }
        else if (disc==0) {
            double r=-b/(2*a);
            System.out.println("root is :" + r);
            System.out.println("roots are real and equal");
        }
        else if (disc<0){
            double real= -b/(2*a);
            double imag= Math.sqrt(-disc)/(2*a);
            System.out.println("Root1: " + " "+ real + "+" + imag + "i");
        }
    }
}
