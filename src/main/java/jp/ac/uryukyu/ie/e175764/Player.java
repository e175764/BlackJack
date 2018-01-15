package jp.ac.uryukyu.ie.e175764;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Player {
    /* Player:
    * Ruleクラスのインスタンスを作成する
    * int型の変数valueを作成する
    * 引数としてストリング配列handsをとる
    * handsをリスト型に変換する
    * hitメソッドでdeckから0番から30番の中からランダムで選ばれた要素をString型変数cardに保存する
    * リストcards最後の要素にcardを追加する
    * リストcardsを配列に変換したものを変数handsとして設定する
    * valueにtotalメソッドで計算したhandsの要素の合計を代入する
    * 引数をhandsとvalueとしてdrawメソッドを呼び出す
    */
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

    /*draw:
    * 引数としてString型配列,int型変数をとる。
    * String型配列には手札を渡し、int型変数には手札の合計値を渡す。
    * Playerクラス型のインスタンスを生成し,dealに渡せるようにする。
    * 自分の手札とその合計値を表示し、もう一枚引くかどうかを選択できる。
    * 1を入力した場合にはもう一枚引き,0を入力した場合には勝敗判定に移動する。*/
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
            Global.p_total=value;
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