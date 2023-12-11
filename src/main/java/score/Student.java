package score;

public class Student {
    String name;
    String id;
    int eng;
    int math;


    public Student(String name, String id, int eng, int math) {
        this.name = name;
        this.id = id;
        this.eng = eng;
        this.math = math;

    }

    public void showScore() {
        System.out.println(name + "(" + id + ")" + "\t" + "math:" + eng + "\t" + "eng:" + math + "\t" + "average:" + ((math + eng) / 2));
    }
}
