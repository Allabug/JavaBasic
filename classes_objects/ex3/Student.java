package simpleClasses.ex3;

public class Student {
    private String fullName;
    private int groupNumber;
    private int[] grades;

    public Student() {
    }

    public Student(String fullName, int groupNumber, int[] grades) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.grades = grades;
    }

    public static void printBestStudents(Student[] students) {
        for (Student s : students) {
            int countMaxGrades = 0;
            for (int g : s.grades) {
                if (g >= 9) {
                    countMaxGrades++;
                }
                if (countMaxGrades == s.grades.length) {
                    System.out.println("Name best student " + s.fullName + " number of group " + s.groupNumber);
                }
            }
        }
    }
}
