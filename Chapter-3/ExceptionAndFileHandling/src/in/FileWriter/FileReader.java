package in.FileWriter;

import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {

        String fileName = "java-course.txt";

        try (java.io.FileReader fileReader = new java.io.FileReader(fileName)) {

            int read;

            do {
                read = fileReader.read();

                if (read != -1) {
                    System.out.print((char) read);
                }

            } while (read != -1);

        } catch (IOException exception) {
            System.out.printf("Exception occurred: %s%n", exception.getMessage());
        }
    }
}