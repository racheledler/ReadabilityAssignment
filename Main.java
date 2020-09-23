package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Text: ");
        String text = input.nextLine();

        int lcount =0;
        int wcount= 0;
        int scount= 0;
        for (int i = 0; i < text.length() ; i++ ){ // all counts must be less than the text length. ???
            if (Character.isLetter(text.charAt(i))) lcount++;// charAt returns char at the specified index
            if (text.charAt(i) == ' ') wcount++; // every space is a new word
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') scount++; // every punctuation marks a new sentence
        }
        {

        }



        System.out.println(lcount + " letters");
        System.out.println(wcount +1 +" words");
        System.out.println(scount + " sentences");
        float L = (lcount / (float) (wcount  )) * 100;
        float S = (scount / (float) (wcount )) * 100;
        int index = (int) (0.0588 * L - 0.296 * S - 15.8);
        if (index < 1)
        System.out.print("Before Grade 1");
       else if (index > 16)
            System.out.print("Grade 16+");
        else
        System.out.print("Grade: " + index);

// a few examples are inaccurate and I'm not sure why. But majority are in the clear.

        

}}
