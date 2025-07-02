import java.util.Scanner;
import java.util.Random;
public class Dice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello, "+name+"!");
        Random rn = new Random();
        int dice1 = rn.nextInt(6);
        System.out.println("Rolling the dice...");
        System.out.println("Dice 1: " + dice1);
        Random rn1 = new Random();
        int dice2 = rn1.nextInt(6);
        System.out.println("Dice 2: " + dice2);
        int total = dice1+dice2;
        System.out.println("Total value:"+ total);
        if (total > 7) {
            System.out.println(name +" " +"won!");
        } else {
            System.out.println(name +" " +"lost!");
        }

    }
}



