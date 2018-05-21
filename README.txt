*** FORTUNE TELLER JAVA APP***
*****Created by John E Baltes II*****
*****May 20th 2018*****
-----------------------------------------------------------
**This App was created as a project for We Can {CODE} IT, bootcamp Summer 2018***
**The code is used to generate a 'fortune' based on simple user input**
**The java consule requires the use of strings, and ints***
**Use of 'if' conditionals and boolean logic**
**Extras: Tempoary time delay in between "generating" fortunes.**

-----------------------------------------------------------
Questions:
First & Last Name
Age
Month of birth (integer)
Favorite color (based on ROY G BIV)
Number of siblings

commands.
911 will terminate the consule, but will not close window. 


Colors must be entered as color name in ROY G BIV.

------------------------------------------------------------

I hope you enjoy the app. 

Sincerly,
John Baltes
Github: Retrojb
Email: baltes.26@osu.edu

------------------------------------------------------------
Java scripit:
____________________________________________________________


import java.util.Scanner;

public class FourtuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to John's Extrodinary Fortune Teller\n" 
				+ "You will be asked a series of questions and"
				+ "based on your input,\nyour fortune will be told \n(Type 911 at any time to terminate the script)"
				+ " \nthe game will start in 2 seconds");
		System.out.println(" ");
		
		// trying to a thread delay to allow user to take a few seconds to read
		//intro message, will also be implimented in the fortune teller part.
		 try {
		        Thread.sleep(2000);
		    } catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    }	
		System.out.println("Please enter your First Name: ");

		String firstName = input.nextLine();
		
		System.out.println(" "); // I was unsure how to make a better line break

		System.out.println("Please enter your Last Name: ");
		String lastName = input.nextLine();
		
		System.out.println(" ");
		System.out.println("Hello, " + firstName + " " + lastName + " , how old are you?");
		
		int age = input.nextInt();
		System.out.println(" ");
		
		if (age < 40) {
			System.out.println("Wow, " + firstName + " you're " + age + ", you are so young");
			System.out.println(" ");
		} else {
			System.out.println("It's okay " + firstName + " you're not that old, "  + age + " it's just a number, you are still young at heart");
		}
		;

		System.out.println(" ");
		System.out.println("Okay " + firstName + " what month were you born in? \n"
				+ "Please enter a numerical value (i.e July = 7)");
		int month = input.nextInt();
		input.nextLine();
		
		System.out.println(" ");
		

		System.out.println("What is your favorite R.O.Y.G.B.I.V. color?");
		String favoriteColor = input.nextLine();
		
		switch (favoriteColor.toLowerCase()) {
		case "red":
			break;
		case "orange":
			break;
		case "yellow":
			break;
		case "green":
			break;
		case "blue":
			break;
		case "indigo":
			break;
		case "violet":
			break;
		case "help":
			break;
		default:
			System.out.println("You messed up the data entry, please restart");
			
		if (favoriteColor.equalsIgnoreCase("help"));{
			System.out.println("\"ROY G BIV stands for: Red, Orange, Yellow, Green, Blue, Indigo, Violet\"");
			}
		}	
		

		System.out.println(" ");
		System.out.println("One last question, how many siblings do you have? ");
		int siblings = input.nextInt();
		
		 try {
		        Thread.sleep(1000);
		        // this is a 1.5 second pause
		    } catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    }

// This is the start of the compulational conditions for the fortune teller
		System.out.println(" ");
		System.out.println("Alright time to generate your fortune");
