package org.example.BetterDesignApplication.DocumentEditor.Models;

public class TextElement implements DocumentElement{

    private String text;

    public TextElement(String text){
        this.text = text;
    }

    public String render(){
        return text + "\n";
    }

}
