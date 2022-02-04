import java.util.Scanner;
import java.util.ArrayList;

public class ParallelLists {


        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in); ArrayList<String> names = new ArrayList<>();


            ArrayList<Integer> ages = new ArrayList<>();


            String name;



            int age;



            for(int i = 0; i < 5; i++) {

                System.out.print("Enter a name:\t");

                name = keyboard.nextLine();


                System.out.println("Enter an age:\t");


                age = keyboard.nextInt();

                keyboard.nextLine();

                names.add(name);
                System.out.println();

                ages.add(age);

            }//end for

            for(int i = 0; i < names.size(); i++) {

                System.out.println(names.get(i) + " is " + ages.get(i)+"years old");


            }//end for

        }//end main

    }

