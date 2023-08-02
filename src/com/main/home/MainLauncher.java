package com.main.home;

import java.util.Scanner;

import com.main.service.HttpGetter;

public class MainLauncher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("Menu:");
            System.out.println("1. get Temperature");
            System.out.println("2. get Windspeed");
            System.out.println("3. get Pressure");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Read user input
            choice = scanner.nextInt();

            // Process the choice
            switch (choice) {
                case 1:
                    System.out.println("You selected Option 1");
				try {
					System.out.println("Input date in the format \"yyyy-MM-dd\":");
					String inputDate = scanner.next();
//					String inputDate = "2019-03-28";

					new HttpGetter().tempOfInputDate(inputDate);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;
                case 2:
                    System.out.println("You selected Option 2");
                    try {
    					System.out.println("Input date in the format \"yyyy-MM-dd\":");
    					String inputDate = scanner.next();
//    					String inputDate = "2019-03-28";
    					new HttpGetter().windSpeedOfInputDate(inputDate);
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
                    break;
                case 3:
                    System.out.println("You selected Option 3");
                    try {
    					System.out.println("Input date in the format \"yyyy-MM-dd\":");
    					String inputDate = scanner.next();
//    					String inputDate = "2019-03-28";
    					new HttpGetter().pressureOfInputDate(inputDate);
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
	}
}
