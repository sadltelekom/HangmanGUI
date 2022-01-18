package com.example.HangmanGUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class GreetingLayout extends VBox {

    public GreetingLayout(Person person) {
        super();
        setSpacing(10);
        setPadding(new Insets(10, 10, 10, 10));

        Label text = new Label("Hello, " + person.getName() + "! Enjoy your "
                + person.getFavouriteFood() + "!");
        text.setWrapText(true);

        Button okButton = new Button("Ok");
        okButton.setDefaultButton(true);
        okButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getScene().getWindow().hide();
            }
        });

        ButtonBar buttonBar = new ButtonBar();
        buttonBar.getButtons().addAll(okButton);

        getChildren().addAll(text, buttonBar);

    }
}
