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
        MediatorController.advisorController.advisorRefreshButtonClicked(MediatorController.mainMenuController.ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
                advRyanMeetingStudentEmailLabel, advRyanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvRyanStartMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorStartMeetingButtonClicked(MediatorController.mainMenuController.ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
                advRyanMeetingStudentEmailLabel, advRyanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvRyanEndMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorEndMeetingButtonClicked(MediatorController.mainMenuController.ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
                advRyanMeetingStudentEmailLabel, advRyanMeetingTimeLabel);
    }

}
