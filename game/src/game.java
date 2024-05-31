 import java.util.Random;
import java.util.Scanner;

public class game{
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        System.out.println("human's choice:-");
        int human = sc.nextInt();
        if (human == 0) {
            System.out.println("you selected ROCK");

        } else if (human == 1) {
            System.out.println("you selected PAPER");
        } else if (human == 2) {
            System.out.println("you selected SCISSOR");
        } else {
            System.out.println("wrong choice");
        }
        System.out.println("Computer's choice:-");
        int computer = rc.nextInt(3);
        if (computer == 0) {
            System.out.println("computer selected ROCK");
        } else if (computer == 1) {
            System.out.println("computer selected PAPER");
        } else if (computer ==2) {
            System.out.println("computer selected SCISSOR");
        } else {
            System.out.println("wrong choice");
        }
        System.out.println("results");
        if (human == computer) {
            System.out.println("draw");
        } else if (human == 0 && computer == 2 || human == 1 && computer == 0 || human == 2 && computer == 1) {
            System.out.println("Congratulation, you win!! :)");
        } else {
            System.out.println("you lose!! Better luck next time :(");
        }
    }
}







