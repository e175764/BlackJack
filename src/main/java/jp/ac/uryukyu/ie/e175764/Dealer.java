package jp.ac.uryukyu.ie.e175764;
import java.util.Arrays;


public class Dealer extends Player{
    public void Dealer(String[] hands){
        super.Player(hands);
    }

    @Override
    public void draw(String[] hands, int value) {
        Dealer d1=new Dealer();
        Global.d_total=value;

        if(hands.length>=2) {
            String s = String.valueOf(value);
            if(value<17) {
                rule.deal(d1,hands);
            }
        }
    }
}
