package aggregation.ex1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String str1 = "Так я сделал еще одно важное открытие: его родная планета вся-то величиной с дом!";
        Sentence sentence1 = new Sentence(str1);

        String str2 = "Впрочем, это меня не слишком удивило.";
        Sentence sentence2 = new Sentence(str2);

        String str3 = "Я знал, что, кроме таких больших планет, как Земля, Юпитер, Марс, Венера, " +
                "существуют еще сотни других и среди них такие маленькие, что их даже в телескоп " +
                "трудно разглядеть.";
        Sentence sentence3 = new Sentence(str3);


        Text text1 = new Text(new ArrayList<>());
        text1.addSentenceToList(sentence1);
        text1.addSentenceToList(sentence2);
        text1.addSentenceToList(sentence3);
        System.out.println("Print text: " + "\n");
        text1.printList(text1.getListText());
        System.out.println(" ");

        String str4 = "Когда астроном открывает такую планетку, он дает ей не имя, а просто номер.";
        Sentence sentence4 = new Sentence(str4);
        String heading = "Маленький принц";
        Word wordHeading = new Word(heading);
        Text text2 = new Text(wordHeading, text1.getListText());
        text2.addSentenceToList(sentence4);

        System.out.println("print text with title and added sentence: " + "\n");
        System.out.println(text2.getHeading());
        text2.printList(text2.getListText());

    }
}
