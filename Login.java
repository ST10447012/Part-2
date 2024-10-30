import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Login {
    private final HashMap<String, User> users = new HashMap<>();
    private final ArrayList<Task> tasks = new ArrayList<>();
    private int totalHours = 0;

    // Other existing methods...
    
    public String addTask(String taskName, String taskDescription, String developerFirstName, 
                          String developerLastName, int taskDuration, String taskStatus) {
        int taskNumber = tasks.size();
        Task task = new Task(taskName, taskNumber, taskDescription, developerFirstName, developerLastName, taskDuration, taskStatus);
        
        if (!task.checkTaskDescription()) {
            return "Please enter a task description of less than 50 characters";
        }
        
        tasks.add(task);
        JOptionPane.showMessageDialog(null, task.printTaskDetails());
        return "Task successfully captured";
    }
    
    public int getTotalHours() {
        return totalHours;
    }

    private static class Task {

        public Task() {
        }

        private Task(String taskName, int taskNumber, String taskDescription, String developerFirstName, String developerLastName, int taskDuration, String taskStatus) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean checkTaskDescription() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private Object printTaskDetails() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
