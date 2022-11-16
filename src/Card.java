
public class Card {
	public enum Suit{
		diamonds("Rô"), // chất rô
		hearts("Cơ"),  // chất cơ
		clubs("Nhép"), // chất nhép
		spades("Bích"); // chất bích
		
		// value
		private String name;
		// constructor
		private Suit(String name) {
			this.name = name;
		}
		// getter & setter
		public String getValue() {
			return this.name;
		}
	}
	
	public enum Number{
		ace(1), // quân Át 
		two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), // quân từ 2 -> 10
		jack(11), // quân J 
		queen(12), // quân Q
		king(13); // quân K
		
		// value
		private int index;
		// constructor
		private Number(int index) {
			this.index = index;
		}
		// getter & setter
		public int getValue() {
			return this.index;
		}
	}
	private Number number;
	private Suit suit;
	
	public Card(Card.Number number, Card.Suit suit) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.suit = suit;
	}
	
	public Card(int number, int suit) {
		this.number = Number.values()[number];
		this.suit = Suit.values()[suit];
	}
	
	public Number getNumber() {
		return this.number;
	}
	
	public void setNumber(Number number) {
		this.number = number;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
