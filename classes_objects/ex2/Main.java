package simpleClasses.ex2;

public class Main {
    public static void main(String[] args) {
        Test2 test = new Test2();
        System.out.println("Name: " + test.getName() + "; " + "age: " + test.getAge());

        Test2 test1 = new Test2("Иван", 31);
        System.out.println("Name: " + test1.getName() + "; " + "age: " + test1.getAge());

        test1.setAge(10);
        test1.setName("Алиса");
        System.out.println("Name: " + test1.getName() + "; " + "age: " + test1.getAge());
    }
}
