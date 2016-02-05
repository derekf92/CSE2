/* Derek Worley CSE2
lab 002 Feb 4th 2016 
Cyclometer will: 
print the number of minutes for each trip
print the number of counts for each trip 
print the distance of eah tip in miles 
print the distance for the two trips combined 
*/ 

public class Cyclometer{
    
    public static void main(String[]args)
    {
        int secsTrip1 = 480; //  the seconds the first trip took
        int secsstrip2 = 3220; //the seconds the second trip took 
        int countsTrip1 = 1561; // the counts the first trip took
        int countsTrip2 = 9037; // the counts the second trip took 
        
        
        double wheelDiamter = 27.0, //diamter of this bike's wheel
        PI = 3.14159, // used in calculation of circle
        feetPerMile = 5280, // used in feet to mile conversion
        inchesPerFoot = 12, // good fun fact 
        secondsPerMinute = 60; //used for seconds to minutes conversion
        double distanceTrip1,distanceTrip2, totalDistance;
        
        System.out.println("Trip 1 took  "+ (secsTrip1/secondsPerMinute) +" minutes and had "+ countsTrip1+ "  counts");
        System.out.println("Trip 2 took  " + (secsstrip2/secondsPerMinute) + " minutes and had " + countsTrip2+ "  counts.");
         distanceTrip1=countsTrip1*wheelDiamter*PI; // calc the distance for trip 1 in inches  
         distanceTrip1/=(inchesPerFoot*feetPerMile); // calculates the distance for trip 1 in miles
         distanceTrip2 = countsTrip2*wheelDiamter*PI/inchesPerFoot/feetPerMile; // calc. distance for trip 2 
         totalDistance=distanceTrip1 + distanceTrip2;
        System.out.println("Trip 1 was  "+ distanceTrip1 + "  miles");
        System.out.println("Trip 2 was  " + distanceTrip2+ "  miles");
        System.out.println("The total distance was  " + totalDistance + "  miles");
        
        
        
    }
}