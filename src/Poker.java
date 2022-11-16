
public class Poker {
	public Card[] allCards = new Card[52];
	public int cardRemain = 52;
	
	public Poker(){
		createNewPoker();
	}
	
	public void createNewPoker() {
		int index = 0; // max index = 51
		for(int suit = 0; suit < 4; suit++) {
			for(int number = 0; number < 13; number++) {
				Card newCard = new Card(number, suit); 
				allCards[index] = newCard;
				index++;
			}
		}
	}
	
	public void showCard() {
		for(int i=0; i<52; i++) {
			Card cardCurrent = allCards[i];
			System.out.println(i+1 + ". " +cardCurrent.getNumber() + " " + cardCurrent.getSuit());
		}
	}
}
