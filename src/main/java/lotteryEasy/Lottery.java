package lotteryEasy;

import java.util.*;

public abstract class Lottery {
    int lotteryBallNum = 0;
    int winningBallNum = 0;
    Set<Integer> winningBallList = new HashSet<>();
    public abstract Set autoNum();
    }