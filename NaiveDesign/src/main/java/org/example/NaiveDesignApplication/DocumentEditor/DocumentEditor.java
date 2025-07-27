package org.example.NaiveDesignApplication.DocumentEditor;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {

    private final List<String> element;

    public DocumentEditor(){
        element = new ArrayList<>();
    }

    void addText(String Text){
        element.add(Text);
    }

    void addImage(String Image){
        element.add(Image);
    }

     String renderDocuments(){
        
        String output = "";
        if(!element.isEmpty()){
            for(String item : element){
                int len = item.length();
                if(len >4 && item.substring(len-4,len).equals(".img")){
                    System.out.println("Image: " + item);
                    output+= item + "\n";
                }
                else {
                    System.out.println(item);
                    output+= item + "\n";;
                }
            }
       }
       return output;
    }
    
    void writeFile(){
        
        String outputFile = renderDocuments();

        FileWriter fileWriter = null;
        try {
            File file = new File("C://Users//subabbar//Desktop//LowLevelDesign//NaiveDesign//src//main//java//org//example//NaiveDesignApplication//DocumentEditor//filename.txt");
            File parentDir = file.getParentFile();
            if (parentDir != null && !parentDir.exists()) {
                parentDir.mkdirs(); // Creates parent directories if they don't exist
            }

            fileWriter = new FileWriter(file);
            fileWriter.write(outputFile);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
