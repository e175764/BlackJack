package jp.ac.uryukyu.ie.e175764;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Rule {

    public String[] Shuffle(String[] card) {
        List<String> cards = Arrays.asList(card);
        Collections.shuffle(cards);
        String[] deck = (String[]) cards.toArray();
        return deck;
    }

    public void deal(String[] deck,int num) {
        for(int i=0;i<num;i++){
            for(int j=0;j<2;j++){

                String card_1 = deck[(i+1)*(j+1)].replaceAll("[^0-9]", "");//手札1枚目(数字データのみ)
                int num_1 = Integer.parseInt(card_1);  //int型にcast
                String card_2 = deck[52-(i+1)*(j+1)].replaceAll("[^0-9]", "");//2枚目(数字データのみ)
                int num_2 = Integer.parseInt(card_2);  //int型にcast
            }
        }
    }
}