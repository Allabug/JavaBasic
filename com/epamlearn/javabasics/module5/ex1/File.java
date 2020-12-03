package com.epamlearn.javabasics.module5.ex1;

public class File {

    private Directory directory;
    private String fileName;

    public File(Directory directory, String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public void renameFile(String newName) {
        this.setFileName(newName);
    }

    @Override
    public String toString() {
        return "\\" + directory.getDirectoryName() + "\\" + fileName;
    }

    public void printFileName() {
        System.out.println(getFileName());
    }
}
