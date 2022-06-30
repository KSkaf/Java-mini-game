import java.util.Scanner;

public class ClubsRoom
{
	public static void main(String args[])
	{
	int lives =3;
    System.out.println("Welcome to the Clubs Room");
	System.out.println("For this room you have to pick one of these two doors and meet the Finale");
	Scanner clubz = new Scanner(System.in);
	System.out.println("Pick a door from F or D (caps lock)");
	String choice = clubz.nextLine();
	if( "F".equals(choice) ) 
	{
		System.out.println("Pick a door from I or A");
	}
	else if( "D".equals(choice) )
	{
		lives=lives-1;
		System.out.println("You have "+lives+" lives remaining lives");
		System.out.println("Pick a door from I or A");
	}
	else
	{
		lives=lives-1;
		System.out.println("You have "+lives+" lives remaining lives");
		System.out.println("That's a penalty for not obeying the rules...");
		System.out.println("Pick a door from I or A");
	}
	String choice1 = new Scanner(System.in).nextLine();
		if( "I".equals(choice1) )
		{
			System.out.println("Pick a door from N or M");
		}
		else if( "A".equals(choice1) )
	    {
		lives=lives-1;
		System.out.println("You have "+lives+" lives remaining lives");
		System.out.println("Pick a door from N or M");
	    }
		else
		{
			lives=lives-1;
			System.out.println("You have "+lives+" lives remaining lives");
			System.out.println("That's a penalty for not obeying the rules...");
			System.out.println("Pick a door from N or M");
		}
		String choice2 = new Scanner(System.in).nextLine();
			if( "N".equals(choice2) )
			{
				System.out.println("Pick a door from A or E");
			}
			else if( "M".equals(choice2) )
	        {
		      lives=lives-1;
		      System.out.println("You have "+lives+" lives remaining lives");
			  if(lives !=0){
			  System.out.println("Pick a door from A or E");
			  }
			  if(lives==0)
			  {
				 System.out.println("You lose...");
				 return;
		      }
	        }
			else
			{
				lives=lives-1;
				System.out.println("You have "+lives+" lives remaining lives");
				System.out.println("That's a penalty for not obeying the rules...");
				if(lives==0)
				{
					System.out.println("You lose...");
					return;
				}
				else
				{
				System.out.println("Pick a door from A or E");
				}
			}
				String choice3 = new Scanner(System.in).nextLine();
			    if( "A".equals(choice3) )
				{
					System.out.println("Pick a door from L or C");
				}
				else if( "E".equals(choice3) )
	    		{
					lives=lives-1;
					System.out.println("You have "+lives+" lives remaining lives");
					if(lives!=0){
					System.out.println("Pick a door from L or C");}
				  if(lives==0)
				  {
				    	System.out.println("You lose...");
				    	return;
				  }
	  			}
				else
				{
					lives=lives-1;
					System.out.println("You have "+lives+" lives remaining lives");
					System.out.println("That's a penalty for not obeying the rules...");
					if(lives==0)
					{
						System.out.println("You lose...");
						return;
					}
					else
					{
					System.out.println("Pick a door from L or C");
					}
				}
					String choice4 = new Scanner(System.in).nextLine();
				    if( "L".equals(choice4) )
					{
						System.out.println("Pick a door from E or Y");
					}
					else if( "C".equals(choice4) )
	    			{
						lives=lives-1;
						System.out.println("You have "+lives+" lives remaining lives");
						if(lives!=0){
						System.out.println("Pick a door from E or Y");}
				  	  if(lives==0)
				  		{
				    		System.out.println("You lose...");
				    		return;
				  		}
	  				 }
					else
					{
						lives=lives-1;
						System.out.println("You have "+lives+" lives remaining lives");
						System.out.println("That's a penalty for not obeying the rules...");
						if(lives==0)
						{
							System.out.println("You lose...");
							return;
							
						}
						else
						{
						System.out.println("Pick a door from E or Y");
						}
					}
						String choice5 = new Scanner(System.in).nextLine();
						
						if( "E".equals(choice5) )
						{
							System.out.println("Well Done you have passed the Clubs");
							System.out.print("The answer is given at the beginning...");
							System.out.println("The letters from the correct doors create the word FINALE");
							System.out.println("Let's head to the next room...");
						}
						else if( "Y".equals(choice5) )
						{
							lives=lives-1;
							if(lives!=0)
							{	
							System.out.println("Well Done you have passed the Clubs");
							System.out.print("The answer is given at the beginning...");
							System.out.println("The letters from the correct doors create the word FINALE");
							System.out.println("Let's head to the next room...");
							}
							if(lives==0)
							{
								System.out.println("You lose...");
							}
						}
					
				}
		
}