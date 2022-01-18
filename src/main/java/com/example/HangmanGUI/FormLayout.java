package com.example.HangmanGUI;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class FormLayout extends VBox {

    public interface ResultHandler {
        void onSubmit(Person result);
    }

    private ResultHandler resultHandler = null;

    private TextField firstNameField = new TextField();
    private TextField lastNameField = new TextField();

    private ComboBox<String> foodPicker = new ComboBox<>(FXCollections.observableArrayList(
            "Pizza", "Noodles", "Salad", "CheeseBurger", "Spinach"
    ));

    public FormLayout() {
        super();

        setSpacing(10);
        setPadding(new Insets(10, 10, 10, 10));

        foodPicker.setEditable(true);

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(resultHandler != null) {
                    Person person = new Person(
                            firstNameField.getText(),
                            lastNameField.getText(),
                            foodPicker.getValue()
                    );
                    resultHandler.onSubmit(person);
                }
            }
        });

        ButtonBar buttonBar = new ButtonBar();
        buttonBar.getButtons().addAll(submitButton);

        this.getChildren().addAll(
                new Label("First Name"),
                firstNameField,
                new Label("Last Name"),
                lastNameField,
                new Label("Favourite Food"),
                foodPicker,
                buttonBar
        );
    }

    public void setResultHandler(ResultHandler resultHandler) {
        this.resultHandler = resultHandler;
    }
}
