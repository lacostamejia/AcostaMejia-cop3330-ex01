package org.example;
import java.util.Scanner;

//Homework 1.
public class App 
{
    public static void main( String[] args )
    {

        Scanner name_input = new Scanner(System.in);  // Create a Scanner object

        System.out.println("What is your name?");

        String name = name_input.nextLine();  // Read user input

        String output = "Hello, " + name + ", nice to meet you!";

        System.out.println(output);  // Output user input

    }
}
