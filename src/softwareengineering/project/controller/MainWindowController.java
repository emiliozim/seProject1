package softwareengineering.project.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import softwareengineering.project.model.Organization;
import softwareengineering.project.model.User;

public class MainWindowController {

    @FXML
    private Button logIn;

    @FXML
    private TextField user;

    @FXML
    private TextField pass;

    @FXML
    private Label message;

    @FXML
    private void initialize() {

        logIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //Skulle ikke legge så mye tid på innlogg, men dette føles ganska simpelt.

                User sessionUser = createUserSession();

                message.setText("Innlogget som " + sessionUser.getUserName() + " fra " + sessionUser.getOrganization().getOrgName());

            }
        });

    }

    private User createUserSession() {

        if(loginSuccessful()) {
            // fetch data from database

        } else
            System.out.println("Login fail");

        User userSession = new User(100001, "Generic", "User", user.getText(), new Organization(900001, "Generic Ski Klubb"));

        return userSession;

    }

    private boolean loginSuccessful() {

        if (false)
            return false;

        return true;

    }


}