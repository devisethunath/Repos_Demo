import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		// Using Scanner for Getting Input from User
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of limbs and I will guess your pet : ");
		int noOfLimbs = input.nextInt();
		input.close();

		
		int a = noOfLimbs; 
		
	   if (a>=0 && a<=4 && a!=1)
	   
	   { System.out.println("You have a pet with  "+a+"  limbs");}
	   
	   else
		   
	   { System.out.println("invalid input");}
	
	
	if (a==0)
	{System.out.println("you have a fish");}
	
	else if (a==2)
	
	
	{System.out.println("you have a parrot");}
	
	else if (a==3)
	
	{System.out.println("you have a rabbit");}
	
	else if (a==4)
	
	{System.out.println("you have a cat or dog");}
	else
	{System.out.println("couldnt find a pet with  " +a+"  no of limbs");}
	
	
	
	//Ternary operator
	
	boolean x;
	
	x=( a==4 ||a==0)?true:false;
	if (x)
	
	{System.out.println("you have a fish or dog");}
	else
	{System.out.println("oh no you dont have fish or dog");}
	
	
}}
