// Jonpier Veliz
// Use a one-dimensional array to determine how many of the salespeople earned salaries in ranges

public class SalesCommissions {
    // Main method begins the execution of Java application
    public static void main (String[] args) {

        int index = 0;

        // Declare array for sales
        int [] salesArray =  {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000};

        // Declare array of counters
        int [] frequency = new int[9];

        // Loop through array 
        for (int i = 0; i < salesArray.length; i++) {
            // Calculate and change values of array
            salesArray[i] = 200 + (int) (salesArray[i] * 0.09);
            // Calculate the index
            index = salesArray[i]/100-2; 
            // If index is greater than  8
            if (index > 8)
                index = 8; // Set index to 8
            frequency[index]++; // Add to frequency array
        }
        // Print array of counters
        System.out.println("RANGE    #");
        // Loop through array of counters
        for(int i = 0; i < 8; i++) {
            System.out.println("$" + (i * 100 + 200) + "-" + (i * 100 + 299) + " " + frequency[i]);
        }

        
       
    

        

       

    
}
}

