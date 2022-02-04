import java.util. ArrayList;
import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {

        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);

        String fullName;

        String firstName;

        String lastName;



        final int NUM_NAMES = 5;

        for (int i = 0; i < NUM_NAMES; i++) {
            System.out.print("Please enter name " + i + "\t");

            fullName = keyboard.nextLine();
            int indexSpace = fullName.indexOf(" ");

            firstName = fullName.substring(0, indexSpace);
            lastName = fullName.substring(indexSpace + 1);

            firstNames.add(firstName);

            lastNames.add(lastName);

        }//end for

//now for the permutations

        for (int i = 0; i < firstNames.size(); i++) {
            for (int j = 0; i < lastNames.size(); j++) {
                System.out.print(firstNames.get(i) + " ");
                System.out.println(lastNames.get(j));

            }//end for j

        }//end for i

    }//end main
}