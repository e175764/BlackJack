package jp.ac.uryukyu.ie.e175764;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Player {
    Global g=new Global();
    Rule rule = new Rule();
    int value;
    public void Player(String[] hands) {
        List<String> cards = new LinkedList<>(Arrays.asList(hands));
        String card=rule.hit();
        cards.add(card);
        hands = cards.toArray(new String[cards.size()]);
        value = rule.Total(hands);
        draw(hands,value);

    }

    public void draw(String[] hands,int value) {
        Player p1 = new Player();
        int num = 1;
        if (hands.length >= 2) {
            System.out.println("Your hands:" + Arrays.toString(hands));
            String s = String.valueOf(value);
            for(int i=0;i<hands.length;i++){
                String hand =hands[i].replaceAll("[^0-9]", "");//手札1枚目(数字データのみ)
                int card=Integer.parseInt(hand);
                Global.Ace=rule.ace(card);
            }
            g.p_total=value;
            if (num == 1) {
                System.out.println("Total value of your hands:" + s);
                System.out.println("If you want more card, please input 1.");
                System.out.println("(If not, please input 0.)");
                Scanner scan = new Scanner(System.in);
                num = scan.nextInt();
                if (num == 1) {
                    rule.deal(p1, hands);
                }
            }

        }
    }
}
