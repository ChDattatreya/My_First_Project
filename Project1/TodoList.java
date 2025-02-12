import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        Task newTask = new Task(taskName);
        tasks.add(newTask);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in your to-do list.");
        } else {
            System.out.println("Your To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markTaskAsCompleted(int taskNumber) {
        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            tasks.get(taskNumber - 1).markAsCompleted();
            System.out.println("Task marked as completed!");
        }
    }
}
