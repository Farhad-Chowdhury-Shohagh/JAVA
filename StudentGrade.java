import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[5];
    int total;
    double average;
    char grade;
}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = input.nextLine();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            student.marks[i] = input.nextInt();
            student.total += student.marks[i];
        }

        student.average = student.total / 5.0;

        if (student.average >= 80)
            student.grade = 'A';
        else if (student.average >= 70)
            student.grade = 'B';
        else if (student.average >= 60)
            student.grade = 'C';
        else if (student.average >= 50)
            student.grade = 'D';
        else
            student.grade = 'F';

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + student.name);
        System.out.println("Total Marks: " + student.total);
        System.out.printf("Average: %.2f%n", student.average);
        System.out.println("Grade: " + student.grade);

        input.close();
    }
}