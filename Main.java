package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu = 0; 
		
		do {
			System.out.println("Welcome to Bruger-Boss");
			System.out.println("1. Buy Burger");
			System.out.println("2. Exit");
			System.out.print(">> ");
			
			menu = scan.nextInt(); 
			String buntype = "";
			String username = "";
			String meat = "";
			String addon = "";
			int height = 0;
			int bunprice = 0;
			int meatprice = 0;
			int addonprice = 0;
			int heightprice = 0;
			int totalprice = 0;
			int payment = 0;
			int change = 0;
			
			
			if (menu == 1) {
				System.out.println("Order Burger");
				scan.nextLine();
				
				do {
					System.out.println("Enter your name [3 - 20] : ");
					username = scan.nextLine();
				} while (username.length() < 3 || username.length() > 20);
				
				do {
					System.out.println("Select bun type [Plain / Sesame Seed / Sliced Bread] : ");
					buntype = scan.nextLine();
				} while (!buntype.equals("Plain") && !buntype.equals("Sesame Seed") && !buntype.equals("Sliced Bread"));
				
				do {
					System.out.println("Select your meat [Chicken / Beef] : ");
					meat = scan.nextLine();
				} while (!meat.equals("Chicken") && !meat.equals("Beef"));
				
				do {
					System.out.println("Select your add on [Lettuce / Tomatoes / Onion / Cheese / All] : ");
					addon = scan.nextLine();
				} while (!addon.equals("Lettuce") && !addon.equals("Tomatoes") && !addon.equals("Onion") && !addon.equals("Cheese") && !addon.equals("All"));
				
				do {
					System.out.println("Select your burger height level [1-5] : ");
					height = scan.nextInt();
				} while (height < 1 || height > 5);
				
				//bunprice 
				if (buntype.equals("Plain")) {
					bunprice = 5;
				}
				else if (buntype.equals("Sesame Seed")) {
					bunprice = 10;
				}
				else if (buntype.equals("Sliced Bread")) {
					bunprice = 15;
				}
				
				//meatprice 
				if (meat.equals("Chicken")) {
					meatprice = 10;
				}
				else if (meat.equals("Beef")) {
					meatprice = 20; 
				}
				
				//addonprice 
				if (addon.equals("Lettuce")) {
					addonprice = 5;
				}
				else if (addon.equals("Tomatoes")) {
					addonprice = 10;
				}
				else if (addon.equals("Onion")) {
					addonprice = 10;
				}
				else if (addon.equals("Cheese")) {
					addonprice = 25;
				}
				else if (addon.equals("All")) {
					addonprice = 50;
				}
				
				//heightprice 
				if (height < 3) {
					heightprice = 25;
				}
				else if (height > 3 || height < 5) {
					heightprice = 50;
				}
				
				//totalprice 
				totalprice = bunprice + meatprice + addonprice + heightprice;
				
				System.out.println("\nBurger Order Details");
				System.out.println("Name		: " + username);
				System.out.println("Bun Type    	: " + buntype);
				System.out.println("Meat Type   	: " + meat);
				System.out.println("Addo On Type   : " + addon);
				System.out.println("Height Level   : " + height);
				System.out.println();
				System.out.println("Total Price : " + totalprice);
				
				do {
					System.out.println("Please input payment [total of money you give]");
					payment = scan.nextInt();
					scan.nextLine();
				} while (payment < totalprice);
				
				//change 
				change = payment - totalprice;
				System.out.println("The change is : " + change);
				System.out.println("\nThank you for buying a burger in burger in Burger Boss!\n");
				
				
			
			}
			
		} while (menu !=2);
	}

}
