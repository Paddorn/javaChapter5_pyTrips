/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterfive.mavenproject3;
import java.util.Scanner;
/**
 * input: Integer
 * output: Table containing all pythagorean triplets up to and including the input integer for integers no greater than 500
 * @author James
 */
public class pyTrips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // create Scanner to obtain input from command window
    Scanner input =new Scanner(System.in);
    // initialize
    int a,b,c;
    
    // ask for input
    System.out.println("Enter an integer no larger than 500: ");
    int number = input.nextInt();
    
    // checks input for validity
    if (number >= 0 && number <= 500 ) {
        System.out.println("Pythagorean Triplets up to " + number + "are: \n");
        // nested for loops that check for pythagorean triplets
        for (a=1; a<number; a++){
            for(b=a; b<=number; b++){
                for(c=1;c<=number;c++)
                    // if the three numbers are pythagorean triplets prints out the a, b, and c values and a new line
                    // loops up to the specified number at input
                    if(a*a+b*b==c*c){
                        System.out.print(a+","+b+","+c);
                        System.out.println();
                    } 
            }
        }
    }
    // control statement for invalid entries
    else { 
        System.out.println("Invalid Entry, please enter a value between 0 and 500");
    }
    }
    
}
