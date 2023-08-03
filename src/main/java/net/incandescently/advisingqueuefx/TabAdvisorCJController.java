package net.incandescently.advisingqueuefx;

import advisingQueue.AdvisorQueue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TabAdvisorCJController {

    // Advisor CJ
    @FXML
    private Button advCJStartMeetingButton;
    @FXML
    private Button advCJEndMeetingButton;
    @FXML
    private Button advCJRefreshButton;
    @FXML
    private Label advCJQueueCtLabel;
    @FXML
    private Label advCJMeetingStudentLabel;
    @FXML
    private Label advCJMeetingStudentEmailLabel;
    @FXML
    private Label advCJMeetingTimeLabel;
    @FXML
    protected void onAdvCJRefreshButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorRefreshButtonClicked(MediatorController.mainMenuController.cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }
    @FXML
    protected void onAdvCJStartMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorStartMeetingButtonClicked(MediatorController.mainMenuController.cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }
    @FXML
    protected void onAdvCJEndMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorEndMeetingButtonClicked(MediatorController.mainMenuController.cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }

}
