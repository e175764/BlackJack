package jp.ac.uryukyu.ie.e175764;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Player {
    public void Player(String card,String[] hands) {
        Rule rule = new Rule();
        List<String> cards = new LinkedList<>(Arrays.asList(hands));
        cards.add(card);
        hands = cards.toArray(new String[cards.size()]);
        int value = rule.Total(hands);
        if(hands.length>=2) {
            System.out.println("Your hands:"+Arrays.toString(hands));
            String s = String.valueOf(value);
            while(true) {
                System.out.println("Total value of your hands:" + s);
                System.out.println("If you want more card, please input 1.");
                System.out.println("(If not, please input 0.)");
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                if (num == 1) {
                    rule.deal(hands);
                }else if(num == 0){
                        break;
                }
                }
            }

        }
}
