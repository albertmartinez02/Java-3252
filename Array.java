// NAME AND FSUID: Jonpier Veliz jav20bn ; Albert Martinez aam20
import java.security.SecureRandom; // Import SecureRandom class

public class Array {
    // Main method begins the execution of Java application
    public static void main (String[] args){
        
        // Create instances of SecureRandom
        SecureRandom randomNumbers = new SecureRandom();
        
        int random1 =  0 + randomNumbers.nextInt(9);
        int random2 =  0 + randomNumbers.nextInt(9);
        int random3 =  0 + randomNumbers.nextInt(9);
        int random4 =  0 + randomNumbers.nextInt(9);
        int random5 =  0 + randomNumbers.nextInt(9);
        int random6 =  0 + randomNumbers.nextInt(9);
        int random7 =  0 + randomNumbers.nextInt(9);
        int random8 =  0 + randomNumbers.nextInt(9);
        int random9 =  0 + randomNumbers.nextInt(9);
        int random10 =  0 + randomNumbers.nextInt(9);
        int random11 =  0 + randomNumbers.nextInt(9);
        int random12 =  0 + randomNumbers.nextInt(9);
        int random13 =  0 + randomNumbers.nextInt(9);
        int random14 =  0 + randomNumbers.nextInt(9);
        int random15  =  0 + randomNumbers.nextInt(9);
 
        // Initialize sum variables
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0; 
        int sum7 = 0; 
        int sum8 = 0; 

        // Declare 2D array with 6 rows and 4 columns
        int [] [] array = {{random1, random2, random3, 0}, {random4, random5, random6, 0},  
                           {random7, random8, random9, 0}, {random10, random11, random12, 0}, 
                           {random13, random14, random15, 0}, {0,0,0,0}};  // Lower right cell (position [6][4] set to 0)
     
        // Loop through first row 
        // Notice that array[0][0] refers to cell in first row and first column
        for (int row = 0; row <= 0; row++) {
            // Loop through first 3 columns
            for (int column = 0; column <= 2; column++) {
                sum1 = sum1 + array[row][column]; // Calculate sum of first row
                array[0][3] = sum1; // Set value of sum to first cell in fourth column
            }
        }
        
        // Loop through second row
        for (int row = 1; row <= 1; row++) {
            // Loop through first 3 columns
            for (int column = 0; column <= 2; column++) {
                sum2 = sum2 + array[row][column]; // Calculate sum of second row
                array[1][3] = sum2; // Set value of sum to second cell in fourth column
            }
        }

        // Loop through third row
        for (int row = 2; row <= 2; row++) {
            // Loop through first 3 columns
            for (int column = 0; column <= 2; column++) {
                sum3 = sum3 + array[row][column]; // Calculate sum of third row
                array[2][3] = sum3; // Set value of sum to third cell in fourth column
            }
        }

        // Loop through fourth row
        for (int row = 3; row <= 3; row++) {
            // Loop trough first 3 columns
            for (int column = 0; column <= 2; column++) {
                sum4 = sum4 + array[row][column]; // Calculate sum of fourth row
                array[3][3] = sum4; // Set value of sum to fourth cell in fourth column
            }
        }

        // Loop through fifth row
        for (int row = 4; row <= 4; row++) {
            // Loop through first 3 columns
            for (int column = 0; column <= 2; column++) {
                sum5 = sum5 + array[row][column]; // Calculate sum of fifth row
                array[4][3] = sum5; // Set value of sum to fifth cell in fourth column
            }
        }

        // Loop through first 5 rows 
        for (int row = 0; row <= 4; row++) {
            // Loop trough first column
            for (int column = 0; column <= 0; column++) {
                sum6 = sum6 + array[row][column]; // Calculate sum of first column
                array[5][0] = sum6; // Set value of sum to first cell in the sixth row 
            }
        }

        // Loop through first 5 rows
        for (int row = 0; row <= 4; row++) {
            // Loop through second column
            for (int column = 1; column <= 1; column++) {
                sum7 = sum7 + array[row][column]; // Calculate sum of second column
                array[5][1] = sum7; // Set value of sum to second cell in the sixth row
            }
        }

        // Loop through first 5 rows 
        for (int row = 0; row <= 4; row++) {
            // Loop trough third columng
            for (int column = 2; column <= 2; column++) {
                sum8 = sum8 + array[row][column]; // Calculate sum of third column
                array[5][2] = sum8; // Set value of sum to third cell in the sixth row 
            }
        }
    
        // Print 2D Array
        // Loop through rows
        for (int row = 0; row < array.length; row++) {
           // Loop through columns 
            for (int column = 0; column < array[row].length; column++){
                System.out.printf("%2d%3s", array[row][column], ""); 
            }
            System.out.println(); // Print new line
        }
    }

}
