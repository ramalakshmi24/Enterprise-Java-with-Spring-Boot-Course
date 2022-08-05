// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Game {
    public static void main(String args[]) {

        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.getNumberOfPlayers();
        u.collectNumFromPlayer();
        int result = u.compareFirstRound();

        if (result > 1) {
            u.collectNumFromGuesser();
            u.collectNumFromPlayer();
            u.compareFinalRound();
        }
    }
}

class Guesser {
    int guessNum;

    public int guessNumber() {

        System.out.println("Guesser kindly enter the number.");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Players {
    int pGuessNumber;

    public int guessNumber(int p, int gNum) {
        int range1 = (gNum / 10) * 10;
        int range2 = (gNum / 10 + 1) * 10;
        System.out.println("Player-" + (p + 1) + " kindly enter the number. (HINT: Number is between " + range1 + "-"
                + range2 + ")");
        Scanner sc = new Scanner(System.in);
        pGuessNumber = sc.nextInt();
        return pGuessNumber;
    }

}

class Umpire {
    int guesserNumber;
    int playersNum;
    int count = 0;
    int p[] = new int[10];
    int winner[] = new int[10];

    public void collectNumFromGuesser() {
        Guesser g = new Guesser();
        guesserNumber = g.guessNumber();
    }

    public void getNumberOfPlayers() {
        int invalidNum;

        do {
            invalidNum = 0;
            System.out.println("Kindly enter the number of players participating (min=1,max=10).");
            Scanner sc = new Scanner(System.in);
            playersNum = sc.nextInt();

            if (playersNum <= 0 || playersNum > 10) {
                invalidNum = 1;
                System.out.println("Invalid number.Try again!\n");
            }
        } while (invalidNum == 1);
    }

    public void collectNumFromPlayer() {

        if (count == 0) {
            for (int i = 0; i < playersNum; i++) {
                Players player = new Players();
                p[i] = player.guessNumber(i, guesserNumber);
            }
        }

        else if (count > 1) {
            for (int i = 0; i < playersNum; i++) {

                if (winner[i] == 1) {
                    Players player = new Players();
                    p[i] = player.guessNumber(i, guesserNumber);
                }

            }
        }

    }

    public int compareFirstRound() {
        int i;

        for (i = 0; i < playersNum; i++) {

            if (p[i] == guesserNumber) {
                winner[i] = 1;
                System.out.print("player-" + (i + 1) + ", ");
                count++;
            } else
                winner[i] = 0;
        }

        if (count == 0) {
            System.out.println("Game lost. Better luck next time!");

        }

        else if (count == 1)
            System.out.println("Won the game.Congratulations!!!");

        else {
            System.out.println("Qualified for Final round. Good luck!\n");
            System.out.println("-------------------FINAL ROUND-----------------\n");
        }

        return count;
    }

    public void compareFinalRound() {
        int i, count = 0;

        for (i = 0; i < playersNum; i++) {

            if (p[i] == guesserNumber && winner[i] == 1) {

                System.out.print("player-" + (i + 1) + ", ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Game lost. Better luck next time!");

        }

        else
            System.out.println("Won the game.Congratulations!!!");

    }
    

}
