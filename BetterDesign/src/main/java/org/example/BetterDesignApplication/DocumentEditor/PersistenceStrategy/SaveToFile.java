package org.example.BetterDesignApplication.DocumentEditor.PersistenceStrategy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile implements Persistence{

    public void save(String render){
        try {
            File file = new File("C://Users//subabbar//Desktop//LowLevelDesign//BetterDesign//src//main//resources//document.txt");

            File parentDir = file.getParentFile();
            if (parentDir != null && !parentDir.exists()) {
                parentDir.mkdirs(); // Creates parent directories if they don't exist
            }

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(render);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
