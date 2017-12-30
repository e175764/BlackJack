package jp.ac.uryukyu.ie.e175764;

public class Card {
    public static String[] make_cards(int Jok){//Jokはjokerの枚数
        String[] card;
        int k=0;
        card=new String[52+Jok];
        for(int i=0;i<=3;i++) {          //0...ハート,1...ダイヤ,2...スペード,3...クローバー
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
        if(Jok>0){
            while(k<Jok){
                card[52+k]="Joker";
                k++;
            }
        }
        return card;
    }
}
