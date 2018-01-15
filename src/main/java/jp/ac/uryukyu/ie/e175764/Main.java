package jp.ac.uryukyu.ie.e175764;

public class Main {
    static String[] p_hands={};
    static String[] d_hands={};
    public static void main(String[] args) {
        Player p1 = new Player();
        Dealer d1 = new Dealer();
        Rule rule=new Rule();
        String[] deck;

        deck = Card.make_cards();
        deck=rule.Shuffle(deck);
        rule.Rule(deck);

        d_hands=rule.deal(d1,d_hands);
        d_hands=rule.deal(d1,d_hands);

        p_hands=rule.deal(p1,p_hands);
        p_hands=rule.deal(p1,p_hands);

        rule.Judge(Global.p_total,Global.d_total);
    }
}