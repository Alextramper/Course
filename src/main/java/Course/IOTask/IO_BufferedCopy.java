package Course.IOTask;

import java.io.*;
import java.nio.Buffer;

public class IO_BufferedCopy {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/Alex/IdeaProjects/Project/src/main/java/Course/IOTask/file1.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(("F:\\My files\\fileBuffer.txt"))));
            String fileRead;
            while ((fileRead = br.readLine()) != null) {
                pw.write(fileRead);
            }
            pw.flush();
            br.close();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
