package aggregation.ex1;

import simpleClasses.ex8.Customer;

import java.util.ArrayList;

public class Text {
    private Word heading;
    private ArrayList<Sentence> listText = new ArrayList<>();

    public Text(Word heading, ArrayList<Sentence> listText) {
        this.heading = heading;
        this.listText = listText;
    }

    public Text(ArrayList<Sentence> listText) {
        this.listText = listText;
    }

    public void addSentenceToList(Sentence sentence) {
        listText.add(sentence);
    }

    public ArrayList<Sentence> getListText() {
        return listText;
    }

    public Word getHeading() {
        return heading;
    }

    public void printList(ArrayList<Sentence> listText) {
        for (Sentence s : listText) {
            System.out.println(s.toString());
        }
    }

//    public String toString() {
//        return getHeading() + "\n" + getListText();
//    }
}