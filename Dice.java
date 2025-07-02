import java.util.Scanner;
import java.util.Random;
public class Dice {
    public static void main(String[] args)
    {
        Random rn = new Random();
        int dice1 = rn.nextInt(6);
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + dice1);
        Random rn1 = new Random();
        int dice2 = rn1.nextInt(6);
        System.out.println("Die 2: " + dice2);
        int total = dice1+dice2;
        System.out.println("Total value:"+ total);

    }
}




