package boxMedium;

import java.util.Scanner;

public class BoxCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入商品的長寬高(用空白隔開)：");
        String userinput = scanner.nextLine();
        String[] userinputToInt = userinput.split(" ");
        for (int i = 0; i < userinputToInt.length; i++) {
            Integer userinputToIntNum = Integer.parseInt(userinputToInt[i]);
            System.out.println(userinputToIntNum);
        }
    }
}
