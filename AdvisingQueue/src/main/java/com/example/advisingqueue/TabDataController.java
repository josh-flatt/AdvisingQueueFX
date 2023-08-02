package com.example.advisingqueue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDateTime;

import advisingQueue.*;

/**
 * @author Josh Flatt
 * CS 200 Final Project
 * 10 December 2022
 */
public class TabDataController extends MainMenuController {

    // Data
    @FXML
    protected Button meetingsRefreshButton;
    @FXML
    protected Button exportDataButton;
    @FXML
    protected TableView<Meeting> tableView;
    @FXML
    protected TableColumn<Meeting, String> meetingIDColumn;
    @FXML
    protected TableColumn<Meeting, String> studentNameColumn;
    @FXML
    protected TableColumn<Meeting, String> studentEmailColumn;
    @FXML
    protected TableColumn<Meeting, String> advisorFirstNameColumn;
    @FXML
    protected TableColumn<Meeting, LocalDateTime> meetingStartColumn;
    @FXML
    protected TableColumn<Meeting, LocalDateTime> meetingEndColumn;
    @FXML
    protected TableColumn<Meeting, String> meetingDurationColumn;
    @FXML
    protected void onMeetingsRefreshButtonClicked(ActionEvent event) {
        setDataTableAttributes();
        tableView.refresh();
    }
    @FXML
    protected void onExportDataButtonPressed(ActionEvent event) {
        advisingQueueSystem.exportMeetings();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setContentText("Data Successfully exported.");
        alert.showAndWait();
    }

    @FXML
    public void initialize() {
//        studentAdvisorSelection.setItems(advisorList);
        if (advisingQueueSystem.getMeetings().size() > 0) {
            setDataTableAttributes();
        }
    }

    protected void setDataTableAttributes() {
        tableView.setItems(null);
        tableView.setItems(FXCollections.observableArrayList(advisingQueueSystem.getMeetings()));
        meetingIDColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("ID"));
        studentNameColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("tableStudentFullName"));
        studentEmailColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("tableStudentEmail"));
        advisorFirstNameColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("tableAdvisorFirstName"));
        meetingStartColumn.setCellValueFactory(new PropertyValueFactory<Meeting, LocalDateTime>("tableStartTime"));
        meetingEndColumn.setCellValueFactory(new PropertyValueFactory<Meeting, LocalDateTime>("tableEndTime"));
        meetingDurationColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("tableDuration"));
    }
}