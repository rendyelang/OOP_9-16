import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        app();
    }

    static void app() {
        TodoManager todoManager = new TodoManager();
        Scanner scanner = new Scanner(System.in);
        int decision;
        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("===================================");
            System.out.println("Welcome to todo application");
            System.out.println("Here are the menus:");
            System.out.println("1. Read all ToDos");
            System.out.println("2. Add ToDo");
            System.out.println("3. Write ToDo");
            System.out.println("4. Read ToDo");
            System.out.println("5. Update ToDo");
            System.out.println("6. Delete ToDo");
            System.out.println("0. Exit");
            System.out.println("What do you want? (0-6)");
            try {
                decision = scanner.nextInt();
                scanner.nextLine();
                switch (decision) {
                    case 1:
                        todoManager.readAllTodos();
                        break;
                    case 2:
                        System.out.println("Please input the ToDo name: ");
                        String name = scanner.nextLine();
                        todoManager.addTodo(name);
                        break;
                    case 3:
                        System.out.println("Please input the file name you want to write: ");
                        String fileName = scanner.nextLine();
                        System.out.println("Input the text: ");
                        String text = scanner.nextLine();
                        todoManager.writeTodo(fileName, text);
                        break;
                    case 4:
                        System.out.println("Please input the file name you want to read: ");
                        String readFileName = scanner.nextLine();
                        String content = todoManager.readTodo(readFileName);
                        System.out.println("Content of " + readFileName + ":");
                        System.out.println(content);
                        break;
                    case 5:
                        System.out.println("Please input the file name you want to update: ");
                        String updateFileName = scanner.nextLine();
                        System.out.println("Input the updated text: ");
                        String updatedText = scanner.nextLine();
                        todoManager.updateTodo(updateFileName, updatedText);
                        break;
                    case 6:
                        System.out.println("Please input the file name you want to delete: ");
                        String deleteFileName = scanner.nextLine();
                        todoManager.deleteTodo(deleteFileName);
                        break;
                    case 0:
                        System.out.println("Exiting the application...");
                        break;
                }
            } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number between 0 and 5.");
            }
            if (continueProgram) {
                // scanner.nextLine();
                System.out.println("Do you want to perform another operation? (yes/no)");
                String continueInput = scanner.nextLine();
                if (continueInput.equalsIgnoreCase("no")) {
                    continueProgram = false;
                } else if (!continueInput.equalsIgnoreCase("yes")) {
                    System.out.println("Invalid input. Exiting the application.");
                    continueProgram = false;
                }
            }
        }
        scanner.close();
    }
}
