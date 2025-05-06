package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a university course with a name, code, and list of tasks.
 */
public class Course {
    private String name;
    private String code;
    private List<Task> tasks;

    /**
     * Constructs a new course with a name and code.
     *
     * @param name The name of the course.
     * @param code The course code.
     */
    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    /**
     * Adds a task to the course.
     *
     * @param task The task to be added.
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

}
