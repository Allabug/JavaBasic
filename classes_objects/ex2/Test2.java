package simpleClasses.ex2;

public class Test2 {
    private int age;
    private String name;
    private int group;

    public Test2() {
        this.name = "Кирилл";
        this.age = 35;
    }

    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
