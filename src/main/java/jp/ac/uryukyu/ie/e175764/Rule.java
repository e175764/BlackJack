package jp.ac.uryukyu.ie.e175764;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Rule {
    Player p1 = new Player();

    public String[] Shuffle(String[] card) {
        List<String> cards = new LinkedList<>(Arrays.asList(card));
        Collections.shuffle(cards);
        String[] deck = cards.toArray(new String[cards.size()]);
        return deck;
    }

    public void deal(String[] deck) {
        for (int i = 0; i < 2; i++) {
            p1.Player(deck[i]);
            List<String> cards = new LinkedList<>(Arrays.asList(deck));
            cards.remove(i);
            deck = cards.toArray(new String[cards.size()]);
        }
    }

    public int Total(int card) {
        int total = 0;
        total += card;
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