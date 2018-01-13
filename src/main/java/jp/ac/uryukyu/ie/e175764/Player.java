package jp.ac.uryukyu.ie.e175745;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Player {
    public void Player(String card){
        String[] hands ={};
        List<String> cards = new LinkedList<>(Arrays.asList(hands));
        cards.add(card);
        System.out.println("Your hand:/n"+card);
        String hand_1 = card.replaceAll("[^0-9]", "");//手札1枚目(数字データのみ)
        int num_1 = Integer.parseInt(hand_1);  //int型にcast

        if(hands.length>=2) {
            String s = String.valueOf(num_1);
            System.out.println("Total value of your hands:" + s);
            System.out.println("If you want more card, please input 1.");
            System.out.println("(If not, please input 0.)");
        }

    }
}