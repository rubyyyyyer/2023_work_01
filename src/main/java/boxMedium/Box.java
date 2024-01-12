package boxMedium;

import java.util.*;

public class Box extends Object {

    public Box(Float width, Float height, Float length) {
        super(width, height, length);
    }

    @Override
    public boolean check(Float width, Float height, Float length) {
//        System.out.println(width + "\t" + height + "\t" + length + "\t" + "我輸入的包裹大小");
//        System.out.println(super.width + "\t" + super.height + "\t" + super.length + "\t" + "這個箱子大小");

        List<Float> packageList = new ArrayList<>();
        Collections.addAll(packageList, width, height, length);
        packageList.sort(Comparator.naturalOrder());
//        System.out.println(packageList);


        List<Float> boxList = new ArrayList<>();
        Collections.addAll(boxList, (super.width), (super.height), (super.length));
        boxList.sort(Comparator.naturalOrder());
//        System.out.println(boxList);

        int count = 0;
        if (packageList.get(0) <= boxList.get(0)) {
            count++;
        }
        if (packageList.get(1) <= boxList.get(1)) {
            count++;
        }
        if (packageList.get(2) <= boxList.get(2)) {
            count++;
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }


}
