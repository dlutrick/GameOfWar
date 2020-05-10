package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	Card card;
	
	public Player() {
		score = 0;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe(Player player) {
		System.out.println(player.getName() + " : " + player.getScore());
		System.out.println("Current hand : " + player.getHand());
	}
	
	public Card flip(List<Card> hand) {
		Card topCard = hand.remove(0);
		return topCard;
	}
	
	public Card draw(Deck deck) {
		return deck.getCards().remove(0);
	}
	
	public int incrementScore() {
		score += 1;
		
		return score;
	}
	
}
