package com.epamlearn.javabasics.module5.ex1;

public class Test {
    public static void main(String[] args) throws FileNotFound {

        String text1 = "Здесь могла бы быть очень важная информация.";
        String text2 = "Добавить еще один раздел.";
        String text3 = "Последняя попытка обновить файл.";
        Directory newCatalog = new Directory("Important documents");
        TextFile textFile = new TextFile(newCatalog, "NewTextFile", text1);
        newCatalog.addFile(textFile);

        System.out.println("add text to file:");
        textFile.addText(text2);
        textFile.addText(text3);
        textFile.printFileContent();
        System.out.println(" ");

        System.out.println("Rename file: ");
        textFile.renameFile("Modified file");
        textFile.printFileName();
        System.out.println(" ");

        System.out.println("Rename directory: ");
        newCatalog.renameDirectory("New directory");
        newCatalog.printDirectoryName();
        System.out.println(" ");

        System.out.println("Add another text file to the directory");
        TextFile textFile1 = new TextFile(newCatalog, "Second file", text3);
        newCatalog.addFile(textFile1);
        for (File f : newCatalog.getFiles()) {
            System.out.println(f.toString());
        }
        System.out.println(" ");

        System.out.println("Let's delete the file named \"Modified file\"");
        try {
            newCatalog.deleteFile("Modified file");
        } catch (FileNotFound ex) {
            System.out.println(ex.getMessage());
        }

        for (File f : newCatalog.getFiles()) {
            System.out.println(f.toString());
        }
    }
}
