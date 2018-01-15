package jp.ac.uryukyu.ie.e175764;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Rule {
    static String[] deck;
    public void Rule(String[] deck){
        this.deck=deck;
    }

    public String[] Shuffle(String[] card) {
        List<String> cards = new LinkedList<>(Arrays.asList(card));
        Collections.shuffle(cards);
        deck = cards.toArray(new String[cards.size()]);
        return deck;
    }

    public String[] deal(Player player,String[] hands) {
        Random ran =new Random();
        int i = ran.nextInt(30);
        player.Player(hands);
        List<String> hand = new LinkedList<>(Arrays.asList(hands));
        hand.add(deck[i]);
        hands = hand.toArray(new String[hand.size()]);
        List<String> cards = new LinkedList<>(Arrays.asList(deck));
        cards.remove(i);
        deck = cards.toArray(new String[cards.size()]);
        player.value = Total(hands);
        return hands;
    }

     public String hit() {
        Random ran =new Random();
        int i = ran.nextInt(30);
        while(deck[i]==null) {
            i = ran.nextInt(30);
        }
        return deck[i];
    }

    public int Total(String[] hands) {
        int total=0;
        for(int i=0;i<hands.length;i++){
            String hand =hands[i].replaceAll("[^0-9]", "");//手札1枚目(数字データのみ)
            int card=Integer.parseInt(hand);
            if (card==11 || card==12 || card==13){
                card =10;
            }else if(card==1){
                if(Global.Ace == true){
                    card = 11;
                }
            }
            total+=card;

        }
        return total;
    }

    public void Judge(int p_total,int d_total){
        int p_diff = 0;
        int d_diff = 0;
        p_diff = 21-p_total;
        d_diff = 21-d_total;
        System.out.println("Dealer's total:"+d_total);
        System.out.println("Player's total:"+p_total);
        if (p_total>21 && d_total>21){
            System.out.println("you win!\nAs luck would have it.");
        }else if(p_total>21){
            System.out.println("you lose,,\nIs there also such a day.");
        }else if(d_total>21){
            System.out.println("you win!\nAs luck would have it.");
        }else{
            if (d_diff > p_diff){
                System.out.println("you win!\nAs luck would have it.");
            }else if (p_diff > d_diff){
                System.out.println("you lose,,\nIs there also such a day.");
            }else{
                System.out.println("draw\nIt was a good game.");
            }
        }
    }


    public boolean ace(int card) {
        boolean ace_change=true;
        if (card == 1) {
            System.out.println("please　chose  1 or 11.");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 1) {
                ace_change = false;
            } else if (num == 11) {
                ace_change = true;
            }
        }
        return ace_change;
    }

}