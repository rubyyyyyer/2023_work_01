package boxMedium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BoxCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //輸入三邊長度
        System.out.println("請輸入商品的三邊長度(用空白隔開)：");
        String userinput = scanner.nextLine();
        String[] userinputToString = userinput.split(" ");
        List<Integer> userinputToInt = new ArrayList<>();
        for (int i = 0; i < userinputToString.length; i++) {
            userinputToInt.add(Integer.parseInt(userinputToString[i]));
        }
        //排序(由低到高)
        userinputToInt.sort(Comparator.naturalOrder());
        //Box obj
        Box box = new Box(userinputToInt.get(0), userinputToInt.get(1), userinputToInt.get(2));
        System.out.println(userinputToInt);

    }


}

