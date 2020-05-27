package Exeptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class newtryEx {
    private static final String TEST_FILE_PATH = "src/main/resources";
    private static final String TEST_FILE_NAME = "testFile";
    private static final String LINE = "Hello";

    public static void main(String[] args) {
        File file = new File(TEST_FILE_PATH, TEST_FILE_NAME);
        try  {
            writeWithEx(file, LINE);
        } catch (IOException e) {
            System.err.println("Error of writting" + e.getMessage());
        }
        System.out.println("End of program");
    }
    private static void writeWithEx (File file, String line) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(line);
        fileWriter.flush();
        fileWriter.close();
        throw new IOException("Error while closing of thread");
    }
}