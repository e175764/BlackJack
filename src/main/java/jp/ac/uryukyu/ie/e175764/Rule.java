package jp.ac.uryukyu.ie.e175764;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Rule {
    static String[] deck;
    public void Rule(String[] deck){
        this.deck=deck;
    }
     /* Shuffle:
     * 引数としてString型配列を受け取る。
     * それを一旦、List型に変換し、shuffleメソッドを呼び出す。
     * shuffleしたものをString型配列に戻す。
     * String型配列を返す。
     * トランプのデッキをシャッフルするためのメソッド*/
    public String[] Shuffle(String[] card) {
        List<String> cards = new LinkedList<>(Arrays.asList(card));
        Collections.shuffle(cards);
        deck = cards.toArray(new String[cards.size()]);
        return deck;
    }

     /* deal:
     * 引数としてPlayerクラス型変数,String型配列の2つを受け取る。
     * playerは手札を配る相手を指定(Dealer,Player)している。
     * handsは配る人の手札を表している。
     * deckからランダムに1枚を取り出してhandsに追加する。
     * handsを戻り値を返す。
     * 手札を配るためのメソッド。*/
    public String[] deal(Player player,String[] hands) {
        Random ran =new Random();
        int i = ran.nextInt(30);
        player.Player(hands);
        List<String> hand = new LinkedList<>(Arrays.asList(hands));
        hand.add(deck[i]);
        hands = hand.toArray(new String[hand.size()]);
        List<String> cards = new LinkedList<>(Arrays.asList(deck));
        cards.remove(i);
        deck = cards.toArray(new String[cards.size()]);
        player.value = Total(hands);
        return hands;
    }

    /*hit:
    * 引数は取らない。
    * deckからランダムに1枚取り出す。
    * 戻り値として返す。*/
     public String hit() {
        Random ran =new Random();
        int i = ran.nextInt(30);
        while(deck[i]==null) {
            i = ran.nextInt(30);
        }
        return deck[i];
    }

    /*Total:
    * 引数としてString型配列をとる。
    * handsにはプレイヤーあるいはディーラーの手札を渡す。
    * 受け取った手札の1枚ずつを、数字部分だけを取り出してint型にcastする。
    * 数字部分が11以上の場合には10としてカウントする。
    * 1(Ace)の場合には11か1かを任意で決定できるようにする。
    * 手札の合計値を計算して戻り値として返す。*/
    public int Total(String[] hands) {
        int total=0;
        for(int i=0;i<hands.length;i++){
            String hand =hands[i].replaceAll("[^0-9]", "");//手札1枚目(数字データのみ)
            int card=Integer.parseInt(hand);
            if (card==11 || card==12 || card==13){
                card =10;
            }else if(card==1){
                if(Global.Ace){
                    card = 11;
                }else {
                    card = 1;
                }
            }
            total+=card;

        }
        return total;
    }

    /*Judge:
    * 引数としてint型を2つとる。
    * p_totalにはプレイヤーのトータルを,d_totalにはディーラーの手札を渡す。
    * それらの21との差分の大小を比較し勝敗判定をする。
    * d_totalが21を超えた場合(バースト)には無条件でプレイヤーが勝利。*/
    public void Judge(int p_total,int d_total){
        int p_diff = 0;
        int d_diff = 0;
        p_diff = 21-p_total;
        d_diff = 21-d_total;
        System.out.println("Dealer's total:"+d_total);
        System.out.println("Player's total:"+p_total);
        if (p_total>21 && d_total>21){
            System.out.println("you win!\nAs luck would have it.");
        }else if(p_total>21){
            System.out.println("you lose,,\nRainy days never stay.");
        }else if(d_total>21){
            System.out.println("you win!\nAs luck would have it.");
        }else{
            if (d_diff > p_diff){
                System.out.println("you win!\nAs luck would have it.");
            }else if (p_diff > d_diff){
                System.out.println("you lose,,\nRainy days never stay.");
            }else{
                System.out.println("draw\nIt was a good game.");
            }
        }
    }

    /*ace:
    * 引数としてint型の変数cardをとる
    * boolean型の変数ace_changeを作成し、trueに設定する
    * 引数として持ってきた変数が1の時に、入力待ちの状態にする
    * 入力された数字が1の時、ace_changeをfalseに変更する
    * 入力された数字が11の時、ace_changeをtrueに変更する
    * 戻り値としてace_changeを返す
    */

    public boolean ace(int card) {
        boolean ace_change=true;
        if (card == 1) {
            System.out.println("please　chose  1 or 11.");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 1) {
                ace_change = false;
            } else if (num == 11) {
                ace_change = true;
            }
        }
        return ace_change;
    }

}