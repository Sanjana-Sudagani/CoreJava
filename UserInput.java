import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;

        int age;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What's your age?");

        age = keyboard.nextInt();

        System.out.println("Hello, " + name);

        System.out.println("age is " + age);


    }
    //end main
}