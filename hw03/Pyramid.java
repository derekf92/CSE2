// Derek Worley CSE2 
// Febuary 16 hw03
// make a class that can return the volume of a pyrimid given user input of base and height. 


import java.util.Scanner; // importing the scanner util to be used in this class

public class Pyramid 
{
    
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in); // initializing scanenr 
        double height,base, VolumeOfPyramid; // values will be inputted by the user later
        System.out.println("what is the height of the pyramid"); // prompts user for input of height
        height = scan.nextDouble(); // scans in the height 
        System.out.println("what is the base of the pyramid"); //prompts user for input of base 
        base = scan.nextDouble(); //scans in the base of the pyramid. 
        VolumeOfPyramid =  (int) (100 *(base * height * (.333))); // elimantes floating decimals
        VolumeOfPyramid = (double) ( VolumeOfPyramid/100); // by converting to int and back. 
        System.out.println("The pyramid has a volume of " + VolumeOfPyramid); //outputs volume. 
        
        
    }
    
    
}