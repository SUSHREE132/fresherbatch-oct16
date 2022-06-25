package com.oops;

import java.util.Scanner;

 class MovieHall {
	int seats=50;
	private static MovieHall obj;
	private MovieHall() {
}
		public static MovieHall getInstance()
		{
			if(obj==null)obj=new MovieHall();
			return obj;
		}
		
		void reserveseats (int n) {
			System.out.println("seats avaliable="+seats);
			if(n>seats) {
				System.out.println("Seats are not available");
				return;
			}
			seats-=n;
			System.out.println("n+are booked");
		}
	}
	class TicketBooking
	{
		static void bookTickets()
		{
		Scanner scn= new Scanner(System.in);
		System.out.println("tickets");
		int t=scn.nextInt();
		MovieHall m= MovieHall.getInstance();
		m.reserveseats(t);
		}
	}

public class Fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBooking.bookTickets();
		TicketBooking.bookTickets();

	}

}
