package org.example.BetterDesignApplication.DocumentEditor.PersistenceStrategy;

public class SaveToDB implements Persistence{

    public void save(String render){
        System.out.println("Save to DB");
    }
}
