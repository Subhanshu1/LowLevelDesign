package org.example.BetterDesignApplication.DocumentEditor.PersistenceStrategy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile implements Persistence{

    public void save(String render){
        File file = new File("C://Users//subabbar//Desktop//LowLevelDesign//BetterDesign//src//main//resources//document.txt");

        file.mkdirs();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(render);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
