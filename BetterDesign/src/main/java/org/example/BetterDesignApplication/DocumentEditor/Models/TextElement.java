package org.example.BetterDesignApplication.DocumentEditor.Models;

public class TextElement {


    public String render(String element){
        return "Image: " + element + "\n";
    }

    public String addElementInDocument(String text){
        return text;
    }
}
