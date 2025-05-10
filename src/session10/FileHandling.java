package session10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    static String outputPath = "D:\\ALL ABOUT NP University\\PERKULIAHAN\\Semester 4\\OOP\\practice\\OOP_9-15\\src\\session10\\files\\";
    public static void main(String[] args) {
        try {
            // createFile("hi.txt");
            // writeFile("test.txt", "Rendy ganteng");
            // System.out.println(readFile("2025-05-10.txt"));
            // updateFile("2025-05-10.txt", "Semoga bisa!");
            deleteFile("hi.txt");
        } catch (Exception e) {
            System.out.println("Something wrong");
        }
    }

    public static void createFile(String fileName) {
        try {
            File myObj = new File(outputPath + fileName);
            System.out.println(myObj.getAbsolutePath());
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public static void writeFile(String fileName, String text) {
        try {
            FileWriter myWriter = new FileWriter(outputPath + fileName);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    static String readFile(String fileName) {
        StringBuilder fileContent = new StringBuilder();
        try {
            File myObj = new File(outputPath + fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                fileContent.append(data).append(System.lineSeparator());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            return "File you're trying to read is not found!";
        }
        return fileContent.toString().trim();
    }

    static void updateFile(String fileName, String updatedText) {
        try {
            String prevContent = readFile(fileName);
            FileWriter myWriter = new FileWriter(outputPath + fileName);
            myWriter.write(prevContent + "\n" + updatedText);
            myWriter.close();
            System.out.println("Successfully updated the file.");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occured");
            // e.printStackTrace();
        }
    }

    static void deleteFile(String fileName) {
        try {
            File myObj = new File(outputPath + fileName);
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file. It may not exist.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
