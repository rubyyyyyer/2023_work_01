package lotteryEasy;

import java.util.HashSet;
import java.util.Set;

public abstract class LotteryGame_course {
    //儲存 lotteryBall 的數字集合
    Set<Integer> lotteryBall = new HashSet<>();
    //要選出幾顆球?
    int winningNum = 0;

    //電腦選號(沒有實作的抽象方法)
    public abstract void generate();

    //檢查數字對不對(有實作的話可以直接被子類別繼承，也可以被覆寫。)
    public Boolean validata() {
        if (lotteryBall.size() == winningNum) {
            return true;
        } else {
            return false;
        }
    }
}
