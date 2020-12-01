package com.epamlearn.javabasics.module5.ex1;


public class TextFile extends File {
    private String text;

    public TextFile(Directory directory, String filename, String text) {
        super(directory, filename);
        setText(text);
        super.getDirectory().addFile(this);
    }

    public void setText(String text) {
        if (text.isEmpty()) {
            System.out.println("Введен пустой текст");
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

    public String printFileContent() {
        return text;
    }
}
