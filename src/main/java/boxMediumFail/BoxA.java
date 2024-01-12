package boxMediumFail;

public class BoxA extends Box {
    public BoxA(float boxHeight, float boxWidth, float boxLength, float userHeight, float userWidth, float userLength) {
        super(boxHeight, boxWidth, boxLength);
        this.userHeight = userHeight;
        this.userWidth = userWidth;
        this.userLength = userLength;
    }
}


