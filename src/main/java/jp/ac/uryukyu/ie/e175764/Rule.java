package jp.ac.uryukyu.ie.e175764;
import java.util.*;

public class Rule {
    Player p1 =new Player();

    public String[] Shuffle(String[] card) {
        List<String> cards = new LinkedList<>(Arrays.asList(card));
        Collections.shuffle(cards);
        String[] deck = cards.toArray(new String[cards.size()]);
        return deck;
    }

    public void deal(String[] deck) {
        for(int i=0;i<2;i++){
            p1.Player(deck[i]);
            List<String> cards = new LinkedList<>(Arrays.asList(deck));
            cards.remove(i);
            deck = cards.toArray(new String[cards.size()]);
        }
    }
}