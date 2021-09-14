/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String name;
        System.out.print("What is your name? ");
        name=sc.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
