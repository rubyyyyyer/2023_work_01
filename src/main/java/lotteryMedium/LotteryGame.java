package lotteryMedium;

import java.util.*;

public abstract class LotteryGame {
    int lotteryNum;
    int winningNum;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Set<Integer> rejectNum = new HashSet<>();
    Set<Integer> autoNum = new HashSet<>();
    Set<Integer> finalNum = new HashSet<>();

    public abstract Set<Integer> rejectNum();

    public abstract Set<Integer> autoNum();

    public Boolean checkNum(int winningNum) {
        autoNum.removeAll(rejectNum);
        System.out.println("2nd電腦選號:" + autoNum);
        System.out.println("winningNumA:" + winningNum);
        if (autoNum.size() == winningNum) {
            System.out.println("印出彩券："+autoNum);
            return true;
        } else {
//            autoNum();
            return false;
        }
    }

    ;
//    public void finalNum(){
//        if (checkNum()==true){
//            System.out.println("印出結果"+autoNum);
//        }else {
//            autoNum();
//        }
//    }

}
