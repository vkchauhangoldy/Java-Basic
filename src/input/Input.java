package input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Learn How to take inputs in Java");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");

        String name = sc.nextLine();
        System.out.println("Your name is: "+ name);

        //this is single line comment in java

        /*
        this is multi
                line
                        comment in java
        */
    }
}
