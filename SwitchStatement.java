import java.util.Scanner;
public class SwitchStatement
{
    public static void main(String[] args)
    {
        int x,y,r;
        double z;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter x : ");
        x=scnr.nextInt();
        System.out.print("Enter y : ");
        y=scnr.nextInt();
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.print("Requirement : ");
        r=scnr.nextInt();
        switch(r)
        {
            case 1:
            {
                z=x+y;
                System.out.println(z);
            }
            break;
            case 2:
            {
                z=x-y;
                System.out.println(z);
            }
            break;
            case 3:
            {
                z=x*y;
                System.out.println(z);
            }
            break;
            case 4:
            {
                z=x/y;
                System.out.println(z);
            }
            break;
            default:
            {
                System.out.println("Requirement is invalid");
            }
        }
    }
}  