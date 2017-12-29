package jp.ac.uryukyu.ie.e175764;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Rule{

    public String[] Shuffle(String[] card){
        List<String> cards= Arrays.asList(card);
        Collections.shuffle(cards);
        String[] deck=(String[])cards.toArray();
        return deck;
    }

    public String[]
}