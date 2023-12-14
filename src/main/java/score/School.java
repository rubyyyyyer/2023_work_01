package score;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
//        Student student = userInput();
        Student student = new Student("Rubyyyyer", "1200", 20, 60);
        student.showScore();
        System.out.println("highest:" + student.highest());

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
