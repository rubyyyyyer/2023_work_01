package lotteryEasy;

import java.util.Set;

public class LotteryBig extends Lottery {
    int lotteryBallNum = 49;
    int winningBallNum = 6;

    @Override
    public Set autoNum() {
        while (winningBallList.size() < winningBallNum) {
            int randomNum = (int) (Math.random() * 100);
//            System.out.println(randomNum);
            if (randomNum + 1 <= lotteryBallNum) {
                winningBallList.add(randomNum);
//                System.out.println("有來大樂透");
            }
        }
        return winningBallList;
    }
}
