package com.example.f21comp1011gctest1student;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class NetflixTableController implements Initializable {

    @FXML
    private TableView<NetflixShow> tableView;

    @FXML
    private TableColumn<NetflixShow, String> showIdCol;

    @FXML
    private TableColumn<NetflixShow, String> typeCol;

    @FXML
    private TableColumn<NetflixShow, String> titleCol;

    @FXML
    private TableColumn<NetflixShow, String> ratingCol;

    @FXML
    private TableColumn<NetflixShow, String> directorCol;

    @FXML
    private TableColumn<NetflixShow, String> castCol;

    @FXML
    private CheckBox movieCheckBox;

    @FXML
    private CheckBox tvCheckBox;

    @FXML
    private ComboBox<String> selectRatingComboBox;

    @FXML
    private Label numOfShowsLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        showIdCol.setCellValueFactory(new PropertyValueFactory<>("indexId"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("indexId"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("indexId"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("indexId"));
        directorCol.setCellValueFactory(new PropertyValueFactory<>("indexId"));
        castCol.setCellValueFactory(new PropertyValueFactory<>("indexId"));
        selectRatingComboBox.getItems().add("All ratings");

    }


    @FXML
    void applyFilter(ActionEvent event)  {
    }
}
