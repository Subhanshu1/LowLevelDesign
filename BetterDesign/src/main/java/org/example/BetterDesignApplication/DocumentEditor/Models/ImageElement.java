package org.example.BetterDesignApplication.DocumentEditor.Models;

public class ImageElement implements DocumentElement{


    public String render(String element){
        return element;
    }

    public String addElementInDocument(String Image){
        return Image;
    }

}
