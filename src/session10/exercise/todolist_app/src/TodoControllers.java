public abstract class TodoControllers {
    public abstract void addTodo(String fileName);
    public abstract void writeTodo(String fileName, String text);
    public abstract String readTodo(String fileName);
    public abstract void updateTodo(String fileName, String updatedText);
    public abstract void deleteTodo(String fileName);
    public abstract void readAllTodos();
}
