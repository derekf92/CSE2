/* Derek Worley CSE02 
lab003 
write a program that splits a check with inputs from the user. 
*/ 


import java.util.Scanner; 
public class Check 
{
    
    public static void main (String []args)
    {
    
    Scanner scan = new Scanner (System.in); // intialized scanner 
    double CheckAmount; // to be inputted later
    double PeopleSplitting; // how many people are splitting the check \
    double tipPercent; // how much of the tip you ll be willing to give
    int dollars,dimes,pennies; // these will be used to give the check in dollars and cents 
    double totalCost; // check + tip\
    double costPerPerson;
    // prompts and scans for how much the check is 
    System.out.println("How much is the check ");
    CheckAmount = scan.nextDouble();
    //promps and scans for the tip percent
    System.out.println("how much will the tip be");
    tipPercent = scan.nextDouble(); 
     //propts and scans for amount of people
    System.out.println("How many of you will be splitting it?");
    PeopleSplitting = scan.nextInt();
    
    totalCost = (CheckAmount * (1 + tipPercent )); // add 1 to the tipPercent so it can't be zero 
    costPerPerson =   (totalCost/PeopleSplitting);
    
dollars = (int) (costPerPerson);
System.out.println(costPerPerson);
dimes=(int)(costPerPerson * 10) % 10;
System.out.println(dimes);
pennies=(int)(costPerPerson * 100) % 10;
    
System.out.println(" the Cost for each person to split the check is: " + dollars + " dollars and " + dimes + pennies + " cents. ");    
    
    
    
    
    
    
}


}