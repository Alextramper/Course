package Course.IOTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO_SymbolCopy {
    public static void main(String[] args) throws IOException {
        FileReader fileread = null;
        FileWriter filewr = null;
        try {
            fileread = new FileReader("C:/Users/Alex/IdeaProjects/Project/src/main/java/Course/IOTask/file1.txt");
            filewr = new FileWriter("F:\\My files\\fileSymbol.txt");
            int c;
            while( (c = fileread.read())!= -1 ) {
                filewr.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileread.close();
            filewr.close();
        }
    }
}
