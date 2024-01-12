package boxMediumFail;

public class BoxB extends Box {
    public BoxB(float boxHeight, float boxWidth, float boxLength, float userHeight, float userWidth, float userLength) {
        super(boxHeight, boxWidth, boxLength);
        this.userHeight = userHeight;
        this.userWidth = userWidth;
        this.userLength = userLength;
    }

}
