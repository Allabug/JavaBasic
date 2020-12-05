package com.epamlearn.javabasics.module5.ex1;

public class TextFile extends File {
    private String text;

    public TextFile(Directory directory, String filename, String text) {
        super(directory, filename);
        setText(text);
    }

    public void setText(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Text not found");
        } else {
            this.text = text;
        }
    }

    public String getText() {
        return text;
    }

    public void addText(String text) {
        StringBuilder stringBuilder = new StringBuilder(this.text);
        stringBuilder.append(' ');
        this.text = stringBuilder.append(text).toString();
    }

    public void printFileContent() {
        System.out.println(text);
    }
}
