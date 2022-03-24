package JavaProject;

import java.util.Scanner;

public class Movie extends MovieTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		
	/*	System.out.println("Online Movie Ticket Booking");
		System.out.println("Select a Movie : ");
		System.out.println("1: RRR ");
		System.out.println("2: The Kashmir Files");
		System.out.println("3: Jhund");
		System.out.println("4: Radhe Shyam");
		System.out.println("5: Valimai");
		
		int movieNumber = scan.nextInt();
		
		if(movieNumber==1)  {
			System.out.println("Movie Name : RRR");
			System.out.println("Theater : Saroj Theater");
			System.out.println("Cost Per Ticket : 200/-");
			System.out.println("Would you like to book the ticket? (1-yes // 2-no)");
			int number = scan.nextInt();
			
			if (number == 1) {
				System.out.println("Enter the Number of Tickets ?");
				int noOfTickets = scan.nextInt();
				int totalCost = noOfTickets*200;
				
				System.out.println("Show timings : 1: 12 to 3pm");
				System.out.println("2: 3 to 6pm");
				System.out.println("3: 6 to 9pm");
				System.out.println("4: 9 to 12pm");
				System.out.println("Select the Show Timing ?");
				int showTiming = scan.nextInt();
				
				if (showTiming == 1)
				System.out.println("Movie Name : RRR");
				System.out.println("Theater : Saroj Theater");
				System.out.println("Show Timing: 12 to 3pm");
				System.out.println("Total Cost : " +totalCost);
			}
		}   */
		
		
		Movie movieList[] = null;
		int status = 1;
		do {
			System.out.println("Online Movie Ticket Booking");
			System.out.println("1: Add Movies (ONLY FOR THEATER OWNERS)");
			System.out.println("2: View All Movies");
			System.out.println("3: Book the Tickets");
			System.out.println("Enter your choice?");
			int save = scan.nextInt();
			
			switch (save) 
			{
			case 1: 
				System.out.println("Enter the No. of Movies : ");
				int noOfMovies = scan.nextInt();
				movieList = new Movie[noOfMovies];
				
				for(int ctr=0; ctr<movieList.length; ctr++)
				{
					int ctr1 = ctr;
					System.out.println("Enter Movie Details");
					movieList[ctr] = new Movie();
				}
				System.out.println("The Data is Saved");
				break;
				
			case 2:
				for(int ctr=0; ctr<movieList.length; ctr++)
				{
					movieList[ctr].showAllDetails();
					System.out.println("------------------------------------------------------------------------------------");
				}
					break;
					
			case 3:
				boolean value = true;
				scan.nextLine();
				System.out.println("Enter the Movie Name : ");
				String movieName = scan.nextLine();
				
				for(int ctr=0; ctr<movieList.length; ctr++)
				{
					if(movieList[ctr].getName().equals(movieName))
					{
						movieList[ctr].showAllDetails();
						value = true;
						System.out.println("Book the Ticket? (Y OR N)");
						String book = scan.nextLine();
						
						if(book.equals("Y"))
						{
							System.out.println("Enter the Number of Tickets?");
							int ticket = scan.nextInt();
							int totalCost = movieList[ctr].getCost()*ticket;
							System.out.println("Total Cost of " +ticket+ " Tickets is : " +totalCost+ "/-");
							System.out.println("--Tickets Booked Successfully--");
						}
						else 
							break;
					}
					else
						value = false;
						if (value == false)
						System.out.println("Movie Not Found");	
				}
					break;
				
			default: 
				System.out.println("Invalid Input");
			}
			
			System.out.println("Do you want to Continue? (1/Yes | 2/No)");
			status = scan.nextInt(); 
		}
		while (status == 1);
		{
			System.out.println("Thank you for Visiting...");		
		}
			
	}

}
