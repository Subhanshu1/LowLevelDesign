package org.example.NaiveDesignApplication.DocumentEditor;

public class Main {

    public static void main(String[] args) {

        DocumentEditor documentEditor = new DocumentEditor();

        documentEditor.addText("momos");
        documentEditor.addImage("ScreenShot.img");
        documentEditor.addText("GolGappe");

        documentEditor.writeFile();
    }
}
