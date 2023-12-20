package train.station;

import java.util.Scanner;

public class Conductor {
    public static void main(String[] args) {
        int bookingAgain = 0;
        int oneWayPrice = 1000;
        float discount = 0.9f;
        Scanner scanner = new Scanner(System.in);
        while (bookingAgain!=-1){

            System.out.print("您要買幾張「單」程票?");
            int oneWayNum = scanner.nextInt();
            System.out.print("您要買幾張「雙」程票?");
            int roundTripNum = scanner.nextInt();

            Cashier cashier = new Cashier(oneWayPrice, oneWayNum, roundTripNum, discount);
            cashier.count();

            System.out.print("請問您要繼續訂票嗎? 請輸入「任意數字」或「-1」離開本系統:");
            bookingAgain = scanner.nextInt();

            System.out.println((bookingAgain == -1)?"謝謝您的蒞臨!歡迎下次光臨":"歡迎您繼續使用本系統");

        }

    }
}
