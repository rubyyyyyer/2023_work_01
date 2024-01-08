package lotteryIn5;

import java.util.*;

public class LotteryGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入1-10中不想要的數字(用空白隔開)：");
        String rejectInputS = scanner.nextLine();
        String rejectInput[] = rejectInputS.split(" ");
        Integer rejectInputSingle;
        Integer[] rejectNum = new Integer[10];
//        List<Integer> rejectNum =new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            rejectInputSingle = Integer.valueOf(rejectInput[i]);
//            System.out.println("把個別字串轉成Integer:" + rejectInputSingle);
            rejectNum[i] = rejectInputSingle;
        }


        int[] lotteryBall = new int[10];
        int[] winningBall = new int[5];
        int randomNum;
        Set<Integer> newLotteryBall = new HashSet<>();


        for (int i = 0; i < 10; i++) {
            randomNum = random.nextInt(10) + 1;
//            System.out.println("1stNum:"+randomNum);

            for (int j = 0; j < i; j++) {

                if (randomNum == lotteryBall[j]) {
                    randomNum = random.nextInt(10) + 1;
//                    System.out.println("2ndNum:"+randomNum);
                    j = -1;
                }
            }

            lotteryBall[i] = randomNum;
        }
        System.out.println("產生10個不重複的數字:" + Arrays.toString(lotteryBall));
//        for (int i = 0; i < 10; i++) {
//            System.out.print(lotteryBall[i] + " ");
//        }

        for (int i = 0; i < 10; i++) {
            newLotteryBall.add(lotteryBall[i]);
            for (int j = 0; j < 3; j++) {
                newLotteryBall.remove(rejectNum[j]);
            }
        }
        System.out.println("最後新數字:" + newLotteryBall);

    }
}
