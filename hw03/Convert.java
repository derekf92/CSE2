// Derek Worley CSE2 
// Feb 16 2016 hw03
// make a class that converts meters to inches


import java.util.Scanner; // import the scanner to allow the user to input meters. 

public class Convert
{
    
    
    public static void main(String[]args)
    {
        double metersinputted;// the user will input this number
        double metersInInches; // final anwser basically 
        final double MetersToInches = 39.3701; // number of inches in 1 meter.
        Scanner scan = new Scanner(System.in); // intializes scanner 
        System.out.println("Enter the distance in meters:"); 
        metersinputted = scan.nextDouble(); 
        metersInInches = (int) (100* metersinputted * MetersToInches); // getting rid of floating decimals 
        metersInInches = (double) (metersInInches/100); // by converting to int and back to double. 
        System.out.println(metersinputted + " meters is " + (metersInInches) + "inches");
        
        
        
        
        
        
        
    }
    
    
    
    
}