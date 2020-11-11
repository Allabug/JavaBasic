package simpleClasses.ex6;

public class Main {
    public static void main(String[] args) {
        Time timeNotCorrect = new Time(100, 300, -5);
        String currentTimeZero = timeNotCorrect.getTime();
        System.out.println("Установленное время: " + currentTimeZero);
        System.out.println(" ");

        Time timeCorrect = new Time(12, 20, 45);
        String currentTime = timeCorrect.getTime();
        System.out.println("Установленное время: " + currentTime);
        System.out.println(" ");

        int valueHours = 5;
        System.out.println("Изменим количество часов на " + valueHours);
        timeCorrect.changeHours(valueHours);
        System.out.println("Время с измененными часами " + timeCorrect.getTime());
        System.out.println(" ");

        int valueMinutes = -15;
        System.out.println("Изменим количество минут на " + valueMinutes);
        timeCorrect.changeMinutes(valueMinutes);
        System.out.println("Время с измененными минутами " + timeCorrect.getTime());
        System.out.println(" ");

        int valueSeconds = 30;
        System.out.println("Изменим количество секунд на " + valueSeconds);
        timeCorrect.changeSeconds(valueSeconds);
        System.out.println("Время с измененными секундами " + timeCorrect.getTime());
    }
}
