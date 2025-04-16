package com.module5CToption1.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WeeklyTemperatures {
	
	public static void main(String [] args) {
	
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		//days of the week
		ArrayList<String> daysOfWeek = new ArrayList<String>(
				Arrays.asList("Monday", "Tuesday", "Wednesday",
								"Thursday", "Friday", "Saturday", "Sunday"));
		//daily average temperature for each day
		ArrayList<Double> avgTemp = new ArrayList<Double>(
				Arrays.asList(98.5, 97.6, 88.1,
								85.2, 89.9, 94.7, 96.0));
		
		//runs while the user doesn't want to exit
		do{
			System.out.println("Enter a day of the week to view the " + 
								"temperature for!");
			System.out.print("Enter \"Week\" to view the whole week, or enter " + 
								"\"Quit\" to quit: ");
			userInput = scnr.next();
			
			for(int i = 0; i < daysOfWeek.size(); i++) {
				if(userInput.equalsIgnoreCase(daysOfWeek.get(i))) {
					System.out.println(daysOfWeek.get(i) + ": " + avgTemp.get(i) + "F");
					break;
				}
				//list all days and average temperatures
				else if(userInput.equalsIgnoreCase("week")) {
					for(int j = 0; j < daysOfWeek.size(); j++) {
						System.out.println(daysOfWeek.get(j) + ": " + avgTemp.get(j) + "F");
					}
					break;
				}
				//exit program
				else if(userInput.equalsIgnoreCase("quit")){
					break;
				}
				//reached the end of the loop without breaking out means the day cannot be found
				//or a valid option has not been chosen
				else if(i == daysOfWeek.size() - 1){
					System.out.println("Not a valid day! Try again.");
					break;
				}
			}
						
		}while(!userInput.equalsIgnoreCase("quit"));
	}
}
