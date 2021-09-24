package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter maximum mark");
        int maxMark = input.nextInt();

        System.out.println("Enter student mark");
        int stuMark = input.nextInt();

        double percentage = ((double)stuMark/maxMark)*100;
        if(percentage>=80){
            System.out.println("Mark = A");
        }
        if(percentage>=70-79){
            System.out.println("Mark = B");
        }
        if(percentage>=60-69){
            System.out.println("Mark = c");
        }
        if(percentage>=50-59){
            System.out.println("Mark = D");
        }
        if(percentage>=40-49){
            System.out.println("Mark = E");
        }
        if (percentage<40);{
            System.out.println("Mark = U");
        }







    }
}
