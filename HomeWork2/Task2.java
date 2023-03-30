package HomeWork2;

import java.io.*;
import java.nio.file.Files;
import java.util.zip.ZipEntry;

public class Task2 {

    public static void main(String[] args) {
        tsk2("E:\\HomeWorks_Java\\HomeWork2\\");
    }

    private static void tsk2(String path) {

        File file = new File(File.pathSeparator);
        if (file.isDirectory()) {
            return;
        }
        try {
            File.createTempFile(path, "test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Writer writer = new FileWriter("E:\\HomeWorks_Java\\HomeWork2\\test.txt")) {
                writer.write("test ".repeat(25));
                writer.write("\n");
                writer.write("test ".repeat(25));
                writer.write("\n");
                writer.write("test ".repeat(25));
                writer.write("\n");
                writer.write("test ".repeat(25));
        } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }







