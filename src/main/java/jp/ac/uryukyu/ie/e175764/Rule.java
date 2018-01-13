package jp.ac.uryukyu.ie.e175764;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Rule {
    Player p1 = new Player();
    String[] deck;
    public String[] Shuffle(String[] card) {
        List<String> cards = new LinkedList<>(Arrays.asList(card));
        Collections.shuffle(cards);
        deck = cards.toArray(new String[cards.size()]);
        return deck;
    }

    public String[] deal(String[] hands) {
        int i=0;
        while(deck[i]==null){
            i++;
        }
        p1.Player(deck[i],hands);
        List<String> hand = new LinkedList<>(Arrays.asList(hands));
        hand.add(deck[i]);
        hands = hand.toArray(new String[hand.size()]);
        List<String> cards = new LinkedList<>(Arrays.asList(deck));
        cards.remove(i);
        deck = cards.toArray(new String[cards.size()]);
        return hands;
    }

    public int Total(String[] hands) {
        int total=0;
        for(int i=0;i<hands.length;i++){
            String hand =hands[i].replaceAll("[^0-9]", "");//手札1枚目(数字データのみ)
            total+=Integer.parseInt(hand);
        }
        return total;
    }

    public void Judge(int p_total, int d_total) {
        if (p_total > d_total) {
            System.out.println("you win!\nAs luck would have it.");
        } else {
            System.out.println("you lose,,\nIs there also such a day.");
        }
    }
}