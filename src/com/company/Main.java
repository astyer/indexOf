package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //indexOf accepts characters and returns integers

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a letter in the alphabet.");
        String letter = input.nextLine().toUpperCase();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int position = alphabet.indexOf(letter) + 1;
        if(position != 0)
            System.out.println(letter + " is the " + position + "(th)(nd)(st) letter in the alphabet.");
        else
            System.out.println("That is not a letter in the alphabet.");
    }
}
