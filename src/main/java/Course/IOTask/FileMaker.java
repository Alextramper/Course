package Course.IOTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        String words = "This file was made for expamples and to solve a tasks";
       try{
           File file = new File("C:/Users/Alex/IdeaProjects/Project/src/main/java/Course/IOTask/file1.txt");
           fileWriter = new FileWriter(file);
           fileWriter.write(words);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           try {
               fileWriter.close();
           }catch (IOException e) {
               e.printStackTrace();
           }
       }

    }
}
