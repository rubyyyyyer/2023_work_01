package lotteryMedium;

import java.util.Set;

public class LotteryMachine {
    public static void main(String[] args) {
        LotteryGame lotteryGame539 = new Lottery539();
        System.out.println("不要的號碼:"+lotteryGame539.rejectNum());
        System.out.println("電腦選號:"+lotteryGame539.autoNum());
    }
}
