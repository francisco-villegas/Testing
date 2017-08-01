package com.example.francisco.testing;

/**
 * Created by FRANCISCO on 01/08/2017.
 */
import java.util.ArrayList;
import java.io.*;

public class CodingTest {

    public static void main(String[] args) {
        //if number divisible by 3 then print "fizz"
        //if number is divisible by 5 print out "buzz"
        //if both print out "FizzBuzz"

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        printFizzBuss(numbers);

        //Problem 2
        //Print out the duplicate strings in a arraylist of string
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");

        CheckForDuplicates(stringArrayList);
    }

    static public void printFizzBuss(int [] numbers){
        for(int i = 0; i<numbers.length;i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0)
                System.out.println("number " + numbers[i] + ": [FizzBuzz]");
            else if (numbers[i] % 5 == 0)
                System.out.println("number " + numbers[i] + ": [buzz]");
            else if (numbers[i] % 3 == 0)
                System.out.println("number " + numbers[i] + ": [fizz]");

        }
    }

    static public void CheckForDuplicates(ArrayList<String> stringArrayList){
        for(int i = 0; i<stringArrayList.size();i++) {
            for(int x = i+1; x<stringArrayList.size();x++) {
                if(stringArrayList.get(i)==stringArrayList.get(x)) {
                    System.out.println("Letter " + stringArrayList.get(i) + ": duplicated");
                    break;
                }
            }
        }
    }

}
