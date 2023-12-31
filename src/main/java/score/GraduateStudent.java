package score;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 75;

    public GraduateStudent(String name, String id, int eng, int math, int thesis) {
        super(name, id, eng, math);
        this.thesis = thesis;
    }

    @Override
    public int highest() {
        int max;
        //方法一
        /*
        if (eng > math) {
            max = eng;
        } else {
            max = math;
        }
        if (thesis > max) {
            max = thesis;
        }
        return max;*/

        //方法二
        max = eng>math?(eng>thesis?eng:thesis):(math>thesis?math:thesis);
        return max;
    }

    @Override
    public int getAverage() {
        return ((math + eng + thesis) / 3);
    }

    @Override
    public void showScore() {
        int average = getAverage();
        String grading;
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

        System.out.print(name + "(" + id + ")" + "\t" + "math:" + eng + "\t\t" + "english:" + math + "\t\t" + "thesis:" + thesis + "\t" + "average:" +
                getAverage() + "\t" + ((getAverage() >= pass) ? "PASS" : "FAILED") + "\t" +
                "highest:" + highest() + "\t" + "grading:" + grading + "\n");
    }
}