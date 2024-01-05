package lotteryMedium;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lottery539 extends LotteryGame {
    int lotteryNum = 7;
    int winningNum = 5;
    int randomNum;
    int userInput;


    @Override
    public Set<Integer> rejectNum() {
        int check = 0;
        while (check != -1) {
//            System.out.print("請從1-" + lotteryNum + "輸入你不要的數字:");
//            userInput = scanner.nextInt();

            userInput = 3;
            rejectNum.add(userInput);
            userInput = 4;
            rejectNum.add(userInput);
            userInput = 6;
            rejectNum.add(userInput);

//            System.out.print("要繼續請輸入「任意鍵」，要結束請輸入「-1」。");
//            check = scanner.nextInt();
            check = -1;
        }
        return rejectNum;
    }

    @Override
    public Set<Integer> autoNum() {
//        for (int i = 0; i < winningNum; i++) {
//        }
        randomNum = random.nextInt(7) + 1;
        System.out.println("\t" + randomNum + "\t" + rejectNum.contains(randomNum));
        if (!rejectNum.contains(randomNum) && !autoNum.contains(randomNum)) {
            autoNum.add(randomNum);
        }
        return autoNum;
    }
}
