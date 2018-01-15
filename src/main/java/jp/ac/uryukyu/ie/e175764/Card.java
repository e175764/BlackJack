package jp.ac.uryukyu.ie.e175764;

public class Card {
    /*トランプ52枚を生成するメソッド11
    *トランプを入れる変数cardを作り、それぞれのカードに割り当てる52の数字を入れる。
    *0〜３までの変数iをfor文に用いてトランプのマークを決める。
    *カードの数字を決めるための1〜12までの変数jを用いて1〜13のカード作る。
    *上記の変数を使い52枚のトランプを数字にそれそれ当てはめていく。
    *生成した変数cardを返す。*/

    public static String[] make_cards(){
        String[] card;
        card=new String[52];
        for(int i=0;i<=3;i++) {
            for (int j = 0; j <= 12; j++) {
                if (i == 0) {
                    card[(i * 12) + j] = "ハート(" + String.valueOf(j+1) + ")";
                } else if (i == 1) {
                    card[(i * 12) + (j+1)] = "ダイヤ(" + String.valueOf(j+1) + ")";
                } else if (i == 2) {
                    card[(i * 12) + (j+2)] = "スペード(" + String.valueOf(j+1) + ")";
                } else {
                    card[(i * 12) + (j+3)] = "クローバー(" + String.valueOf(j+1) + ")";
                }
            }
        }
        return card;
    }
}
