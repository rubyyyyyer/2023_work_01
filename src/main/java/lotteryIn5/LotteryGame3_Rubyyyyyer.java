package lotteryIn5;

import java.util.*;

public class LotteryGame3_Rubyyyyyer {
    Random random = new Random();
    Integer lotteryBallInputS;
    Integer finalBallInputS;
    String rejectInputS;
    String wantedInputS;
    List<Integer> lotteryBallNum = new ArrayList<>();
    List<Integer> finalBallNum = new ArrayList<>();
    List<Integer> rejectInputInputArrNum = new ArrayList<>();
    List<Integer> wantedInputInputArrNum = new ArrayList<>();


    public LotteryGame3_Rubyyyyyer(Integer lotteryBallInputS, Integer finalBallInputS, String rejectInputS, String wantedInputS) {
        this.lotteryBallInputS = lotteryBallInputS;
        this.finalBallInputS = finalBallInputS;
        this.rejectInputS = rejectInputS;
        this.wantedInputS = wantedInputS;
    }

    //總球數
    public List<Integer> userInputBallNum() {
        for (int i = 0; i < lotteryBallInputS; i++) {
            lotteryBallNum.add(i + 1);
        }
        return lotteryBallNum;
    }
    //要抽出幾顆球
    public int userInputWinningBall() {
        return finalBallInputS;
    }

    //不要的球號
    public List<Integer> userInputRejectNum() {
        String[] rejectInputInputArr = rejectInputS.split(" ");
        for (int i = 0; i < rejectInputInputArr.length; i++) {
            rejectInputInputArrNum.add(Integer.valueOf(rejectInputInputArr[i]));
        }
        return rejectInputInputArrNum;
    }
    //想要的球號
    public List<Integer> userInputWantedNum() {
        String[] wantedInputInputArr = wantedInputS.split(" ");
        for (int i = 0; i < wantedInputInputArr.length; i++) {
            wantedInputInputArrNum.add(Integer.valueOf(wantedInputInputArr[i]));
        }
        return wantedInputInputArrNum;
    }

    public List<Integer> finalBall() {
        //從lotteryBallNum刪除使用者不要的球號
        lotteryBallNum.removeAll(rejectInputInputArrNum);
        //把使用者想要的球號放進finalBallNum
        finalBallNum = wantedInputInputArrNum;
        //從lotteryBallNum刪除使用者想要的球號
        lotteryBallNum.removeAll(wantedInputInputArrNum);
        //算出還剩下幾個要亂數跑的球
        int remainBall = 8 - wantedInputInputArrNum.size();
        for (int i = 0; i < remainBall; i++) {
            int randomIndex = random.nextInt(lotteryBallNum.size());
            finalBallNum.add((Integer) lotteryBallNum.get(randomIndex));
            lotteryBallNum.remove(randomIndex);
        }
        //排序
        finalBallNum.sort(Comparator.naturalOrder());
        System.out.println("印出彩票:" + finalBallNum);
        return finalBallNum;
    }
}