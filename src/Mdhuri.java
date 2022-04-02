import java.util.Arrays;
	import java.util.Scanner;
public class Mdhuri {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//package com.ninja.training;

	

		//public class harrypotter {

			//public static void main(String[] args) {
				int movienumber[] = {1,2,3,4,5,6,7,8};
				String moviename[] = {" Harry Potter and the Philosopher's Stone ",
						 "Harry Potter and the Chamber of Secrets",
						"Harry Potter and the Prisoner of Azkaban",
						 "Harry Potter and the Goblet of Fire",
						 "Harry Potter and the Order of the Phoenix",
						 "Harry Potter and the Half-Blood Prince",
						 "Harry Potter and the Deathly Hallows – Part 1",
						 "Harry Potter and the Deathly Hallows – Part 2"};
						 
				int releaseyear[] = {2001,2002,2004,2005,2007,2009,2010,2011};
				int movieindex=8;
				
				
			//1.how many years elapsed b/w first and last movie of harrypotter	
				int elapsetime=releaseyear[0]-releaseyear[7];
				System.out.println("1.elapsed years between firsr and lastmovie is "+ elapsetime +"years");
				
				//2.calculate approx years for a movie release in years and months
				int avg=(releaseyear[7]-releaseyear[0])/movieindex;
				int modulus=(releaseyear[7]-releaseyear[0])%movieindex;
				System.out.println("2.Approxmate years for a movie release is " + avg+"years"+modulus+"  months");
				
				
				System.out.println("3.enter number of a movie");
				Scanner input=new Scanner(System.in);
				int a=input.nextInt();
		    //3.get a number as input from user and print the movie name 	 	
		     	switch(a)
		     	{
		     	case 1:
		     		System.out.println(" Harry Potter and the Philosopher's Stone \r\n");
		     		break;
		     	case 2:
		     		System.out.println("Harry Potter and the Chamber of Secrets\\r\\n");
		     		break;
		     	case 3:
		     		System.out.println("Harry Potter and the Prisoner of Azkaban\\r\\n");
		     		break;
		     	case 4:
		     		System.out.println("Harry Potter and the Goblet of Fire");
		     		break;
		     	case 5:
		     		System.out.println("Harry Potter and the Order of the Phoenix\\r\\n");
		     		break;
		     	case 6:
		     		System.out.println("Harry Potter and the Half-Blood Prince");
		     		break;
		     	case 7:
		     		System.out.println("Harry Potter and the Deathly Hallows – Part 1\\r\\n");
		     		break;
		     	case 8:
		     		System.out.println("Harry Potter and the Deathly Hallows – Part 2\\r\\n");
		     		break;
		     	default:
		     		System.out.println("Invalid input");
		     		
		     	}//end of switch names
		     	
		     	//4.If user enters input as 1,print"first movie",8,print "lastmovie" for anything else,print"not first or lastmovie"
		     	System.out.println("4.Enters input");
		     	Scanner inp=new Scanner(System.in);
		     	int mn=inp.nextInt();
		   
		     	switch(mn)
				{
		     	case 1:
					System.out.println("First movie");
					break;
				case 8:
					System.out.println("Lastmovie");
					break;
				default:
					System.out.println("Not First or Last movie name");
				}//end of switch
		    
		     	//5.keep getting input from user and print the name of the movie till the user enters an invalid input
		     	
		     for(int b=0;b<= movieindex;b++) 
		     	{
		     		System.out.println("5.enter number of a movie");
		     		Scanner input1= new Scanner(System.in);
		     		b=input1.nextInt();
		     		switch(b)
		         	{
		         	case 1:
		         		System.out.println(" Harry Potter and the Philosopher's Stone \r\n");
		         		break;
		         	case 2:
		         		System.out.println("Harry Potter and the Chamber of Secrets\\r\\n");
		         		break;
		         	case 3:
		         		System.out.println("Harry Potter and the Prisoner of Azkaban\\r\\n");
		         		break;
		         	case 4:
		         		System.out.println("Harry Potter and the Goblet of Fire");
		         		break;
		         	case 5:
		         		System.out.println("Harry Potter and the Order of the Phoenix\\r\\n");
		         		break;
		         	case 6:
		         		System.out.println("Harry Potter and the Half-Blood Prince");
		         		break;
		         	case 7:
		         		System.out.println("Harry Potter and the Deathly Hallows – Part 1\\r\\n");
		         		break;
		         	case 8:
		         		System.out.println("Harry Potter and the Deathly Hallows – Part 2\\r\\n");
		         		break;
		         	default:
		         		System.out.println("Invalid input");
		         		
		         	}//end of switch
		     	
		     	}//end of for loop
		     
		     
		     //7. Create a single for loop to print all the data in the format [Movie Number, Movie name, Year Of Release]
		     System.out.println("\n7.print all the data movie number,moviename &Releaseyear");
		     for(int c=0;c<movienumber.length;c++)
				{
					System.out.print(movienumber[c]);
					System.out.print(moviename[c]);
					System.out.print(releaseyear[c]);
					
					System.out.println();
				}//end of forloop

			
				
				
						
				

			}//end of main

		//end of class


	}


