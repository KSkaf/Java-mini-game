import java.util.ArrayList;
import java.util.Scanner;

public class DiamondsRoom 
{
	

	public static void main(String args[])
	{
		System.out.println("Welcome to the Diamonds Room");
		System.out.println("Let's play a interesting game King/Slave/Citizen");
		System.out.println("Every player has 5 cards 4 of them are citizens and the other either king or slave...");
		System.out.print("About the rules: king>citizen , citizen>slave, SLAVE>KING");
		for (int z=0; z<5; z++)
		{			
		
		Scanner diamondz = new Scanner(System.in);
		int point=0;
		String pick = diamondz.next();

		//Check if the user's move is valid (rock, paper, or scissors)
		if(pick.equals("king") || pick.equals("slave")) 
		{

			System.out.println("You have pick: "+pick);

	    }
		else
		{
			System.out.println("Invalid move you have to pick king or slave");
			break;
		}
		
		if(pick.equals("king"))
		{	
	    Scanner kings= new Scanner(System.in);
		ArrayList<String> kc = new ArrayList <String>();
		kc.add("king");
		kc.add("citizen");
		kc.add("citizen");
		kc.add("citizen");
		kc.add("citizen");
		for (int i=0; i<5; i++)
		{	System.out.println("Your cards are: "+kc);
			System.out.println("Pick a card from king/citizen");
			String choice = kings.nextLine();
			System.out.println("My card is "+choice);
				
			if( "king".equals(choice) ) 
			{
				kc.remove("king");
				
			}
			else
			{	
			kc.remove(kc.size()-1); 
			}
		System.out.println("Your remaining cards are: "+kc);

	        //Convert the random number to a string using conditionals and print the opponent's move
			String opponentMove = "";
			ArrayList<String> sc = new ArrayList <String>();
			sc.add("slave");
			sc.add("citizen");
			sc.add("citizen");
			sc.add("citizen");
			sc.add("citizen");
			
				int randoms = (int) (Math.random()*sc.size());
				opponentMove = sc.get(randoms);
				System.out.println("Opponent move is " +opponentMove);
				
				if(opponentMove.equals("citizen"))
				{
					sc.remove(sc.size()-1);
				}
				else
				{
					sc.remove("slave");
				}
				
			
			//Print the results of the game: tie, lose, win
		if(choice.equals("citizen") && opponentMove.equals("citizen")) {
				System.out.println("It's a tie!");
		} else if((choice.equals("king") && opponentMove.equals("citizen")) || (choice.equals("citizen") && opponentMove.equals("slave"))) {
				System.out.println("You won a point ! ");
				point=point+1;
			}
				else 
				{
					System.out.println("You lost a point!");
					point=point-1;
				}
				System.out.println("You have points remaining!"+point);
				System.out.println("____________________________________________________");
		}
		}
		else
		{	
	    Scanner slaves= new Scanner(System.in);
		ArrayList<String> sc = new ArrayList <String>();
		sc.add("slave");
		sc.add("citizen");
		sc.add("citizen");
		sc.add("citizen");
		sc.add("citizen");
		for (int i=0; i<5; i++)
		{	System.out.println("Your cards are: "+sc);
			System.out.println("Pick a card from slave/citizen");
			String choice = slaves.nextLine();
			System.out.println("My card is "+choice);
				
			if( "slave".equals(choice) ) 
			{
				sc.remove("slave");
				
			}
			else 
			{	
			sc.remove(sc.size()-1); 
			}
		System.out.println("Your remaining cards are: "+sc);

				
			
			//Convert the random number to a string using conditionals and print the opponent's move
			String opponentMove = "";
			ArrayList<String> kc = new ArrayList <String>();
			kc.add("king");
			kc.add("citizen");
			kc.add("citizen");
			kc.add("citizen");
			kc.add("citizen");
			
				int randoms = (int) (Math.random()*kc.size());
				opponentMove = kc.get(randoms);
				System.out.println("Opponent move is " +opponentMove);
				
				if(opponentMove == "citizen")
				{
					kc.remove(kc.size()-1);
				}
				else
				{
					kc.remove("king");
				}
				
			
			//Print the results of the game: tie, lose, win
		if(choice.equals("citizen") && opponentMove.equals("citizen")) {
				System.out.println("It's a tie!");
		} else if((choice.equals("slave") && opponentMove.equals("king"))) {
				System.out.println("You won a point ! ");
				point=point+1;
			}
				else 
				{
					System.out.println("You lost a point!");
					point=point-1;
				}
				System.out.println("You have points remaining!"+point);
				System.out.println("____________________________________________________");
    
	   }
	  }
		if(point<=0)
		{
			System.out.println("You lose");
			
		}
		else
		{
			System.out.println("Next room awaits");
			return;
		}
	   }
		
   }
}