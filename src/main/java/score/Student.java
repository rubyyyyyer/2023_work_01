package score;

public class Student {
    String name;
    String id;
    int eng;
    int math;
    static int pass = 60;


    public Student(String name, String id, int eng, int math) {
        this.name = name;
        this.id = id;
        this.eng = eng;
        this.math = math;

    }

    public int highest() {

//        int max = (eng>math)? eng:math;
/*        int max = 0;
        if (eng > math) {
            max = eng;
        } else {
            max = math;
        }
        return max;*/
        return (eng > math) ? eng : math;
    }

    public int getAverage() {
        return ((math + eng) / 2);
    }

    public void showScore() {
        int average = getAverage();
        String grading = "";
        switch (average / 10) {
            case 9:
                grading = "A";
                break;
            case 8:
                grading = "B";
                break;
            case 7:
                grading = "C";
                break;
            case 6:
                grading = "D";
                break;
            default:
                grading = "F";

        }
/*        if(getAverage()<=100 && getAverage()>=90){
            grading = "A";
        }else if(getAverage()<=89 && getAverage()>=80){
            grading = "B";
        }else if(getAverage()<=79 && getAverage()>=70){
            grading = "C";
        }else if(getAverage()<=69 && getAverage()>=60){
            grading = "D";
        }else {
            grading = "F";
        }*/
        System.out.print(name + "(" + id + ")" + "\t" + "math:" + eng + "\t\t" + "english:" + math + "\t\t\t\t\t" + "average:" +
                getAverage() + "\t" + ((getAverage() >= pass) ? "PASS" : "FAILED") + "\t" +
                "highest:" + highest() + "\t" + "grading:" + grading +"\n");




  /*      if (getAverage() >= 60){
            System.out.println("\tPASS!");
        }else{
            System.out.println("\tFAILED!");
        }*/
    }
}
