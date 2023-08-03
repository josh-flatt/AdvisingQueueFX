package net.incandescently.advisingqueuefx;

import advisingQueue.AdvisorQueue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TabAdvisorBrendanController {
    // Advisor Brendan
    @FXML
    private Button advBrendanStartMeetingButton;
    @FXML
    private Button advBrendanEndMeetingButton;
    @FXML
    private Button advBrendanRefreshButton;
    @FXML
    private Label advBrendanQueueCtLabel;
    @FXML
    private Label advBrendanMeetingStudentLabel;
    @FXML
    private Label advBrendanMeetingStudentEmailLabel;
    @FXML
    private Label advBrendanMeetingTimeLabel;
    @FXML
    protected void onAdvBrendanRefreshButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorRefreshButtonClicked(MediatorController.mainMenuController.brendanAQ, advBrendanQueueCtLabel, advBrendanMeetingStudentLabel,
                advBrendanMeetingStudentEmailLabel, advBrendanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvBrendanStartMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorStartMeetingButtonClicked(MediatorController.mainMenuController.brendanAQ, advBrendanQueueCtLabel, advBrendanMeetingStudentLabel,
                advBrendanMeetingStudentEmailLabel, advBrendanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvBrendanEndMeetingButtonClicked(ActionEvent event) {
        MediatorController.advisorController.advisorEndMeetingButtonClicked(MediatorController.mainMenuController.brendanAQ, advBrendanQueueCtLabel, advBrendanMeetingStudentLabel,
                advBrendanMeetingStudentEmailLabel, advBrendanMeetingTimeLabel);
    }

}
