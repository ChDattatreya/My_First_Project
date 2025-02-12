public class Task {
    private String taskName;
    private boolean isCompleted;

    public Task(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return taskName + (isCompleted ? " (Completed)" : " (Pending)");
    }
}
