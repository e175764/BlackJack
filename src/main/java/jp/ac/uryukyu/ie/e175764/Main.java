package jp.ac.uryukyu.ie.e175764;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please type in the number of Joker (0~2).");
            Scanner scan = new Scanner(System.in);
            int jok = scan.nextInt();
            if (jok<-1 || jok>2) {
                System.out.println("The number of Joker is out of range.");
            } else {
                String[] deck = Card.make_cards(jok);
                System.out.println(Arrays.asList(deck));
                break;
            }
        }
    }
}

