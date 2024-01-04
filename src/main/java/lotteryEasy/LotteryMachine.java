package lotteryEasy;

public class LotteryMachine {
    public static void main(String[] args) {
        int lottery539Num = 3;
        int lotteryBigNum = 2;
        Lottery lottery539 = new Lottery539();
        Lottery lotteryBig = new LotteryBig();
        for (int i=0;i<lottery539Num;i++){
            lottery539 = new Lottery539();
            System.out.println("539："+lottery539.autoNum());
        }
        for (int j=0;j<lotteryBigNum;j++){
            lotteryBig = new LotteryBig();
            System.out.println("大樂透："+lotteryBig.autoNum());
        }
    }
}