// System will take a short pause to create the allure of a processing system 
		 try {
		        Thread.sleep(1500);
		        // this is a 1.5 second pause
		    } catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    }
		
		// Fortune teller determines how long till you retire.
		System.out.println(" ");
		System.out.println("Lets determine how many years til you retire");
		// Retirement age is based on entering a career at 25 years old and working for 30 years
		
		int retirementDefaultAge = 65;
		int b; // this is used for changing the float to a rounded int for reitreAgeEven
		int c; // this is used for changing the float to a rounded int for reitreAgeEven
		float retireAgeOdd;
		// used floats because the math doesn't need to be more accurate than the 100ths place for rounding
		if (age % 2 == 0) {
			 boolean evenAge1= true;
					
			if (evenAge1 == true) {
				 float retireAgeEven = (float) (((retirementDefaultAge-age)*.6));
				 // this returns the float value of the retirementDefaultAge to an int
				 b =(int)Math.round(retireAgeEven);
				 try {
				        Thread.sleep(500);
				    } catch (InterruptedException e) {
				        // We've been interrupted: no more messages.
				        return;
				    }
			System.out.println("You will retire in " + b + " years");
			 if (retireAgeEven > 25) {
				 System.out.println("You still have a long time before retirement");
			 	} else if (retireAgeEven >= 25 && retireAgeEven >= 20) {
			 	System.out.println("You still have " + b + " years, thats still a while at least you'll only be ");
				} else if (retireAgeEven <20 && retireAgeEven >15) {
				System.out.println("You only have " + b + " years, you're over half way there!");
				} else if (retireAgeEven <=15 && retireAgeEven >=10) {
				System.out.println(" You only have " + b + " before retirement, you are getting there, time to use some \n"
						+ "some of that vacation time for more hobbie time");
				} else if (retireAgeEven <10 && retireAgeEven >= 5) {
					System.out.println("Almost there " + b + " years left! Better check on those retirement investments");
				} else if (retireAgeEven <5 && retireAgeEven >=0) {
				System.out.println("Might as well start packing up your desk and looking for vacation homes! \n"
						+ " you only have " + b + " years left!!!!");
						}
					}
			// odd boolean 
				} else {
					
					boolean oddAge1 = ((age % 2 != 0));
					if (oddAge1 == true) {
						retireAgeOdd = (float) ((retirementDefaultAge - age)*.77);
				 c =(int)Math.round(retireAgeOdd);
				 try {
				        Thread.sleep(500);
				    } catch (InterruptedException e) {
				        // We've been interrupted: no more messages.
				        return;
				    }
				
				System.out.println("You will retire in " + c + " years");
				 if (retireAgeOdd > 25) {
					 System.out.println("You still have a long time before retirement");
				 	} else if (retireAgeOdd >= 25 && retireAgeOdd >= 20) {
				 	System.out.println("You still have " + c + " years, thats still a while at least you'll only be ");
					} else if (retireAgeOdd <20 && retireAgeOdd >15) {
					System.out.println("You only have " + c + " years, you're over half way there!");
					} else if (retireAgeOdd <=15 && retireAgeOdd >=10) {
					System.out.println(" You only have " + c + " before retirement, you are getting there, time to use some \n"
							+ "some of that vacation time for more hobbie time");
					} else if (retireAgeOdd <10 && retireAgeOdd >= 5) {
						System.out.println("Almost there " + c + " years left! Better check on those retirement investments");
					} else if (retireAgeOdd <5 && retireAgeOdd >=0) {
					System.out.println("Might as well start packing up your desk and looking for vacation homes! \n"
							+ " you only have " + c + " years left!!!!");
						}
					}
				};
		
		// End of Retirement Fortune  
		//line spacers since I don't know how to use make them anyother way. 
		System.out.println(" ");
// Brief .5 second pause.
		 try {
		        Thread.sleep(500);
		    } catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    };
		// Start of Siblings
		
		    String web = "Web Developer";
			String art = "Artist";
			String space = "Astronaut";
			String biz = "Business Administrator";
			String movie = "Movie Star";
			String noJob = "You Don't have a job!";
			
			System.out.println("Okay since you have " + siblings + " sibling your job should be :");
			if (siblings <= 0) {
				System.out.println(noJob + " better start looking for a career!");
			}else if (siblings >= 1 && siblings <=2) {
				  System.out.println("You should be a " + web);
			}else if (siblings >= 3 && siblings <= 4) {
				System.out.println("You should be an " + biz );
			}else if (siblings >= 5); {
				System.out.println("You should be a " + movie);
			}
			
		
		// End of Siblings
//Brief system pause of .5 second
		 try {
		        Thread.sleep(500);
		    } catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    }
		// Start of the Birth Month fortune
		String birthMonth = "";
		if (month == 0) {

		} else if (month >= 1 && month <= 4) {
			System.out.println("You have $100.89 in your retirement fund!");

		} else if (month >= 5 && month <= 8) {
			System.out.println("You have $950,000,001.69 in your retirement fund!");
		} else if (month ==9 || month ==10 || month == 11 || month == 12) {
			System.out.println("You have 87,456.22 in your retirement fund");
		};
		// End of birth month
	// brief pause
		 try {
		        Thread.sleep(500);
		    } catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    }
		 // start of Color vehicle
		System.out.println("Lets see what type of vehicle you own");

		if (favoriteColor.equals("red")) {
			System.out.println("Your vehicle is a Donkey!!!");
		} else if (favoriteColor.equalsIgnoreCase("orange")) {
			System.out.println("Your vehicle is a orange 1969 Ford Mustang");
		} else if (favoriteColor.equalsIgnoreCase("yellow")) {
			System.out.println("Your vehicle is a bright yellow school bus!");
		} else if (favoriteColor.equalsIgnoreCase("Green")) {
			System.out.println("Your vehicle is a 1973 Volkswagon Eurovan! Nice ride!");
		} else if (favoriteColor.equalsIgnoreCase("blue")) {
			System.out.println("Your vehicle is a 2016 Lexus I800");
		} else if (favoriteColor.equalsIgnoreCase("indigo")) {
			System.out.println("Your vehicle is a 1999 Ferrari 550 Maranello");
		} else if (favoriteColor.equalsIgnoreCase("violet")) {
			System.out.println("Your vehicle is a bicycle, at least you are environmentally concious");
		} else if (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println("\"ROY G BIV stands for: Red, Orange, Yellow, Green, Blue, Indigo, Violet\"");
		} else {
			System.out.println("You did something wrong!");
		};
		 try {
		        Thread.sleep(500);
		    } catch (InterruptedException e) {
		        // We've been interrupted: no more messages.
		        return;
		    }
	System.out.println(" ");
	System.out.println("Thank you for using John's Extrodanary Fortune Teller, I hope you share it with your friends.");
	Runtime.getRuntime().exit(911);
		System.out.println("No one likes a quitter");
	
	};
	}
	
