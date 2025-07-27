package org.example.BetterDesignApplication.DocumentEditor.Models;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Document {

    @Autowired
    DocumentElement documentElement;

    List<DocumentElement> elements;

    public Document(){
        elements = new ArrayList<>();
    }

    public void addElement(DocumentElement documentElement){
        elements.add(documentElement);
    }

    public String render(){
        String display = "";
        for(DocumentElement item : elements){
            display = display + item.render();
        }
        return display;
    }

}
