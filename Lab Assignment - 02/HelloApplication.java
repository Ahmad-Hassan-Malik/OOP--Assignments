package com.example.javafxproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;

public class HelloApplication extends Application {

    // Create an ArrayList to store Person details
    private ArrayList<Person> studentList = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(30, 100, 100, 50));
        gridPane.setHgap(15);
        gridPane.setVgap(10);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));

        Label enrollmrntLabel = new Label("WELCOME TO THE ENROLLMENT FORM");
        enrollmrntLabel.setFont(new Font("Comic Sans MS", 22));
        enrollmrntLabel.setTextFill(Color.DARKGOLDENROD);
        enrollmrntLabel.setStyle("-fx-background-color: #FFD700; -fx-alignment: center;");
        enrollmrntLabel.setMaxWidth(Double.MAX_VALUE);
        enrollmrntLabel.setPadding(new Insets(20));
        root.setTop(enrollmrntLabel);
        root.setCenter(gridPane);

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        gridPane.add(nameLabel, 0, 1);
        gridPane.add(nameField, 1, 1);

        Label fatherNameLabel = new Label("Father Name:");
        TextField fatherNameField = new TextField();
        gridPane.add(fatherNameLabel, 0, 2);
        gridPane.add(fatherNameField, 1, 2);

        Label cnicLabel = new Label("CNIC:");
        TextField cnicField = new TextField();
        gridPane.add(cnicLabel, 0, 3);
        gridPane.add(cnicField, 1, 3);

        Label dateLabel = new Label("Date:");
        DatePicker datePicker = new DatePicker();
        gridPane.add(dateLabel, 0, 4);
        gridPane.add(datePicker, 1, 4);

        Label genderLabel = new Label("Gender:");
        RadioButton maleRadio = new RadioButton("Male");
        RadioButton femaleRadio = new RadioButton("Female");

        ToggleGroup genderGroup = new ToggleGroup();
        maleRadio.setToggleGroup(genderGroup);
        femaleRadio.setToggleGroup(genderGroup);

        HBox genderBox = new HBox(10);
        genderBox.getChildren().addAll(maleRadio, femaleRadio);
        gridPane.add(genderLabel, 0, 5);
        gridPane.add(genderBox, 1, 5);

        Label cityLabel = new Label("City:");
        ComboBox<String> cityComboBox = new ComboBox<>();
        cityComboBox.getItems().addAll("Lahore", "Multan", "Karachi");
        gridPane.add(cityLabel, 0, 6);
        gridPane.add(cityComboBox, 1, 6);

        Button saveButton = new Button("Save");
        gridPane.add(saveButton, 1, 7);

        Button fileChooserButton = new Button("Choose Image");
        Label fileLabel = new Label("Select your Image");
        ImageView imageView = new ImageView();
        imageView.setFitWidth(170);
        imageView.setFitHeight(170);
        imageView.setPreserveRatio(true);

        fileChooserButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                Image image = new Image(selectedFile.toURI().toString());
                imageView.setImage(image);

                fileChooserButton.setVisible(false);
                fileLabel.setVisible(false);
                gridPane.add(imageView, 2, 1, 2, 5);
            }
        });
        gridPane.add(fileChooserButton, 2, 1);
        gridPane.add(fileLabel, 2, 2);

        // Event handler for the Save button
        saveButton.setOnAction(e -> {
            String name = nameField.getText();
            String fatherName = fatherNameField.getText();
            String cnic = cnicField.getText();
            String date = datePicker.getValue() != null ? datePicker.getValue().toString() : "N/A";
            String gender = maleRadio.isSelected() ? "Male" : (femaleRadio.isSelected() ? "Female" : "N/A");
            String city = cityComboBox.getValue() != null ? cityComboBox.getValue() : "N/A";

            // Create a new Person object and add it to the list
            Person student = new Person(name, fatherName, cnic, date, gender, city);
            studentList.add(student);

            // Display the student details in the console
            System.out.println("The student details:");
            for (Person p : studentList) {
                System.out.println("Name: " + p.getName());
                System.out.println("Father Name: " + p.getFatherName());
                System.out.println("CNIC: " + p.getCnic());
                System.out.println("Date: " + p.getDate());
                System.out.println("Gender: " + p.getGender());
                System.out.println("City: " + p.getCity());
                System.out.println(); // To add a gap between each student's details
            }
        });

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The info form");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Person class to store student details
    public class Person {
        private String name;
        private String fatherName;
        private String cnic;
        private String date;
        private String gender;
        private String city;

        public Person(String name, String fatherName, String cnic, String date, String gender, String city) {
            this.name = name;
            this.fatherName = fatherName;
            this.cnic = cnic;
            this.date = date;
            this.gender = gender;
            this.city = city;
        }

        // Getter methods for each property
        public String getName() {
            return name;
        }

        public String getFatherName() {
            return fatherName;
        }

        public String getCnic() {
            return cnic;
        }

        public String getDate() {
            return date;
        }

        public String getGender() {
            return gender;
        }

        public String getCity() {
            return city;
        }
    }
}



