package simpleClasses.ex5;

public class Main {
    public static void main(String[] args) {
        DecimalCounter obj1 = new DecimalCounter();
        System.out.println("Проверка значений заданных по умолчанию: ");
        System.out.println("значения по умолчанию: ");
        System.out.println("Counter: " + obj1.counter + "; min value: " + obj1.minValue + "; max value: " + obj1.maxValue);
        System.out.println(" ");

        System.out.println("Увеличение счетчика на 1:");
        obj1.increaseCounter();
        System.out.println("Counter: " + obj1.counter);
        System.out.println(" ");

        System.out.println("Уменьшение счетчика на 1:");
        obj1.decreaseCounter();
        System.out.println("Counter: " + obj1.counter);
        System.out.println(" ");

        System.out.println("Проверка значений заданных произвально: ");
        DecimalCounter obj2 = new DecimalCounter(2, 15, 8);
        System.out.println("Counter: " + obj2.counter + "; min value: " + obj2.minValue + "; max value: " + obj2.maxValue);
        System.out.println(" ");

        System.out.println("Увеличение счетчика на 1: ");
        obj2.increaseCounter();
        System.out.println(obj2.getCurrentValueOfCounter());

        System.out.println("Уменьшение счетчика на 1: ");
        obj2.decreaseCounter();
        System.out.println(obj2.getCurrentValueOfCounter());
        System.out.println(" ");

        System.out.println("Проверка выхода счетчика за пределы max value: ");
        for (int i = obj2.counter; i <= obj2.maxValue; i++) {
            obj2.increaseCounter();
        }
        System.out.println(" ");

        System.out.println("Максимальное значение counter: " + obj2.getCurrentValueOfCounter());
        System.out.println(" ");

        System.out.println("Проверка выхода счетчика за пределы min value: ");
        for (int i = obj2.counter; i >= obj2.minValue; i--) {
            obj2.decreaseCounter();
        }
        System.out.println(" ");

        System.out.println("Минимальное значение counter: " + obj2.getCurrentValueOfCounter());
        System.out.println(" ");
    }
}