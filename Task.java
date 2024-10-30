
public final class Task {
    private final String taskName;
    private final int taskNumber;
    private final String taskDescription;
    private final String developerFirstName;
    private final String developerLastName;
    private final int taskDuration;
    private final String taskID;
    private final String taskStatus;
    
    // Constructor
    public Task(String taskName, int taskNumber, String taskDescription, String developerFirstName,
                String developerLastName, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerFirstName = developerFirstName;
        this.developerLastName = developerLastName;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
    }
    
    // Validates task description length
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }
    
    // Generates task ID in required format
    public String createTaskID() {
        String taskInitials = taskName.substring(0, 2).toUpperCase();
        String devSuffix = developerLastName.substring(developerLastName.length() - 3).toUpperCase();
        return taskInitials + ":" + taskNumber + ":" + devSuffix;
    }
    
    // Returns task details as a formatted string
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\nDeveloper: " + developerFirstName + " " + developerLastName +
               "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription +
               "\nTask ID: " + taskID + "\nDuration: " + taskDuration + " hours";
    }
    
    // Returns task duration
    public int getTaskDuration() {
        return taskDuration;
    }
}
