package model;

import java.time.LocalDate;

/**
 * Represents a task assigned to a course, with a title, deadline, and completion status.
 */
public class Task {
    private String title;
    private LocalDate deadline;
    private boolean completed;

    /**
     * Constructs a new task with a title and deadline.
     *
     * @param title    The title of the task.
     * @param deadline The deadline for the task.
     */
    public Task(String title, LocalDate deadline) {
        this.title = title;
        this.deadline = deadline;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public boolean isCompleted() {
        return completed;
    }

    /**
     * Marks the task as completed.
     */
    public void markCompleted() {
        this.completed = true;
    }
}
