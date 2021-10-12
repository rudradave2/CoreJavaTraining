package com.carddealer;

public class Dealer {

	// C: clubs - D: Diamond - H: Heart - S: Spades
	// cards 1-10 and J Q K

	final int size = 52;
	Card[] deck = new Card[size];
	
	
	public Dealer() {
        int count=0;

        String[] suits = {"D","C","H","S"};
        String[] ranks ={"K","Q","J","10","9","8","7","6","5","4","3","2","1"};
        
        for (String s:suits){
            for (String r:ranks){
                Card card = new Card(s, r);
                this.deck[count] = card;
                count++;
            }
        }
	}
	public void showCards(){
        System.out.println("---------------------------------------------");
        int count =0;
        for (Card card : deck){
            System.out.print(card.rank + " of " + card.suit + "     ");
            count++;
            if(count%4==0)
                System.out.println("");
        }
        System.out.println("---------------------------------------------");
    }
	
    public void dealCards(Players player1,Players player2,Players player3,Players player4){

        int count = 0;

        for (Card card : deck){

            if (count>38){
                player1.playCards[count%13] = card;
                //System.out.println(player1.playCards[count/12].rank+"   "+player1.playCards[count/12].suit);
            }
            else if (count>25){
                player2.playCards[count%13] = card;
            }
            else if (count>12){
                player3.playCards[count%13] = card;
            }
            else{
                player4.playCards[count%13] = card;
            } 
            count++;
        }
    }
}
