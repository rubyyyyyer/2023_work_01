package boxMediumFail;

import java.util.*;

public  class Box {
    float userHeight;
    float userWidth;
    float userLength;
    float boxHeight;
    float boxWidth;
    float boxLength;

    List<Float> box = new ArrayList<Float>();
    List<Float> userObj = new ArrayList<Float>();

    public Box(float boxHeight, float boxWidth, float boxLength) {
        this.boxHeight = boxHeight;
        this.boxWidth = boxWidth;
        this.boxLength = boxLength;
    }

    public List userObj() {
        userObj = new ArrayList<Float>() {
            {
                add(userHeight);
                add(userWidth);
                add(userLength);
            }
        };
        System.out.println("使用者in之前"+userObj);
        userObj.sort(Comparator.naturalOrder());
        System.out.println("使用者in之後"+userObj);
        return userObj;
    }

    public List box() {
        box = new ArrayList<Float>() {
            {
                add(boxHeight);
                add(boxWidth);
                add(boxLength);
            }
        };
        System.out.println("箱子in之前"+box);
        box.sort(Comparator.naturalOrder());
        System.out.println("箱子in之後"+box);
        return box;
    }

    public boolean compare() {
        int count = 0;
        if (userHeight <= boxHeight) {
            count++;
        }
        if (userWidth <= boxWidth) {
            count++;
        }
        if (userLength <= boxLength) {
            count++;
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }
}

