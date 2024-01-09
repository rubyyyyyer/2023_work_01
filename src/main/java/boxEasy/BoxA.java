package boxEasy;

public class BoxA {
//    float weight;
//    float height;
//    float length;
//
//    public BoxA(float weight, float height, float length) {
//        this.weight = weight;
//        this.height = height;
//        this.length = length;
//    }

    public Boolean check(float weight, float height, float length){
        //A:長23      寬14      高13 (cm)
        //B:長39.5    寬27.5    高23 (cm)
        if (weight<=23 && height<=14 && length<=13){
            return true;
        }else {
            return false;
        }
    }
}
