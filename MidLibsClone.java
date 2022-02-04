import java.util.Scanner;
public class MidLibsClone {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);

        String adjectivel;
        System.out.print("Enter adjective: \t");
        adjectivel= keyboard.nextLine();

        String girlsName;
        System.out.print("Enter Girl's Name: \t");
        girlsName= keyboard.nextLine();

        String adjective2;
        System.out.print("Enter another adjective: \t");
        adjective2= keyboard.nextLine();

        String occupation1;
        System.out.print("Enter occupation: \t");
        occupation1= keyboard.nextLine();

        String placeName;
        System.out.print("Enter place name: \t");
        placeName= keyboard.nextLine();

        String clothing;
        System.out.print("Enter Clothing: \t");
        clothing= keyboard.nextLine();


        String adjective3;


        String mansName;



        String hobby;
        System.out.print("Enter hobby: \t");
        hobby= keyboard.nextLine();

        String occupation2;

        String boysName;
System.out.print("Enter another adjective: \t");
adjective3= keyboard.nextLine();

        System.out.print("Enter another occupation:\t");
        occupation2 = keyboard.nextLine();


        System.out.print("Enter a boy's name:\t");
        boysName = keyboard.nextLine();

        System.out.print("Enter a man's name");

        mansName = keyboard.nextLine();

        System.out.println("There once was a " + adjectivel + " girl named " + girlsName + " who was a "+ adjective2+""+occupation1+" in the Kingdom of " + placeName + ".");


                System.out.println("She Loved to wear " + clothing + " and to "+hobby + ". She wanted to marry "+ adjective3+" "+occupation2+ " named " + boysName + " but her father, King " + mansName+" forbid her from seeing him.");

    }//end main
}