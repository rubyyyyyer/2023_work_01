package boxMedium;

public abstract class Object {
    Float width;
    Float height;
    Float length;

    public Object(Float width, Float height, Float length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public abstract boolean check(Float width, Float height, Float length);
}
