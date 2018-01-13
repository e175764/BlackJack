package jp.ac.uryukyu.ie.e175764;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int total=0;
        String[] hands={};
        Rule rule=new Rule();
        String[] deck;
            deck = Card.make_cards();
            System.out.println(Arrays.asList(deck));
        deck=rule.Shuffle(deck);
        hands=rule.deal(hands);
        hands=rule.deal(hands);
    }
}

