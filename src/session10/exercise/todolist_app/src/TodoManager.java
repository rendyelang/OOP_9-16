import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TodoManager extends TodoControllers {
    String filePath = "D:\\ALL ABOUT NP University\\PERKULIAHAN\\Semester 4\\OOP\\practice\\OOP_9-15\\src\\session10\\exercise\\todolist_app\\src\\output\\";

    @Override
    public void addTodo(String fileName) {
        File fileObj = new File(filePath + fileName + ".txt");
        try {
            if (fileObj.createNewFile()) {
                System.out.println("Created todo: " + fileObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Something wrong");
            // e.printStackTrace();
        }
    }

    @Override
    public void writeTodo(String fileName, String text) {
        try {
            FileWriter fileObj = new FileWriter(filePath + fileName + ".txt");
            fileObj.write(text);
            fileObj.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            // e.printStackTrace();
        }
    }

    @Override
    public String readTodo(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            File fileObj = new File(filePath + fileName + ".txt");
            Scanner scanner = new Scanner(fileObj);
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append(System.lineSeparator());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file. Maybe the file does not exist.");
            // e.printStackTrace();
        }
        return content.toString().trim();
    }

    @Override
    public void updateTodo(String fileName, String updatedText) {
        try {
            File fileObj = new File(filePath + fileName + ".txt");
            if (!fileObj.exists()) {
                System.out.println("The file doesn't exist");
                return;
            }
            FileWriter fileWriter = new FileWriter(fileObj, true);
            fileWriter.write(System.lineSeparator() + updatedText);
            fileWriter.close();
            System.out.println("Successfully updated the file");
        } catch (Exception e) {
            System.out.println("An error occurred while updating the file.");
            System.out.println("Maybe the file does not exist.");
        }
    }

    @Override
    public void deleteTodo(String fileName) {
        try {
            File fileObj = new File(filePath + fileName + ".txt");
            if (fileObj.delete()) {
                System.out.println("Deleted the file: " + fileObj.getName());
            } else {
                System.out.println("Failed to delete the file. The file may not exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file.");
        }
    }

    @Override
    public void readAllTodos() {
        File folder = new File(filePath);
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles == null || listOfFiles.length == 0) {
            System.out.println("There is no ToDo. Let's create one!");
        } else {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    System.out.println("Todo: " + file.getName());
                }
            }
        }
    }
}