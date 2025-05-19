package service;

import model.Task;
import java.util.*;

public class TaskManager {

    public static void addTask(String username, String title, String desc) {
        Task newTask = new Task(title, desc);
        
        if (!UserDatabase.userTasks.containsKey(username)) {
            UserDatabase.userTasks.put(username, new ArrayList<>());
        }
        
        UserDatabase.userTasks.get(username).add(newTask);
    }

    public static List<Task> getTasks(String username) {
        if (!UserDatabase.userTasks.containsKey(username)) {
            return new ArrayList<>();
        }
        
        return UserDatabase.userTasks.get(username);
    }

    public static void main(String[] args) {
        String testUser = "testUser";
        
        System.out.println("Adding tasks for " + testUser);
        addTask(testUser, "Complete Lab 1", "Finish implementing the TaskManager");
        addTask(testUser, "Study for Quiz", "Review course materials for the upcoming quiz");
        addTask(testUser, "Work on Project", "Start working on the term project");
        System.out.println("\nTasks for " + testUser + ":");
        List<Task> userTasks = getTasks(testUser);
        for (Task task : userTasks) {
            System.out.println(task);
        }
        
    }
}
