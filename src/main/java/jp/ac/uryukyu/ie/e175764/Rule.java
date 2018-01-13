package jp.ac.uryukyu.ie.e175745;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Rule{
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

    public int Total(int card){
        int total;
        ace = new ace();
        if (card==11 || card==12 || card==13){
            card =10;
        }else if(card==1){
            if(ace == true){
                card = 10;
            }
        }
        total+= card;
        return total;
    }

    public void Judge(int p_total,int d_total){
        int p_diff = 0;
        int d_diff = 0;
        p_diff = 21-p_total;
        d_diff = 21-d_total;
        if (d_diff > p_diff){
            System.out.println("you win!\nAs luck would have it.");
        }else if (p_diff > p_diff){
            System.out.println("you lose,,\nIs there also such a day.");
        }else{
            System.out.println("draw\nIt was a good game.");
        }
    }
}