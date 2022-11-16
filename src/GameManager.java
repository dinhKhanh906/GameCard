
public class GameManager {
	private int playerAmount = 2; // default has 2 player
	//private Player currentPlayer;
	
	public Player[] playerList = new Player[playerAmount];
	public static void main(String[] args) {
		Poker poker = new Poker();
		poker.showCard();
	}
}
