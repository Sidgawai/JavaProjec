package JavaProject;

import java.util.Scanner;

public class MovieTicket {
	private String name;
	private String theaterName;
	private int noOfTickets;
	private int cost;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	MovieTicket() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Name of the Movie : ");
		this.name = sc.nextLine();
		System.out.println("Enter the Theater Name : ");
		this.theaterName = sc.nextLine();
		System.out.println("Enter the Number of Tickets : ");
		this.noOfTickets = sc.nextInt();
		System.out.println("Enter the Cost per Ticket : ");
		this.cost = sc.nextInt();
		
	}
	
	void storeAllDetails(String name, String theaterName, int noOfTickets, int cost) {
		this.name = name;
		this.theaterName = theaterName;
		this.noOfTickets = noOfTickets;
		this.cost = cost;
	}
	
	void showAllDetails () {
		System.out.println("Movie Name : " +name);
		System.out.println("Theater Name : " +theaterName);
		System.out.println("Tickets Available : " +noOfTickets);
		System.out.println("Cost of the Ticket : " +cost+ "/-");
	}
}
