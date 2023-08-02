package net.incandescently.advisingqueuefx;

import advisingQueue.Meeting;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TabDataController {

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
    protected TableColumn<Meeting, String> meetingStartColumn;
    @FXML
    protected TableColumn<Meeting, String> meetingEndColumn;
    @FXML
    protected TableColumn<Meeting, String> meetingDurationColumn;
    @FXML
    protected void onMeetingsRefreshButtonClicked(ActionEvent event) {
        setDataTableAttributes();
        tableView.refresh();
    }
    @FXML
    protected void onExportDataButtonPressed(ActionEvent event) {
        MediatorController.mainMenuController.advisingQueueSystem.exportMeetings();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setContentText("Data Successfully exported.");
        alert.showAndWait();
    }
    protected void setDataTableAttributes() {
        tableView.setItems(null);
        tableView.setItems(FXCollections.observableArrayList(MediatorController.mainMenuController.advisingQueueSystem.getMeetings()));
        meetingIDColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTableID()));
        studentNameColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTableStudentFullName()));
        studentEmailColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTableStudentEmail()));
        advisorFirstNameColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTableAdvisorFirstName()));
        meetingStartColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTableStartTime()));
        meetingEndColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTableEndTime()));
        meetingDurationColumn.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTableDuration()));
    }
}
