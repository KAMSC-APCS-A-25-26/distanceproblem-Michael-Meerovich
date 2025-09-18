/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */


import java.util.Scanner;


public class DistanceMultiple {
    public static void main(String[] args) {
//Signature
        System.out.println("Michael Meerovich");
        System.out.println ("APCS-A\nLewis 2.8 Distance Program\n\n");

        //Declare Variables
        double x1, x2, y1, y2, numruns, distance;

        //Create Scanner Input
        Scanner sc = new Scanner(System.in);

        //Prompt the user for the number of runs
        System.out.print("How many runs should the program have?  ");
        numruns = sc.nextDouble();
        System.out.println ();
        System.out.println ();

        //Repeat the Program
        for (int k = 0; k < numruns; k++)
        {
            //Tell Scanner to treat (, ) and Spaces as delimeters
            sc.useDelimiter("[(),\\s]+");

            //Input values
            System.out.print ("Input both sets of coordinates:  ");
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            System.out.println();

            //Do the math
            distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            //Output the answer
            System.out.println("The distance is " + distance);
            System.out.println();
            System.out.println();
        }

    }

}