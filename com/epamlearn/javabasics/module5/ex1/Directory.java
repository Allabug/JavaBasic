package com.epamlearn.javabasics.module5.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory {
    private String directoryName;
    private List<File> files = new ArrayList<>();
    private List<Directory> directories = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void renameDirectory(String newName) {
        this.setDirectoryName(newName);
    }

    public void addDirectory(Directory directory) {
        directories.add(directory);
    }

    public void addFile(File file) {
        files.add(file);
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

    public void deleteFile(String fileName) throws FileNotFound {
        boolean isFound = false;
        for (File file : files) {
            if (file.getFileName().equals(fileName)) {
                isFound = true;
            }
        }
        if (isFound) {
            for (File file : files) {
                if (file.getFileName().equals(fileName)) {
                    Iterator<File> fileIterator = files.iterator();
                    while (fileIterator.hasNext()) {
                        File nextFile = fileIterator.next();
                        if (nextFile.getFileName().equals(fileName)) {
                            fileIterator.remove();
                        }
                    }
                }
            }
        } else {
            throw new FileNotFound("File not found!");
        }
    }
}
