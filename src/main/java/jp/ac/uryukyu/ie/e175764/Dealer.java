package jp.ac.uryukyu.ie.e175764;
import java.util.Arrays;


public class Dealer extends Player{
    //Dealerクラスの基本部分はPlayerを継承。
    public void Dealer(String[] hands){
        super.Player(hands);
    }

    /*draw:
    * 引数としてString型配列とint型変数をとる。
    * String型配列に手札を、int型変数には手札の合計値を渡す。
    * ディーラーのドロー判定は、ディーラーのルールにしたがって行う。
    * 手札の合計値が17以上の時は必ずステイしなければならない。
    * 17未満の場合には17以上になるまでドローが必要。
    * ドロー後に手札と合計値を更新する。*/
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
