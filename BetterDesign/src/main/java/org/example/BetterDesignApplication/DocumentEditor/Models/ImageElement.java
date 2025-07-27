package org.example.BetterDesignApplication.DocumentEditor.Models;

public class ImageElement implements DocumentElement{

    private String image;

    public ImageElement(String image){
        this.image = image;
    }

    public String render(){
        return "Image: " + image + "\n";
    }
    

}
