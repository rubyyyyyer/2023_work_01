package boxMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請用空白鍵分隔，輸入包裹的長寬高:");
        String userInput = scanner.nextLine();
        String[] userInputText = userInput.split(" ");
        List<Float> userInputNum = new ArrayList<>();
        for (int i = 0; i < userInputText.length; i++) {
            userInputNum.add(Float.valueOf(userInputText[i]));
        }
        //Box obj
        //A:長23      寬14      高13 (cm)
        //B:長39.5    寬27.5    高23 (cm)
        Object userInputObj = new Package(userInputNum.get(0), userInputNum.get(1), userInputNum.get(2));
//        System.out.println(userInputObj.width);
//        System.out.println(userInputObj.height);
//        System.out.println(userInputObj.length);
        Box boxA = new Box(23f, (float) 14, (float) 13);
        Box boxB = new Box(39.5f, (float) 27.5, (float) 23);
        Boolean aResult = boxA.check(userInputObj);
        Boolean bResult = boxB.check(userInputObj);

        if (aResult == true && bResult == true) {
            System.out.println("2個箱子都能放，但放A箱子比較便宜!");
        } else if (aResult == false && bResult == true) {
            System.out.println("只能選B箱子");
        } else {
            System.out.println("包裹太大，都放不下了!");
        }
    }
}
