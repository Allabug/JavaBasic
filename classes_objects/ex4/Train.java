package simpleClasses.ex4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Train {
    private String destination;
    private String trainNumber;
    private String time;

    Train() {
    }

    public Train(String destination, String trainNumber, String time) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.time = time;
    }

    public Train[] sortByTrainNumber(Train[] trains) {

        for (int i = 0; i < trains.length - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[j].trainNumber.compareTo(trains[minInd].trainNumber) < 0) {
                    minInd = j;
                }
            }
            Train temp = trains[minInd];
            trains[minInd] = trains[i];
            trains[i] = temp;
        }
        return trains;
    }

    public void printInformationAboutTrainByNumber(Train[] trains) {
        System.out.println("Введите номер поезда для получения информации: ");
        Scanner scanner = new Scanner(System.in);
        String numbTrain = scanner.next();
        for (Train t : trains) {
            if (numbTrain.equals(t.trainNumber)) {
                System.out.println("пункт назначения: " + t.destination + "\n" + " номер поезда: " + t.trainNumber
                        + "\n" + " время отправления: " + t.time);
            }
        }
    }

    public Train[] sortArrayByDestination(Train[] trains) {
        boolean sorted = false;

        while (!sorted) {
            Train temp;
            sorted = true;
            for (int i = 0; i < trains.length - 1; i++) {
                int j = i + 1;
                int compare = trains[i].destination.compareTo(trains[j].destination);
                if (compare > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                    sorted = false;
                } else if (compare == 0) {
                    if (trains[i].time.compareTo(trains[j].time) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                        sorted = false;
                    }
                }
            }
        }
        return trains;
    }

    public void printedArray(Train[] trains) {
        for (Train t : trains
        ) {
            System.out.println(t.destination + " " + t.trainNumber + " " + t.time);
        }
    }
}

