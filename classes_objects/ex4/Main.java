package simpleClasses.ex4;
import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Vilnius", "567B", "16:55");
        trains[1] = new Train("Minsk", "651CE", "8:00");
        trains[2] = new Train("Warsaw", "600A", "14:30");
        trains[3] = new Train("Vilnius", "863F", "17:20");
        trains[4] = new Train("Berlin", "511B", "10:05");

        Train obj = new Train();

        System.out.println("Сортировка поездов по номеру: ");
        Train[] sortTrainsByNumb =  obj.sortByTrainNumber(trains);
        obj.printedArray(sortTrainsByNumb);

        System.out.println("Получить информацию о поезде по его номеру: ");
        obj.printInformationAboutTrainByNumber(trains);

        System.out.println("сортировка поездов по пункту назначения: ");
        Train[] sortByDestination = obj.sortArrayByDestination(trains);
        obj.printedArray(sortByDestination);



    }

}
