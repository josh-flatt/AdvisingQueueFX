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
public class TabTestController {

    @FXML
    private Button testButton;

    @FXML
    protected void onTestButtonPressed(ActionEvent event) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Alert");
            alert.setContentText("Success.");
            alert.showAndWait();

    }
}