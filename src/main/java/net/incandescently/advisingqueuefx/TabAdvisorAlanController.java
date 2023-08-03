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
        MediatorController.advisorController.advisorRefreshButtonClicked(MediatorController.mainMenuController.alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvAlanStartMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorStartMeetingButtonClicked(MediatorController.mainMenuController.alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvAlanEndMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorEndMeetingButtonClicked(MediatorController.mainMenuController.alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }

}
