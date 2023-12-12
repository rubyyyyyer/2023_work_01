package train.station;

import java.util.Scanner;

public class Conductor {
    public static void main(String[] args) {
        int oneWayPrice = 1000;
        float discount = 0.9f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("你要買幾張『單』程票?");
        int oneWayNum = scanner.nextInt();
        System.out.print("你要買幾張『雙』程票?");
        int roundTripNum = scanner.nextInt();


        Cashier cashier = new Cashier(oneWayPrice, oneWayNum, roundTripNum, discount);
        cashier.count();
    }
}
