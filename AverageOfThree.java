import java.util.Scanner;

public class AverageOfThree {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double n1=sc.nextDouble();
        System.out.println("Enter number 2: ");
        double n2=sc.nextDouble();
        System.out.println("Enter number 3: ");
        double n3=sc.nextDouble();
        double avg=(n1+n2+n3)/3;
        System.out.println("average is : "+avg);
    }

}
