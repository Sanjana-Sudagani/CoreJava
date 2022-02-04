import java.util.Scanner;

public class ArraysProj {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] someValues = new int[5];

        for (int i = 0; i < someValues.length; i++) {
            System.out.print("enter an integer\t");
            someValues[i] = keyboard.nextInt();

        }//end for

        for (int i = 0; i < someValues.length; i++) {

            int result = someValues[i] * 2;
            System.out.println("result is " + result);

        }//end for

    }//end main
}