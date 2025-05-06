package model;

import java.time.Duration;
import java.time.LocalDate;

/**
 * Represents a study session for a specific course, including date, duration, and notes.
 */
public class StudySession {
    private Course course;
    private LocalDate date;
    private Duration duration;
    private String notes;

    /**
     * Constructs a new study session.
     *
     * @param course   The course the study session is related to.
     * @param date     The date of the study session.
     * @param duration The duration of the session.
     * @param notes    Additional notes for the session.
     */
    public StudySession(Course course, LocalDate date, Duration duration, String notes) {
        this.course = course;
        this.date = date;
        this.duration = duration;
        this.notes = notes;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDate getDate() {
        return date;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getNotes() {
        return notes;
    }
}
