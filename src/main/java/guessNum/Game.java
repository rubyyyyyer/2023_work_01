package guessNum;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secretNum=random.nextInt(10)+1;
        System.out.println("secretNum:"+secretNum);
        int userInput=0;
        while (userInput!=secretNum){
            System.out.println("Please enter a number：");
            userInput = scanner.nextInt();
//            System.out.println("使用者輸入:"+userInput);
            if(userInput>secretNum){
                System.out.println("lower");
            }else if(userInput<secretNum){
                System.out.println("higher");
            }else {
                System.out.println("Good! The number is\t"+secretNum);
            }

        }


/*        int userInput = 0;
        while (userInput != -1) {
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();
            System.out.println(userInput);
        }*/

 /*       int i = 0;
        do {
            System.out.println("Count:" + i);
            i++;
        } while (i < 3);
        System.out.println("Final:" + i);*/
    }
}
