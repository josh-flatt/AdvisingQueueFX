package advisingQueue;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.Duration;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Josh Flatt
 * CS 200 Final Project
 * 10 December 2022
 */
public class Meeting {

    static Integer meetingcount = 0; // Count of ALL meetings

    private Integer ID;
    private Student student;
    private Advisor advisor;
    private Boolean isActive;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private ArrayList<String> notes;

    // Fields used only for UI display/export
    private String tableStudentFullName;
    private String tableStudentEmail;
    private String tableAdvisorFirstName;
    private String tableStartTime;
    private String tableEndTime;
    private String tableDuration;

    // Constructors
    public Meeting(Student student, Advisor advisor) {
        meetingcount++;
        this.ID = meetingcount;
        this.student = student;
        this.tableStudentFullName = student.getFullName();
        this.tableStudentEmail = student.getEmail();
        this.advisor = advisor;
        this.tableAdvisorFirstName = advisor.getFirstName();
        this.isActive = true;
        this.notes = new ArrayList<>();
        this.startDateTime = LocalDateTime.now();
    }

    // Setters
    public void addNote(String note) {
        this.notes.add(note);
    }

    // Getters
    public Integer getID() {
        return this.ID;
    }
    public Student getStudent() {
        return this.student;
    }
    public Advisor getAdvisor() {
        return this.advisor;
    }
    public ArrayList<String> getNotes() {
        return this.notes;
    }
    public LocalDateTime getStartDateTime() {
        return this.startDateTime;
    }
    public LocalDateTime getEndDateTime() {
        return this.endDateTime;
    }
    public Duration getDuration() {
        if (isActive) { return Duration.between(startDateTime, LocalDateTime.now()); }
        return Duration.between(startDateTime, endDateTime);
    }

    //Getters only for UI display/export
    public String getTableStudentFullName() {
        return this.tableStudentFullName;
    }
    public String getTableStudentEmail() {
        return this.tableStudentEmail;
    }
    public String getTableAdvisorFirstName() {
        return this.tableAdvisorFirstName;
    }
    public String getTableStartTime() {
        this.tableStartTime = this.startDateTime.format(DateTimeFormatter.ofPattern("hh:mm a"));
        return this.tableStartTime;
    }
    public String getTableEndTime() {
        if (this.endDateTime == null) {
            this.tableEndTime = "";
        }
        if (this.endDateTime != null) {
            this.tableEndTime = this.endDateTime.format(DateTimeFormatter.ofPattern("hh:mm a"));
        }
        return this.tableEndTime;
    }
    public String getTableDuration() {
        long minutes = this.getDuration().toMinutes();
        long seconds = this.getDuration().getSeconds() % 60;
        this.tableDuration = String.format("%dm %ds", minutes, seconds);
        return this.tableDuration;
    }

    // End meeting
    public boolean endMeeting() {
        try {
            this.isActive = false;
            this.endDateTime = LocalDateTime.now();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
