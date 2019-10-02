package softwareengineering.project;

import javafx.application.Application;
import javafx.stage.Stage;
import softwareengineering.project.model.Event;
import softwareengineering.project.model.Person;

import java.util.ArrayList;

// For å si at dette er en JavaFX applikasjon, har vi satt at vi extender(arver) fra den abstrakte klassen Application
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

    }
    public static void main(String[] args) {




        System.out.println("hei wornei!");
        launch(args);
    }
}