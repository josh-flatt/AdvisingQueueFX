package net.incandescently.advisingqueuefx;

import advisingQueue.AdvisorQueue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TabAdvisorAlanController {
    // Advisor Alan
    @FXML
    private Button advAlanStartMeetingButton;
    @FXML
    private Button advAlanEndMeetingButton;
    @FXML
    private Button advAlanRefreshButton;
    @FXML
    private Label advAlanQueueCtLabel;
    @FXML
    private Label advAlanMeetingStudentLabel;
    @FXML
    private Label advAlanMeetingStudentEmailLabel;
    @FXML
    private Label advAlanMeetingTimeLabel;
    @FXML
    protected void onAdvAlanRefreshButtonClicked(ActionEvent event) {
        advisorRefreshButtonClicked(MediatorController.mainMenuController.alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvAlanStartMeetingButtonClicked(ActionEvent event) {
        advisorStartMeetingButtonClicked(MediatorController.mainMenuController.alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvAlanEndMeetingButtonClicked(ActionEvent event) {
        advisorEndMeetingButtonClicked(MediatorController.mainMenuController.alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }
    // Advisor methods
    protected void advisorRefreshButtonClicked(AdvisorQueue advisorQueue, Label queueCountLabel,
                                               Label meetingStudentLabel, Label meetingStudentEmailLabel, Label meetingTimeLabel) {
        queueCountLabel.setText("Students in Queue: " + advisorQueue.getQueueCount());
        if (advisorQueue.getCurrentMeeting() == null) { return; }
        meetingTimeLabel.setText(advisorQueue.getCurrentMeeting().getTableDuration());
    }
    protected void advisorStartMeetingButtonClicked(AdvisorQueue advisorQueue, Label queueCountLabel,
                                                    Label meetingStudentLabel, Label meetingStudentEmailLabel, Label meetingTimeLabel) {

        System.out.println("Starting meeting...");
        String meetingMessage = advisorQueue.startMeeting();
        queueCountLabel.setText("Students in Queue: " + advisorQueue.getQueueCount());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (meetingMessage.equals("No_students_in_queue")) {
            alert.setTitle("Notification");
            alert.setContentText("There are no students in the queue.");
            alert.showAndWait();
        }
        if (meetingMessage.equals("Meeting_in_progress")) {
            alert.setTitle("Notification");
            alert.setContentText("There is a meeting already in progress.");
            alert.showAndWait();
        }
        if (meetingMessage.equals("Success")) {
            meetingStudentLabel.setText(advisorQueue.getCurrentMeeting().getStudent().getFullName());
            meetingStudentEmailLabel.setText(advisorQueue.getCurrentMeeting().getStudent().getEmail());
            meetingTimeLabel.setText(advisorQueue.getCurrentMeeting().getDuration().getSeconds() + "s");
            alert.setTitle("Notification");
            alert.setContentText("Meeting started.");
            alert.showAndWait();
        }
        if (meetingMessage.equals("Unexpected_error")) {
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Unexpected error :(");
            alert.showAndWait();
        }
    }
    protected void advisorEndMeetingButtonClicked(AdvisorQueue advisorQueue, Label queueCountLabel,
                                                  Label meetingStudentLabel, Label meetingStudentEmailLabel, Label meetingTimeLabel) {

        System.out.println("Meeting ending...");
        String meetingMessage = advisorQueue.endMeeting();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (meetingMessage.equals("No_current_meeting")) {
            alert.setTitle("Notification");
            alert.setContentText("There is no active meeting to end.");
            alert.showAndWait();
        }
        if (meetingMessage.equals("Success")) {
            meetingStudentLabel.setText("");
            meetingStudentEmailLabel.setText("");
            meetingTimeLabel.setText("");
            alert.setTitle("Notification");
            alert.setContentText("Meeting ended.");
            alert.showAndWait();
        }
        if (meetingMessage.equals("Unexpected_error")) {
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Unexpected error :(");
            alert.showAndWait();
        }
    }

}
