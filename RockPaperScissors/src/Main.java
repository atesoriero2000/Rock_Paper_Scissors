import java.util.Scanner;

public class Main {
	
	static Hand CPU, Player;
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		CPU = new Hand();
		Player = new Hand();
		
		
		while(CPU.getWins() != 5 && Player.getWins() != 5){ // while neither player gets 5 wins
			
			CPU.randomMove(); //set the move for the CPU 
			setPlayerMove(); //get and set the move for the player
			
			System.out.println("CPU: " + CPU.move + "\n");
			
			//now we have to evaluate who won the match
			if(CPU.move.equalsIgnoreCase(Player.move)){ // if a draw
				System.out.println("Draw!");
				
				//if CPU wins
			}else if(CPU.move.equals("Rock") && Player.move.equalsIgnoreCase("scissors")||
					CPU.move.equals("Paper") && Player.move.equalsIgnoreCase("rock")||
					CPU.move.equals("Scissors") && Player.move.equalsIgnoreCase("paper")){
				
				CPU.addWin();
				System.out.println("CPU Wins!");
				
			}else{//if Player wins
				Player.addWin();
				System.out.println("You Win!");
			}
			
			System.out.println("CPU: " + CPU.getWins());	//print the current score
			System.out.println("YOU: " + Player.getWins() + "\n");
			
		}

		//finished game. now evaluate game winner and print results
		if(CPU.getWins() > Player.getWins()){
			System.out.println("\nCPU IS THE WINNER! \n");
		}else{
			System.out.println("\nYOU ARE THE WINNER! \n");
		}
		
		System.out.println("FINAL SCORE:");
		System.out.println("	CPU: " + CPU.getWins());
		System.out.println("	YOU: " + Player.getWins() + "\n");
		
	}
	
	private static void setPlayerMove(){
		
		String move;
		boolean set = false;
		
		while(!set){//while a move is not set
			
			System.out.print("Rock, Paper, or Scissors?: ");
			
			while (!input.hasNext()){}//wait for input
			move = input.next();
	
			//checks for valid inputs
			if(move.equalsIgnoreCase("rock")||
					move.equalsIgnoreCase("paper")||
					move.equalsIgnoreCase("scissors")){

				Player.move = move;
				set=true; //break from the while(true) loop
				
			}else{
				System.out.println("Invalid \n");
			}
		}
	}

}
