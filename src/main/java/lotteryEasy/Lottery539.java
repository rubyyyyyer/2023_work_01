package lotteryEasy;

import java.util.Set;

public class Lottery539 extends Lottery {
    int lotteryBallNum = 39;
    int winningBallNum = 5;

    @Override
    public Set autoNum() {
        while (winningBallList.size() < winningBallNum) {
            int randomNum = (int) (Math.random() * 100);
//            System.out.println(randomNum);
            if (randomNum + 1 <= lotteryBallNum) {
                winningBallList.add(randomNum);
//                System.out.println("有來539");
            }
        }
        return winningBallList;
    }
}
