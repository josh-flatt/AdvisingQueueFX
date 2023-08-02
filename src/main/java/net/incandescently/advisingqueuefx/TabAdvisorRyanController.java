package net.incandescently.advisingqueuefx;

import advisingQueue.AdvisorQueue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TabAdvisorRyanController {

    // Advisor Ryan
    @FXML
    private Button advRyanStartMeetingButton;
    @FXML
    private Button advRyanEndMeetingButton;
    @FXML
    private Button advRyanRefreshButton;
    @FXML
    private Label advRyanQueueCtLabel;
    @FXML
    private Label advRyanMeetingStudentLabel;
    @FXML
    private Label advRyanMeetingStudentEmailLabel;
    @FXML
    private Label advRyanMeetingTimeLabel;
    @FXML
    protected void onAdvRyanRefreshButtonClicked(ActionEvent event) {
        advisorRefreshButtonClicked(MediatorController.mainMenuController.ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
                advRyanMeetingStudentEmailLabel, advRyanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvRyanStartMeetingButtonClicked(ActionEvent event) {
        advisorStartMeetingButtonClicked(MediatorController.mainMenuController.ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
                advRyanMeetingStudentEmailLabel, advRyanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvRyanEndMeetingButtonClicked(ActionEvent event) {
        advisorEndMeetingButtonClicked(MediatorController.mainMenuController.ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
                advRyanMeetingStudentEmailLabel, advRyanMeetingTimeLabel);
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
