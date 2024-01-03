package lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class LotteryGame {
    //儲存 lotteryBall 的數字集合
    Set<Integer> lotteryBall = new HashSet<>();
    //要選出幾顆球?
    int winningNum = 0;
    //電腦選號
    public abstract void generate();

}
