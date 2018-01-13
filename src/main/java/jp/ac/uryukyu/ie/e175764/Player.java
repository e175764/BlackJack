package jp.ac.uryukyu.ie.e175764;
import java.util.Scanner;
public class Player {
    public void Player(String card_1,String card_2){
        System.out.println("Your hand:/n"+card_1+"/n"+card_2);
        String hand_1 = card_1.replaceAll("[^0-9]", "");//手札1枚目(数字データのみ)
        int num_1 = Integer.parseInt(hand_1);  //int型にcast
        String hand_2 = card_2.replaceAll("[^0-9]", "");//2枚目(数字データのみ)
        int num_2 = Integer.parseInt(hand_2);  //int型にcast
        String s = String.valueOf(num_1+num_2);
        System.out.println("Total value of your hands:"+s);
        System.out.println("If you want more card, please input 1.");
        System.out.println("(If not, please input 0.)");


    }
}
