package lotteryIn5;


import java.util.*;

public class LotteryMachine {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scannerInt = new Scanner(System.in);
        System.out.print("請輸入總球數:");
        Integer lotteryBall = scannerInt.nextInt();
        ArrayList<Integer> lotteryBallNum = new ArrayList<>();
        System.out.print("請輸入最後球數:");
        Integer finalBall = scannerInt.nextInt();
        ArrayList<Integer> finalBallNum;
        for (int i = 0; i < lotteryBall; i++) {
            lotteryBallNum.add(i + 1);
        }
        System.out.println("lotteryBallNum內容:" + lotteryBallNum);


        Scanner scannerString = new Scanner(System.in);
        System.out.print("請輸入不要的數字:");
        String rejectInputS = scannerString.nextLine();
        String[] rejectInputsArr = rejectInputS.split(" ");
        ArrayList<Integer> rejectInputsNum = new ArrayList<>();
        System.out.println("StringArr長度:" + rejectInputsArr.length);
        for (int i = 0; i < rejectInputsArr.length; i++) {
            rejectInputsNum.add(Integer.valueOf(rejectInputsArr[i]));
        }
        System.out.println("rejectInputsNum內容:" + rejectInputsNum);


        System.out.print("請輸入一定要有的數字:");
        String wantedInputS = scannerString.nextLine();
        String[] wantedInputsArr = wantedInputS.split(" ");
        ArrayList<Integer> wantedInputsNum = new ArrayList<>();
        System.out.println("StringArr長度:" + wantedInputsArr.length);
        for (int i = 0; i < wantedInputsArr.length; i++) {
            wantedInputsNum.add(Integer.valueOf(wantedInputsArr[i]));
        }
        System.out.println("wantedInputsNum內容:" + wantedInputsNum);



        lotteryBallNum.removeAll(rejectInputsNum);
        System.out.println("扣掉不要的球內容:" + lotteryBallNum);
        int ball = finalBall-wantedInputsArr.length;

        lotteryBallNum.removeAll(wantedInputsNum);
        System.out.println("扣掉要的球內容:" + lotteryBallNum);

        finalBallNum=wantedInputsNum;
        for (int i = 0; i < ball; i++){
        int numIndex = random.nextInt(lotteryBallNum.size());
            finalBallNum.add(lotteryBallNum.get(numIndex));
            lotteryBallNum.remove(numIndex);
        }
        finalBallNum.sort(Comparator.naturalOrder());
        System.out.println("最後最後:" + finalBallNum);
    }
}



