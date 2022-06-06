package ru.gb.javafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField userText;

    public void clickCheckButton(ActionEvent actionEvent) {
        String uText = userText.getText();
        historyArea.appendText(uText+"\n");
        userText.clear();
    }
}