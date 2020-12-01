package com.epamlearn.javabasics.module5.ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory {
    private String directoryName;
    private ArrayList<TextFile> files = new ArrayList<>();
    private ArrayList<Directory> directories = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public ArrayList<TextFile> getFiles() {
        return files;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public void setFiles(ArrayList<TextFile> files) {
        this.files = files;
    }

    public void renameDirectory(String newName) {
        this.setDirectoryName(newName);
    }

    public void addDirectory(Directory directory) {
        directories.add(directory);
    }

    public void addFile(TextFile file) {
        this.files.add(file);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "directoryName='" + directoryName + '\'' +
                ", files=" + files +
                ", directories=" + directories +
                '}';
    }

    public void printDirectoryName() {
        System.out.println(getDirectoryName());
    }

    public void deleteFile(String fileName) {
        Iterator<TextFile> fileIterator = files.iterator();
        while (fileIterator.hasNext()) {
            File nextFile = fileIterator.next();
            if (nextFile.getFileName().equals(fileName)) {
                fileIterator.remove();
            }
        }
    }
}
