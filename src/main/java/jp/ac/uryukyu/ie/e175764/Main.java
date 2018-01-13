package jp.ac.uryukyu.ie.e175745;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Rule rule=new Rule();
        String[] deck;
        deck = Card.make_cards();
        System.out.println(Arrays.asList(deck));
        deck=rule.Shuffle(deck);
        rule.deal(deck);
    }
}

