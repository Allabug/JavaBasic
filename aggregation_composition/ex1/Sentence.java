package aggregation.ex1;

import Decomposition.A;

import java.util.ArrayList;

class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    public String toString() {
        return sentence;
    }
}
