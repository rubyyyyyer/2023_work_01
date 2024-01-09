package boxEasy;

public class BoxB {
//    float weight;
//    float height;
//    float length;
//
//    public BoxB(float weight, float height, float length) {
//        this.weight = weight;
//        this.height = height;
//        this.length = length;
//    }

    public Boolean check(float weight, float height, float length){
        //A:長23      寬14      高13 (cm)
        //B:長39.5    寬27.5    高23 (cm)
        if (weight<=39.5 && height<=27.5 && length<=23){
            return true;
        }else {
            return false;
        }
    }
}
