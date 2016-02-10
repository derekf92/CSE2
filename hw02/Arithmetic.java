// Derek Worley Feb 10 2015 
// CSE2  hw02 
// objective: create a program to help calculate the total 
// amount of money I spent while shopping at a store (including tax)

public class Arithmetic{
    
    
    public static void main(String[] args)
    {
        //intialized all the sales tax variables
        double beltSalesTax,sweatshirtSalesTax,pantsSalesTax;
        //intialized all the flat price variables
        double totalPantsPrice,totalSweatshirtsPrice,totalBeltsPrice; 
        //all Price
        double totalCost;
        // all tax
        double totalTax; 
        // all prices + all tax
        double totalAmountPaid;
        
 double paSalesTax = 0.06;
//Number of pairs of pants
int numPants = 3;
//Cost per pair of pants
double pantsPrice = 34.98;
totalPantsPrice = (int) (100 * numPants * pantsPrice); //cost down to int to elimate excess decimals
totalPantsPrice = (double) (totalPantsPrice/100);// cast back to double and divided by 100 to 
//make things in terms of dollars and sense
pantsSalesTax = (int) (100* totalPantsPrice * paSalesTax);
pantsSalesTax = (double) (pantsSalesTax/100);


//Number of sweatshirts
int numShirts = 2;
//Cost per shirt
double shirtPrice = 24.99;
totalSweatshirtsPrice = (int) (100 * numShirts * shirtPrice); //cost down to int to elimate excess decima
totalSweatshirtsPrice = (double) (totalSweatshirtsPrice/100);// cast back to double and divided by 100 to 
//to make things in terms of dollars and sense
sweatshirtSalesTax = (int) (100*totalSweatshirtsPrice * paSalesTax); // price times tax rate
sweatshirtSalesTax = (double) (sweatshirtSalesTax/100);



//Number of belts
int numBelts = 1;
//cost per box of envelopes
double beltCost = 33.99;
// doing the same as with pants casting to double and back to get rid of floating decimals. 
totalBeltsPrice = (int) (100 * numBelts * beltCost);
totalBeltsPrice = (double)(totalBeltsPrice/100); 
beltSalesTax = (int) (100 * paSalesTax * totalBeltsPrice);
beltSalesTax = (double) (beltSalesTax/100);

// adding all the individuals costs 
totalCost = ( totalBeltsPrice + totalSweatshirtsPrice + totalPantsPrice);
//adding all the individual prices. 
totalTax = (int) (100 * (beltSalesTax + pantsSalesTax + sweatshirtSalesTax));
totalTax = (double) (totalTax/100);
// cost + tax
totalAmountPaid= (totalCost + totalTax);

// printing out all the imporant variables. 
System.out.println(" the total Cost (before tax) is " + totalCost);
System.out.println(" the total tax is " + totalTax);
System.out.println(" the total amount paid is " + totalAmountPaid);

        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}