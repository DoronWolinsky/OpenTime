import model.Course;
import model.Task;
import model.StudySession;
import java.time.LocalDate;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // יצירת קורס חדש
        Course course = new Course("Computer Science", "CS101");

        // יצירת מטלה חדשה
        Task task = new Task("Homework 1", LocalDate.of(2025, 5, 10));

        // הוספת המטלה לקורס
        course.addTask(task);

        // הדפסת פרטי הקורס והמטלה
        System.out.println("Course: " + course.getName());
        System.out.println("Task: " + task.getTitle());
        System.out.println("Deadline: " + task.getDeadline());

        // יצירת Session לימוד חדש
        StudySession studySession = new StudySession(course, LocalDate.now(), Duration.ofHours(2), "Studying algorithms");

        // הדפסת פרטי ה־Session
        System.out.println("Study session for course: " + studySession.getCourse().getName());
        System.out.println("Session date: " + studySession.getDate());
        System.out.println("Duration: " + studySession.getDuration().toHours() + " hours");
    }
}
