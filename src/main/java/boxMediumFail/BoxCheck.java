package boxMediumFail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入商品的三邊長度(用空白隔開)：");
        String userInput = scanner.nextLine();
        String[] userInputToString = userInput.split(" ");
        List<Float> userInputToFloat = new ArrayList<>();
        for (int i = 0; i < userInputToString.length; i++) {
            userInputToFloat.add(Float.valueOf(userInputToString[i]));
        }
        //Box obj
        //A:長23      寬14      高13 (cm)
        //B:長39.5    寬27.5    高23 (cm)
        Box boxA = new BoxA(23, 14, 13, userInputToFloat.get(0), userInputToFloat.get(1), userInputToFloat.get(2));
        Box boxB = new BoxB(39.5F, 27.5F, 23, userInputToFloat.get(0), userInputToFloat.get(1), userInputToFloat.get(2));
        System.out.println("A箱子"+boxA.box());
        System.out.println("B箱子"+boxB.box());
        System.out.println("使用者物品"+boxA.userObj());
        if (boxA.compare() == true && boxB.compare() == true) {
            System.out.println("兩個箱子都能放，但選A比較省錢!");
        } else if (boxA.compare() == false && boxB.compare() == true) {
            System.out.println("東西太大，只能放B箱子。");
        } else {
            System.out.println("沒有可以放的尺寸!");
        }
    }
}

