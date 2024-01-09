package lotteryIn5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LotteryGame2_Sean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入一個數字!");
        int userInput = scanner.nextInt();
        int winningBall = 5;
        Random random = new Random();

        ArrayList<Integer> lotteryBall = new ArrayList<>();
        ArrayList<Integer> finalLotteryBall = new ArrayList<>();

        for (int i = 0; i < userInput; i++) {
            lotteryBall.add(i + 1);
        }
        System.out.println(lotteryBall);

        while (true) {
            System.out.println("請删除一個數字!");
            int rejectInput = scanner.nextInt();
            if (rejectInput == -1) {
                break;
            }

            lotteryBall.remove(lotteryBall.indexOf(rejectInput));
            System.out.println(lotteryBall);
        }
        for (int i = 0; i < winningBall; i++) {
            int randomIndex = random.nextInt(lotteryBall.size());
            System.out.println(randomIndex);
            finalLotteryBall.add(lotteryBall.get(randomIndex));
            lotteryBall.remove(randomIndex);

        }
        System.out.println("Final!" + finalLotteryBall);
    }
}
