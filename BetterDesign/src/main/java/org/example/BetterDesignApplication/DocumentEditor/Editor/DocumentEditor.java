package org.example.BetterDesignApplication.DocumentEditor.Editor;

import org.example.BetterDesignApplication.DocumentEditor.Models.Document;
import org.example.BetterDesignApplication.DocumentEditor.Models.DocumentElement;
import org.example.BetterDesignApplication.DocumentEditor.PersistenceStrategy.Persistence;
import org.springframework.beans.factory.annotation.Autowired;

public class DocumentEditor {

    @Autowired
    Document document;

    @Autowired
    Persistence db;

    public void add(DocumentElement documentElement){
        document.addElement(documentElement);
    }

    public void saveType(String str){
        db.save(str);
    }

}
