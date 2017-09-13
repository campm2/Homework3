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
	   double total_Cost_Package_B;
	   double savings_Package_B;//savings if switch to package B
	   double savings_Package_C;//savings if switch to package C
	   double savings_Package_A;//savings if switch to package A
	   //create an scanner object to read in values from the user
	   Scanner keyboard = new Scanner(System.in);
	   
	   //Enter the package letter
	   System.out.print("Please enter the letter of the package:");
	   packageLetter=keyboard.nextLine().charAt(0);
	   
	   //Enter the hours used
	   System.out.print("Please enter the number of hours used:");
	   hours_Used=keyboard.nextInt();
	   keyboard.close();
	   //Package A
	   if(packageLetter=='A'|| packageLetter=='a') {
		   if(hours_Used<=PACKAGE_A_BASE_HOUR) {
			   System.out.printf("Total Cost is $%.2f.\n",PACKAGE_A_MONTHLY_RATE);
			   System.out.print("Goodbye");
		   }// end bracket of inside if 
		   
		   else if(hours_Used>PACKAGE_A_BASE_HOUR) {
			   total_Cost_Package_A=(hours_Used-PACKAGE_A_BASE_HOUR+PACKAGE_A_MONTHLY_RATE)*PACKAGE_A_HOURLY_RATE;
			   System.out.printf("Total Cost is $%.2f.\n",total_Cost_Package_A);
			   
			   //calculate the money the user will save if switch to package B
			   savings_Package_B=total_Cost_Package_A-PACKAGE_B_MONTHLY_RATE;
			   System.out.printf("Customer A can save $%.2f if he purhcases package B.\n", savings_Package_B);
			   
			   //calculate the money the user will save if switch to package C
			   savings_Package_C=total_Cost_Package_A-PACKAGE_C_MONTHLY_RATE;
			   System.out.printf("Customer A can save $%.2f if he purhcases package C.\n",savings_Package_C);
			   System.out.print("Goodbye");
			   
		   }//bracket if inside else if 
		   
	   }//end bracket of outside if
	   //Package B
	   else if(packageLetter=='B'||packageLetter=='b') {
		   if ( PACKAGE_A_BASE_HOUR<hours_Used &&hours_Used<=PACKAGE_B_BASE_HOUR) {
			   System.out.printf("Total Cost is $%.2f.\n", PACKAGE_B_MONTHLY_RATE);
			   System.out.print("Goodbye");
		   }// end of inside if
		   
		   else if(hours_Used>PACKAGE_B_BASE_HOUR) {
			   total_Cost_Package_B=(hours_Used-PACKAGE_B_BASE_HOUR+PACKAGE_B_MONTHLY_RATE)*PACKAGE_B_HOURLY_RATE;
			   System.out.printf("Total Cost is $%.2f.\n",total_Cost_Package_B);
			
			   //calculate the money the user will save if switch to package C
			   savings_Package_C=total_Cost_Package_B-PACKAGE_C_MONTHLY_RATE;
			   System.out.printf("Customer A can save $%.2f if he purhcases package C.\n",savings_Package_C);
			   System.out.print("Goodbye");   
		   }//end of inside else
		   
		   else if(hours_Used<=PACKAGE_A_BASE_HOUR) {
			   //Total Cost
			   System.out.printf("Total Cost is $%.2f.\n",PACKAGE_B_MONTHLY_RATE);
			   //calculate the money the user will save if switch to package A
			   savings_Package_A=PACKAGE_B_MONTHLY_RATE-PACKAGE_A_MONTHLY_RATE;
			   System.out.printf("Customer A can save $%.2f if he purhcases package A.\n",savings_Package_A); 
		   }//second else if bracket
	   }//outside else if bracket
	   //Package C
	   else if(packageLetter=='C'||packageLetter=='c'){
		   if(hours_Used>PACKAGE_B_BASE_HOUR){
		   System.out.printf("Total Cost is $%.2f ",PACKAGE_C_MONTHLY_RATE);
		   System.out.print("Goodbye");
		   }//inside if bracket
		   else if(hours_Used>PACKAGE_A_BASE_HOUR && hours_Used<=PACKAGE_B_BASE_HOUR) {
			   System.out.printf("Total Cost is $%.2f.\n",PACKAGE_C_MONTHLY_RATE);
			   //Calculate savings if customer switches to package B
			   savings_Package_B=PACKAGE_C_MONTHLY_RATE-PACKAGE_B_MONTHLY_RATE;
			   System.out.printf("Customer A can save $%.2f if he purhcases package B.\n",savings_Package_B);   
		   }//inside else if bracket
		   else if(hours_Used<=PACKAGE_A_BASE_HOUR){
			   System.out.printf("Total Cost is $%.2f.\n ",PACKAGE_C_MONTHLY_RATE);
			   //Calculate savings if customer switches to package a
			   savings_Package_A=PACKAGE_C_MONTHLY_RATE-PACKAGE_A_MONTHLY_RATE;
			   System.out.printf("Customer A can save $%.2f if he purhcases package A.\n",savings_Package_A); 
		   }//second else if inside
	   }//second outside else if bracket   
	   else {
		   System.out.println("Incorrect letter");
		   System.out.print("Please restart program and enter either a,b,c ");
	   }//end bracket of else
   }	 //end of main
  }//end of public class