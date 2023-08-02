package net.incandescently.advisingqueuefx;

import advisingQueue.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class TabRegisterController {
    // Student Page
    @FXML
    private Button studentSubmitButton;
    @FXML
    private TextField studentFirstName;
    @FXML
    private TextField studentLastName;
    @FXML
    private TextField studentEmail;
    @FXML
    private RadioButton advisorRadioCJ, advisorRadioBrendan, advisorRadioAlan, advisorRadioRyan;

    private String getSelectedAdvisor() {
        if(advisorRadioCJ.isSelected()) {
            return "CJ";
        }
        if(advisorRadioBrendan.isSelected()) {
            return "Brendan";
        }
        if(advisorRadioAlan.isSelected()) {
            return "Alan";
        }
        if(advisorRadioRyan.isSelected()) {
            return "Ryan";
        }
        return "";
    }
    @FXML
    protected void onStudentSubmitButtonClicked(ActionEvent event) {
        try {
            boolean validAdvisor = false;
            String firstName = this.studentFirstName.getText();
            String lastName = this.studentLastName.getText();
            String email = this.studentEmail.getText();
            String advisor = getSelectedAdvisor();

            Student student = new Student(firstName, lastName, email);
            if (advisor.equals("CJ")) {
                MediatorController.mainMenuController.cjAQ.addStudent(student);
                validAdvisor = true;
            }
            if (advisor.equals("Brendan")) {
                MediatorController.mainMenuController.brendanAQ.addStudent(student);
                validAdvisor = true;
            }
            if (advisor.equals("Alan")) {
                MediatorController.mainMenuController.alanAQ.addStudent(student);
                validAdvisor = true;
            }
            if (advisor.equals("Ryan")) {
                MediatorController.mainMenuController.ryanAQ.addStudent(student);
                validAdvisor = true;
            }
            else if (!validAdvisor) {
                throw new Exception();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Alert");
            alert.setContentText("Please select one of the advisors.");
            alert.showAndWait();
        }
    }
}
