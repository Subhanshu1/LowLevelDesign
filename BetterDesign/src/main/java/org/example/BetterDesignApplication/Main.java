package org.example.BetterDesignApplication;

import org.example.BetterDesignApplication.DocumentEditor.Models.Document;
import org.example.BetterDesignApplication.DocumentEditor.Models.ImageElement;
import org.example.BetterDesignApplication.DocumentEditor.Models.TextElement;
import org.example.BetterDesignApplication.DocumentEditor.PersistenceStrategy.Persistence;
import org.example.BetterDesignApplication.DocumentEditor.PersistenceStrategy.SaveToDB;
import org.example.BetterDesignApplication.DocumentEditor.PersistenceStrategy.SaveToFile;

public class Main {
    public static void main(String[] args) {

        Document document = new Document();

        TextElement text1 = new TextElement("Hello World");
        ImageElement image1 = new ImageElement("Screenshot.png");

        document.addElement(text1);
        document.addElement(image1);

        System.out.println(document.render());

        Persistence per = new SaveToDB();

        per.save(document.render());
    }
}