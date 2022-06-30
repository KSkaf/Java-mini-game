import java.util.Scanner;

public class Order 
{
	public static void main(String args[]) 
	{
		System.out.println("This is the Order's Game...Let's Begin but be carefull you only have 3 lives");
		System.out.println("For our first game something simple Rock-Paper-Scissors");
		Scanner in = new Scanner(System.in);
		int stars = 3;
		for(int i=0; i<5; i++)
		{	
		//Get the user's move through user input
		System.out.print("What is your move?  Rock, Paper or Scissors??? ");
		String myMove = in.nextLine();
		
		
		//Check if the user's move is valid (rock, paper, or scissors)
		if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

			System.out.println("Your move isn't valid! start again");
			return;
		
		} else 
		{

			//Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
			int rand = (int)(Math.random()*3);
			
			//Convert the random number to a string using conditionals and print the opponent's move
			String opponentMove = "";
			if(rand == 0) {
				opponentMove = "rock";
			} else if(rand == 1) {
				opponentMove = "paper";
			} else {
				opponentMove = "scissors";
			}
			System.out.println("Opponent move is: " + opponentMove);
				
			//Print the results of the game: tie, lose, win
			if(myMove.equals(opponentMove)) {
				System.out.println("It's a tie!");
			} else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
				System.out.println("You won a life! ");
				stars=stars+1;
			} else {
				System.out.println("You lost a life!");
				stars=stars-1;
			}
			System.out.println("You have lives remaining!"+stars);
		
	  }
		if (stars ==0)
		{
			System.out.println("Don't be mad you brought this destruction upon yourself");
			return;
		}
		if (stars !=0 && i==4)
		{
			System.out.println("Hmm... Hope you are ready for the real challenge and the next four rooms");
			 System.out.println("Now you have to pick a room based on a symbol: Clubs, Diamonds, Hearts or Spades... ");
				Scanner s = new Scanner(System.in);
			    String Symbol = s.nextLine();
				
			  if(Symbol.equals("clubs") || Symbol.equals("diamonds") || Symbol.equals("hearts")|| Symbol.equals("spades")) 
			  {


				   System.out.println("So the room of "+Symbol+" will now open");
			
			  }
				if(Symbol.equals("spades"))
				{
					  SpadesRoom.main(args);
					  System.out.println("Let's head to the next room... Hangman");;
					  System.out.println("                                                     ");
					  HeartsRoom.main(args);
					  System.out.println("Let's head to the next room... King or Slave");
					  System.out.println("                                                     ");
					  DiamondsRoom.main(args);
					  System.out.println("Let's head to the next room... Pick the right door ");
					  System.out.println("                                                     ");
					  ClubsRoom.main(args);
					  System.out.println("Congratulations you have beat the King's Game :D");
					  System.out.println("In the next chapter you will have to play with face cards");
				}
				if(Symbol.equals("diamonds"))
				   {
					  DiamondsRoom.main(args);
					  System.out.println("Let's head to the next room... Hangman");
					  System.out.println("                                                     ");
					  HeartsRoom.main(args);
					  System.out.println("Let's head to the next room... Witch Hunt(find the killer)");
					  System.out.println("                                                     ");
					  SpadesRoom.main(args);
					  System.out.println("Let's head to the next room... Pick the right door ");
					  System.out.println("                                                     ");
					  ClubsRoom.main(args);
					  System.out.println("Congratulations you have beat the King's Game :D");
					  System.out.println("In the next chapter you will have to play with face cards");

					  
				   }
				if(Symbol.equals("clubs"))
				   {
					  ClubsRoom.main(args);
					  
					  System.out.println("Let's head to the next room... King or Slave");
					  System.out.println("                                                     ");
					  DiamondsRoom.main(args);
					  System.out.println("Let's head to the next room... Witch Hunt(find the killer)");
					  System.out.println("                                                     ");
					  SpadesRoom.main(args);
					  System.out.println("Let's head to the next room... Hangman");
					  System.out.println("                                                     ");
					  HeartsRoom.main(args);
					  System.out.println("Congratulations you have beat the King's Game :D");
					  System.out.println("In the next chapter you will have to play with face cards");

				   }
				if(Symbol.equals("hearts"))
				   {
					  HeartsRoom.main(args);
					  System.out.println("Let's head to the next room... King or Slave");
					  System.out.println("                                                     ");
					  DiamondsRoom.main(args);
					  System.out.println("Let's head to the next room... Witch Hunt(find the killer)");
					  System.out.println("                                                     ");
					  SpadesRoom.main(args);
					  System.out.println("Let's head to the next room... Pick the right door ");
					  System.out.println("                                                     ");
					  ClubsRoom.main(args);
					  System.out.println("Congratulations you have beat the King's Game :D");
					  System.out.println("In the next chapter you will have to play with face cards");

				   }
			    }	
		      
	         }
    
	
  }
}