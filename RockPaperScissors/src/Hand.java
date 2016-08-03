
public class Hand {

	private int wins = 0;

	
	public String move;
	
	public Hand(){}
	
	public int getWins(){
		return this.wins;
	}
	
	public void addWin(){
		wins++;
	}
	
	public void randomMove(){
		
		int move = (int) (Math.random() * 3); ;
		
		switch (move){
			case 0:
				this.move = "Rock";
				break;
			case 1:
				this.move = "Paper";
				break;
			case 2:
				this.move = "Scissors";
				break;
			default:
				System.out.println("ERROR in randomMove()");
		}
	}
	
}
