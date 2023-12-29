package score;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
//        Student student = userInput();
//        Student.pass = 60;
        Student studentA = new Student("Rubyyyyer", "1200", 90, 99);
        Student studentB = new Student("Ericcccc","1201",60,90);
        Student studentC = new Student("Janeeee","1300",40,20);
        GraduateStudent graduateStudentA = new GraduateStudent("Selinnnn","1368",60,60,100);
        studentA.showScore();
        studentB.showScore();
        studentC.showScore();
        graduateStudentA.showScore();

    }

    @NotNull
    private static Student userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name:");
        String name = scanner.next();
        Integer idNum = (int) Math.round(Math.random() * 1000);
        String id = Integer.toString(idNum);
        System.out.println(id);
        System.out.print("eng score?");
        int eng = scanner.nextInt();
        System.out.print("math score?");
        int math = scanner.nextInt();

        Student student = new Student(name, id, eng, math);

        return student;
    }
}
