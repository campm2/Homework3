/* ========================================================================== */
/*	PROGRAM Stock Transaction Simulator

    AUTHOR: Megan Camp, Mercedes Kent
    COURSE NUMBER: CIS 210
    COURSE SECTION NUMBER: 02
    INSTRUCTOR NAME: Dr.Tian
    PROJECT NUMBER: 3 
    DUE DATE: 09/14/2017

SUMMARY

INPUT
-Ask the user to enter the letter of the package the customer has purchased (A, B, or C) 
-The number of hours that the user accessed the Internet



OUTPUT
-The amount of money a customer will pay
- The amount of money a customer will save if he or she purchase Package B or C
- The amount of money must following a ‘$’ and have 2 decimal points, such as $2.00,
$34.56, etc.


ASSUMPTIONS

/* MAIN FUNCTION */
import java.util.Scanner;

public class InternetServiceProvider{
   public static void main(String [] args){ 
	   
	   char packageLetter = 'q';
	   int hours_Used= 0;
	   double PACKAGE_A_MONTHLY_RATE=9.95;
	   double PACKAGE_B_MONTHLY_RATE=13.95;
	   double PACKAGE_C_MONTHLY_RATE=19.95;
	   double PACKAGE_A_HOURLY_RATE=2.00;
	   double PACKAGE_B_HOURLY_RATE=1.00;
	   int PACKAGE_A_BASE_HOUR=10;
	   int PACKAGE_B_BASE_HOUR=20;
	   double total_Cost_Package_A;
	   double savings_Package_B;
	   double savings_Package_C;
	   
	   //create an scanner object to read in values from the user
	   Scanner keyboard = new Scanner(System.in);
	  
	   
	   //Enter the package letter
	   System.out.print("Please enter the letter of the package:");
	   packageLetter=keyboard.nextLine().charAt(0);
	   
	   //Enter the hours used
	   System.out.print("Please enter the number of hours used:");
	   hours_Used=keyboard.nextInt();
	   
	   if(packageLetter=='A'|| packageLetter=='a') {
		   if(hours_Used<=PACKAGE_A_BASE_HOUR) {
			   System.out.print("Total Cost is " +PACKAGE_A_MONTHLY_RATE);
		   }// end bracket of inside if 
		   else if(hours_Used>PACKAGE_A_BASE_HOUR) {
			   total_Cost_Package_A=(hours_Used-PACKAGE_A_BASE_HOUR)*PACKAGE_A_BASE_HOUR;
			   System.out.print("Total Cost is " +total_Cost_Package_A);
			   //calculate the money the user will save if switch to package B
			   savings_Package_B=total_Cost_Package_A-PACKAGE_B_MONTHLY_RATE;
			   System.out.println("Customer A can save $" + savings_Package_B + "if he purhcases package B");
			   //calculate the money the user will save if switch to package C
			   savings_Package_C=total_Cost_Package_A-PACKAGE_C_MONTHLY_RATE;
			   System.out.println("Customer A can save $" + savings_Package_C + "if he purhcases package B");
			 
			   System.out.print("Goodbye");
			   
		   }//bracket if inside else if 
		   
	   }//end bracket of outside if
	   
	   else if(packageLetter=='B'||packageLetter=='b') {
		   if (PACKAGE_A_BASE_HOUR<hours_Used<=PACKAGE_B_BASE_HOUR) {
			   System.out.print("Total Cost is " + PACKAGE_B_MONTHLY_RATE);
		   }
		   else if ()
		   
	   }//first else if bracket
	   
	   else if(packageLetter=='C'||packageLetter=='c'){
		   System.out.print("Total Cost is " + PACKAGE_C_MONTHLY_RATE);
		   
	   }//second else if bracket
	   
	   
	  
	   
	   
	
	   
   }	   
  }