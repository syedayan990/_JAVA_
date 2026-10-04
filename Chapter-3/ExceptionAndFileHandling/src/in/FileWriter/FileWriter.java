package in.FileWriter;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {

        String fileName = "java-course.txt";


        try ( java.io.FileWriter writer = new java.io.FileWriter(fileName)){


            writer.write("java is the best language i am the bet coder ");
            for(int i = 0; i < 100; i++){
                writer.write("*");
            }

            writer.flush();
            writer.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException exception) {
            System.out.printf("Error occurred: %s%n", exception.getMessage());
        }
    }
}