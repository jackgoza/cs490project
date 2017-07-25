package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class LandingSceneController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="customerTable"
    private TableView<?> customerTable; // Value injected by FXMLLoader

    @FXML // fx:id="customerNameCol"
    private TableColumn<?, ?> customerNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="customerTelephoneCol"
    private TableColumn<?, ?> customerTelephoneCol; // Value injected by FXMLLoader

    @FXML // fx:id="customerAddressCol"
    private TableColumn<?, ?> customerAddressCol; // Value injected by FXMLLoader

    @FXML // fx:id="searchTextField"
    private TextField searchTextField; // Value injected by FXMLLoader

    @FXML // fx:id="searchButton"
    private Button searchButton; // Value injected by FXMLLoader

    @FXML // fx:id="rentCarButton"
    private Button rentCarButton; // Value injected by FXMLLoader

    @FXML // fx:id="rentedCarButton"
    private Button rentedCarButton; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert customerTable != null : "fx:id=\"customerTable\" was not injected: check your FXML file 'landing.fxml'.";
        assert customerNameCol != null : "fx:id=\"customerNameCol\" was not injected: check your FXML file 'landing.fxml'.";
        assert customerTelephoneCol != null : "fx:id=\"customerTelephoneCol\" was not injected: check your FXML file 'landing.fxml'.";
        assert customerAddressCol != null : "fx:id=\"customerAddressCol\" was not injected: check your FXML file 'landing.fxml'.";
        assert searchTextField != null : "fx:id=\"searchTextField\" was not injected: check your FXML file 'landing.fxml'.";
        assert searchButton != null : "fx:id=\"searchButton\" was not injected: check your FXML file 'landing.fxml'.";
        assert rentCarButton != null : "fx:id=\"rentCarButton\" was not injected: check your FXML file 'landing.fxml'.";
        assert rentedCarButton != null : "fx:id=\"rentedCarButton\" was not injected: check your FXML file 'landing.fxml'.";

    }
}
