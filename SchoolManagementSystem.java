package project;
import java.text.SimpleDateFormat;
import java.util.*;
public class SchoolManagementSystem {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to abc School");
			System.out.println("Choose the option to proceed");
			System.out.println("1. Admission Form" + '\n' + "2. Teachers Portal"+ '\n'+ "3. Fees"+ '\n' + "4. Course Detail" + '\n'+"5. Sports"+'\n' );
			String options = input.nextLine();
			switch(options) {
			
			case "1":
				
				System.out.println("Fill out the Application form:");
				admissionForm();
//				break;
			case "2":
				System.out.println("Teachers Portal:");
				teachersPortal();
				
			case "3":
				System.out.println("Fees Structure:");
				fees();
				
			case "4":
				System.out.println("Course Detail:");
				courseDetail();
				
			case "5":
				System.out.println("Sports Detail:");
				sports();
				
			}
							
	}

		private static  void admissionForm() 
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your name");
			String name = in.nextLine();
			
			System.out.println("Enter your age");
			int age = in.nextInt();
			in.nextLine();
			System.out.println("Enter your Parents name");
			String PName = in.nextLine();
			System.out.println("Enter your Native Place");
			String nPlace = in.nextLine();
			System.out.println("Enter ur gender");
			String gender = in.nextLine();
			System.out.println("Contact Number");
			int cNumber = in.nextInt();
//			in.nextInt();
			System.out.println("Nationality");
			String Nation = in.nextLine();
			in.nextLine();
//			System.out.println("Date");
			int Date = in.nextInt();
//			in.nextLine();
			SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/YYYY");
			System.out.println("");
			System.out.println("Date of Application is :"+d1.format(in));
			System.out.println("");
			System.out.println("   *------------------------------*   ");
			System.out.println("Application has been submitted\nThank you for the Responce... ");
			}
		private static void teachersPortal() {
			
		}
	
		private static void fees() {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the section: ");
			int section;
			section = in.nextInt();
						
			//Fees Structure for each class
			//Finding class room no
			
			System.out.println("High School Rooms");
			
			if(section == 6)
			{
				System.out.println("Fees : 5000/term ");
				System.out.println("Room number : 101");	
			}
			else if(section == 7)
			{
				System.out.println("Fees : 5500/term ");
				System.out.println("Room number : 102");
			}
			else if(section == 8)
			{
				System.out.println("Fees : 6000/term ");
				System.out.println("Room number : 103");
			}
			else if(section == 9)
			{
				System.out.println("Fees : 6500/term ");
				System.out.println("Room number : 104");
			}
			else if(section == 10)
			{
				System.out.println("Fees : 7000/term ");
				System.out.println("Room number : 105");
			}
			else if(section == 11)
			{
				System.out.println("Fees : 7500/term ");
				System.out.println("Room number : 106");
			}
			else if(section == 12)
			{
				System.out.println("Fees : 8500/term ");
				System.out.println("Room number : 107");
			}
			
			else
			{
				System.out.println("Fees : 3500/year");
				System.out.println("Lower Class");
			}
				
		}
		private static void courseDetail() {
			Scanner obj = new Scanner(System.in);
			System.out.println("Select Course code :");
			int course ;
			course = obj.nextInt();
			
			
			//selecting course 
			//Course Details for 11 and 12 standard class
			
			if(course ==111) 
			{
				System.out.println("For 11 - A1 (and) 12 - A1");
				System.out.println("Course details");
				System.out.println("Physics");
				System.out.println("Chemistry");
				System.out.println("Mathematics");
			}
			else if(course == 112)
			{
				System.out.println("For 11 - A2 (and) 12 - A2");
				System.out.println("Course details");
				System.out.println("Computer Science");
				System.out.println("Biology");
				System.out.println("Statistics");
			}
			else if(course == 113) 
			{
				System.out.println("For 11 - B1 (and) 12 - B1");
				System.out.println("Course details");
				System.out.println("Accountancy");
				System.out.println("Tourism");
				System.out.println("Mathematics");
			}
			else if(course == 114)
			{
				System.out.println("For 11 - B2 (and) 12 - B2");
				System.out.println("Course details");
				System.out.println("Commerse");
				System.out.println("History");
				System.out.println("Economics");
			}
			else 
			{
				System.out.println("No other course");
			}
		}
		private static void sports() {
			Scanner obj = new Scanner(System.in);
			System.out.println("Sport name:");
			String Sports;
			Sports = obj.nextLine();
			
			//Checking available sports
			//Fees structure for sports
			
			if(Sports == "Kabadi")
			{
				System.out.println("Fees : 1000 ");
//				System.out.println("");	
			}
			else if(Sports == "Criket")
			{
				System.out.println("Fees : 1500 ");	
			}
			else if(Sports == "Hockey")
			{
				System.out.println("Fees : 1750 ");	
			}
			else if(Sports == "Settle")
			{
				System.out.println("Fees : 2000 ");	
			}
			else if(Sports == "Foot Ball")
			{
				System.out.println("Fees : 2000 ");	
			}
			else if(Sports == "Relay")
			{
				System.out.println("Fees : 1200 ");	
			}
			else if(Sports == "Chess")
			{
				System.out.println("Fees : 2200 ");	
			}
			else
			{
				System.out.println("Not Available");
			}
		}		
}
