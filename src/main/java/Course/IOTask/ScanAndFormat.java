package Course.IOTask;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Path;
import java.util.Scanner;

public class ScanAndFormat {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileReader("C:\\Users\\Alex\\IdeaProjects\\Project\\src\\main\\java\\Course\\IOTask\\file1.txt"));
            PrintWriter bw = new PrintWriter(new FileWriter("F:\\My files\\fileScanned.txt", true))) {
            String mes = Users.USERNAME.getName();
            String fileRead;
            while (sc.hasNext()) {
                fileRead = sc.nextLine();
                bw.write(fileRead + "\n");
            }
            bw.printf("Пользователь %s вошел в систему.", mes);
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

