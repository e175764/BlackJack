package jp.ac.uryukyu.ie.e175764;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Rule {
    Player p1 =new Player();

    public String[] Shuffle(String[] card) {
        List<String> cards = Arrays.asList(card);
        Collections.shuffle(cards);
        String[] deck = (String[]) cards.toArray();
        return deck;
    }

    public void deal(String[] deck) {
        for(int i=0;i<2;i++){
                p1.Player(deck[i],deck[52-i]);
        }
    }
    public 
}