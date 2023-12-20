package guessNum;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
/*        for (int i=1;i<=3;i++){
            System.out.println(i);
        }*/


        /*for (int i = 1; i <= 5; i++) {
            System.out.print("請輸入數字:");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            System.out.println("第" + i + "次:" + userInput);
            if (userInput == -1) {
                break;
            }
        }
        System.out.println("結束這局!");
        */


       /* int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
        */

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int secrete = new Random().nextInt(10) + 1;
        System.out.println("秘密數字:" + secrete);
        for (int i = 5; i > 0; i--) {
            System.out.print("請輸入數字(" + i + "/5):");
            userInput = scanner.nextInt();
            if (userInput > secrete) {
                System.out.println("小一點");
            } else if (userInput < secrete) {
                System.out.println("大一點");
            } else {
                System.out.println("贏了!");
                break;
            }
        }
    }
}
