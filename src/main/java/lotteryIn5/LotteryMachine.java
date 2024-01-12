package lotteryIn5;

import java.util.*;

public class LotteryMachine {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        //使用者輸入
        System.out.print("請輸入總球數:");
        Integer lotteryBallInputS = scannerInt.nextInt();

        System.out.print("請輸入取球數:");
        Integer finalBallInputS = scannerInt.nextInt();

        System.out.print("請輸入不想要的數字:");
        String rejectInputS = scannerString.nextLine();

        System.out.print("請輸入一定要有的數字:");
        String wantedInputS = scannerString.nextLine();

        LotteryGame3_Rubyyyyyer lotteryGame = new LotteryGame3_Rubyyyyyer(lotteryBallInputS, finalBallInputS, rejectInputS, wantedInputS);


        lotteryGame.userInputBallNum();
//        lotteryGame.userInputWinningBall();
        lotteryGame.userInputRejectNum();
        lotteryGame.userInputWantedNum();
        lotteryGame.finalBall();
    }
}
