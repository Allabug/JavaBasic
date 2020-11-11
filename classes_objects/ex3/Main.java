package simpleClasses.ex3;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        Student[] students = new Student[10];
        students[0] = new Student("Hanks T.", 4, new int[]{9, 10, 9, 9, 10});
        students[1] = new Student("Hopkins A.", 2, new int[]{7, 7, 8, 6, 6});
        students[2] = new Student("Newman P.", 10, new int[]{7, 7, 8, 9, 10});
        students[3] = new Student("Washington D.", 2, new int[]{7, 7, 8, 9, 10});
        students[4] = new Student("Penn S.", 3, new int[]{7, 7, 8, 7, 7});
        students[5] = new Student("Freeman M.", 1, new int[]{7, 7, 8, 6, 7});
        students[6] = new Student("DiCaprio L.", 8, new int[]{9, 10, 10, 9, 9});
        students[7] = new Student("Crowe R.", 6, new int[]{7, 7, 8, 5, 5});
        students[8] = new Student("Spacey K.", 7, new int[]{7, 7, 8, 6, 6});
        students[9] = new Student("Connery S.", 2, new int[]{7, 7, 8, 9, 7});
        obj.printBestStudents(students);
    }
}
