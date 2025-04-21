package POO.ex;

import POO.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class alunoaprovado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Student student = new Student();

        System.out.println("Enter student name: ");
        student.name = sc.nextLine();

        System.out.println("Enter first grade = ");
        student.grade1 = sc.nextDouble();

        System.out.println("Enter second grade = ");
        student.grade2 = sc.nextDouble();

        System.out.println("Enter third grade = ");
        student.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.checkStudent());

        sc.close();
    }
}
