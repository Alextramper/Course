package Course.IOTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_ByteCopy {
    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream("C:\\Users\\Alex\\IdeaProjects\\Project\\src\\main\\java\\Course\\IOTask\\file1.txt");
            output = new FileOutputStream("F:\\My files\\file2.txt");
            int buf;
            while((buf = input.read())!= -1) {
                output.write(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
               input.close();
               output.close();
           } catch (IOException e) {
               e.printStackTrace();
           }

        }
    }
}
