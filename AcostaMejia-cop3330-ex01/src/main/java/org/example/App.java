package org.example;
import java.util.Scanner;

//Homework 1.
public class App 
{
    public static void main( String[] args )
    {

        Scanner name_input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is your name?");
        String name = name_input.next();  // Read user input
        System.out.println("Hello, " + name + ", nice to meet you!");  // Output user input

    }
}
