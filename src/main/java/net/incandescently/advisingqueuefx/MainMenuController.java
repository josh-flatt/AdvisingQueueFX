package net.incandescently.advisingqueuefx;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDateTime;

import advisingQueue.*;

/**
 * @author Josh Flatt
 * CS 200 Final Project
 * 10 December 2022
 */
public class MainMenuController {

    protected AdvisingQueueSystem advisingQueueSystem = new AdvisingQueueSystem();
    protected AdvisorQueue cjAQ = advisingQueueSystem
            .CreateAdvisorQueueA(new Advisor("CJ", "Cron", "firstBaseman@rockies.com"));
    protected AdvisorQueue brendanAQ = advisingQueueSystem
            .CreateAdvisorQueueB(new Advisor("Brendan", "Rodgers", "secondBaseman@rockies.com"));
    protected AdvisorQueue alanAQ = advisingQueueSystem
            .CreateAdvisorQueueC(new Advisor("Alan", "Trejo", "shortstop@rockies.com"));
    protected AdvisorQueue ryanAQ = advisingQueueSystem
            .CreateAdvisorQueueD(new Advisor("Ryan", "McMahon", "thirdBaseman@rockies.com"));



//    // Student Page
//    @FXML
//    private Button studentSubmitButton;
//    @FXML
//    private TextField studentFirstName;
//    @FXML
//    private TextField studentLastName;
//    @FXML
//    private TextField studentEmail;
////    @FXML
////    private ComboBox<String> studentAdvisorSelection;
//    @FXML
//    private RadioButton advisorRadioCJ, advisorRadioBrendan, advisorRadioAlan, advisorRadioRyan;
//
//    private String getSelectedAdvisor() {
//        if(advisorRadioCJ.isSelected()) {
//            return "CJ";
//        }
//        if(advisorRadioBrendan.isSelected()) {
//            return "Brendan";
//        }
//        if(advisorRadioAlan.isSelected()) {
//            return "Alan";
//        }
//        if(advisorRadioRyan.isSelected()) {
//            return "Ryan";
//        }
//        return "";
//    }
//    @FXML
//    protected void onStudentSubmitButtonClicked(ActionEvent event) {
//        try {
//            boolean validAdvisor = false;
//            String firstName = this.studentFirstName.getText();
//            String lastName = this.studentLastName.getText();
//            String email = this.studentEmail.getText();
//            String advisor = getSelectedAdvisor();
//
//            Student student = new Student(firstName, lastName, email);
//            if (advisor.equals("CJ")) {
//                cjAQ.addStudent(student);
//                validAdvisor = true;
//            }
//            if (advisor.equals("Brendan")) {
//                brendanAQ.addStudent(student);
//                validAdvisor = true;
//            }
//            if (advisor.equals("Alan")) {
//                alanAQ.addStudent(student);
//                validAdvisor = true;
//            }
//            if (advisor.equals("Ryan")) {
//                ryanAQ.addStudent(student);
//                validAdvisor = true;
//            }
//            else if (!validAdvisor) {
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("Alert");
//            alert.setContentText("Please select one of the advisors.");
//            alert.showAndWait();
//        }
//    }

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
        advisorRefreshButtonClicked(cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }
    @FXML
    protected void onAdvCJStartMeetingButtonClicked(ActionEvent event) {
        advisorStartMeetingButtonClicked(cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }
    @FXML
    protected void onAdvCJEndMeetingButtonClicked(ActionEvent event) {
        advisorEndMeetingButtonClicked(cjAQ, advCJQueueCtLabel, advCJMeetingStudentLabel,
                advCJMeetingStudentEmailLabel, advCJMeetingTimeLabel);
    }

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
        advisorRefreshButtonClicked(brendanAQ, advBrendanQueueCtLabel, advBrendanMeetingStudentLabel,
                advBrendanMeetingStudentEmailLabel, advBrendanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvBrendanStartMeetingButtonClicked(ActionEvent event) {
        advisorStartMeetingButtonClicked(brendanAQ, advBrendanQueueCtLabel, advBrendanMeetingStudentLabel,
                advBrendanMeetingStudentEmailLabel, advBrendanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvBrendanEndMeetingButtonClicked(ActionEvent event) {
        advisorEndMeetingButtonClicked(brendanAQ, advBrendanQueueCtLabel, advBrendanMeetingStudentLabel,
                advBrendanMeetingStudentEmailLabel, advBrendanMeetingTimeLabel);
    }

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
        advisorRefreshButtonClicked(alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvAlanStartMeetingButtonClicked(ActionEvent event) {
        advisorStartMeetingButtonClicked(alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvAlanEndMeetingButtonClicked(ActionEvent event) {
        advisorEndMeetingButtonClicked(alanAQ, advAlanQueueCtLabel, advAlanMeetingStudentLabel,
                advAlanMeetingStudentEmailLabel, advAlanMeetingTimeLabel);
    }

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
        advisorRefreshButtonClicked(ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
                advRyanMeetingStudentEmailLabel, advRyanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvRyanStartMeetingButtonClicked(ActionEvent event) {
        advisorStartMeetingButtonClicked(ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
                advRyanMeetingStudentEmailLabel, advRyanMeetingTimeLabel);
    }
    @FXML
    protected void onAdvRyanEndMeetingButtonClicked(ActionEvent event) {
        advisorEndMeetingButtonClicked(ryanAQ, advRyanQueueCtLabel, advRyanMeetingStudentLabel,
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
            alert.setAlertType(AlertType.ERROR);
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
            alert.setAlertType(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Unexpected error :(");
            alert.showAndWait();
        }
    }


    // Initialize

    @FXML
    private TabDataController tabDataController;
    @FXML
    private TabTestController tabTestController;
    public void initialize() {
        MediatorController.setMainMenuController(this);
        MediatorController.setTabDataController(tabDataController);
        MediatorController.setTabTestController(tabTestController);
        if (advisingQueueSystem.getMeetings().size() > 0) {
            MediatorController.tabDataController.setDataTableAttributes();
        }
    }

}
