package boxEasy;

import java.util.Scanner;

public class BoxCheck {
    public static void main(String[] args) {
        float weight;
        float height;
        float length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter weight:");
        weight = scanner.nextFloat();
        System.out.print("Please enter height:");
        height = scanner.nextFloat();
        System.out.print("Please enter length:");
        length = scanner.nextFloat();

        BoxA boxA = new BoxA();
        BoxB boxB = new BoxB();

        if (boxA.check(weight,height,length) == true && boxB.check(weight,height,length) == true){
            System.out.println("放在A-3款箱子");
        }else if(boxA.check(weight,height,length) == false && boxB.check(weight,height,length) == true){
            System.out.println("放在B-5款箱子");
        }else {
            System.out.println("沒有箱子可以放!");
        }



    }
}
