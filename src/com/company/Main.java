package com.company;

import java.util.Scanner;

public class Main {

    public static void charCreation() {
        Scanner myObj = new Scanner(System.in);

        String name;
        int sValue, dValue, coValue, iValue, wValue, chValue;
        charClass cClass;
        charRace race;
        boolean condition = true;

        System.out.println("Welcome to character creation!\nThis process is required before you can proceed with your" +
                "great adventure, after all you can't explore the worlds of fantasy without a persona\n");

        System.out.println("First tell me the name of your character: ");
        name = myObj.nextLine();

        while(condition) {
            System.out.println("Is " + name + " the name of your character? Please type 'Y' if you like your name" +
                    " and 'N' if you would like to change your name");
            String response1 = myObj.nextLine();

            if(response1.equals("Y")) {
                condition = false;
            }
            else if(response1.equals("N")) {
                System.out.println("Please state your new name: ");
                name = myObj.nextLine();
            }
            else {
                System.out.println("Please enter either 'Y' or 'N'!");
            }
        }

        condition = true;


    }
    public static void main(String[] args) {
	// write your code here
        charCreation();
    }
}
