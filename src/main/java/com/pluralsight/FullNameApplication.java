package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");

        System.out.print("First name: ");
        String name = scanner.nextLine();

        System.out.print("Middle name: ");
        String Mname = scanner.nextLine();

        System.out.print("Last name: ");
        String Lname = scanner.nextLine();

        System.out.print("Suffix: ");
        String Suffix = scanner.nextLine();

        int length = Suffix.length();
        if(length > 0)
        {

            Lname = Lname + ", ";

        }



        System.out.println("Full name: " + name + " " + Mname + " " + Lname + Suffix);

    }
}
