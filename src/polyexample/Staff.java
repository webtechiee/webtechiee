
package polyexample;

//Staff.java       Java Foundations

// CST8284 - PLOYMORPHISM

//  Represents the personnel staff of a particular business.
//********************************************************************

public class Staff
{
   private StaffMember[] staffList;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the list of staff members.
   //-----------------------------------------------------------------
   public Staff()
   {
      staffList = new StaffMember[6];

      staffList[0] = new Executive("Nkiru", "123 Good Line",
         "555-0469", "123-45-6789", 2423.07);

      staffList[1] = new Employee("Bola", "456 Rivers Line",
         "555-0101", "987-65-4321", 1246.15);
      staffList[2] = new Employee("Joy", "789 Ibom Rocker",
         "555-0000", "010-20-3040", 1169.23);

      staffList[3] = new Hourly("Peace", "678 Ikorodu Ave.",
         "555-0690", "958-47-3625", 10.55);
      
      staffList[4] = new Volunteer("Hope", "987 Bank Blvd.",
    	         "555-8374");
    	      staffList[5] = new Volunteer("Grace", "321 Happy Lane",
    	         "555-7282");

    	      ((Executive)staffList[0]).awardBonus(500.00);

    	      ((Hourly)staffList[3]).addHours(40);
    	   }

    	   //-----------------------------------------------------------------
    	   //  Pays all staff members.
    	   //-----------------------------------------------------------------
    	   public void payday()
    	   {
    	      double amount;

    	      for (int count=0; count < staffList.length; count++)
    	      {
    	         System.out.println (staffList[count]);

    	         amount = staffList[count].pay();  // polymorphic. Different for each category of staff.

    	         if (amount == 0.0)
    	            System.out.println("Thanks!");
    	         else
    	            System.out.println("Paid: " + amount);

    	         System.out.println("-----------------------------------");
    	      }
    	   }
    	}		
