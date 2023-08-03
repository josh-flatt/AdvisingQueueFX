package net.incandescently.advisingqueuefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
        MediatorController.advisorController.advisorRefreshButtonClicked(MediatorController.mainController.cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }
    @FXML
    protected void onAdvCJStartMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorStartMeetingButtonClicked(MediatorController.mainController.cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }
    @FXML
    protected void onAdvCJEndMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorEndMeetingButtonClicked(MediatorController.mainController.cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }

}
