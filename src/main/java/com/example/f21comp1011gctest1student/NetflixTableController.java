package com.example.f21comp1011gctest1student;

import Utilities.DBUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
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
        List<String> validRates = Arrays.asList("PG-13","R","TV-14","TV-G","TV-MA","TV-Y","TV-Y7");
        selectRatingComboBox.getItems().addAll(validRates);
       selectRatingComboBox.getSelectionModel().getSelectedItem();

        numOfShowsLabel.setText("103");
        movieCheckBox.setSelected(true);
        tvCheckBox.setSelected(true);

        showIdCol.setCellValueFactory(new PropertyValueFactory<>("showId"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        ratingCol.setCellValueFactory(new PropertyValueFactory<>("cast"));
        directorCol.setCellValueFactory(new PropertyValueFactory<>("country"));
        castCol.setCellValueFactory(new PropertyValueFactory<>("date_added"));
        castCol.setCellValueFactory(new PropertyValueFactory<>("release_year"));
        castCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
        castCol.setCellValueFactory(new PropertyValueFactory<>("duration"));
        castCol.setCellValueFactory(new PropertyValueFactory<>("listed_in"));
        castCol.setCellValueFactory(new PropertyValueFactory<>("description "));
        castCol.setCellValueFactory(new PropertyValueFactory<>("director"));
        selectRatingComboBox.getItems().add("All ratings");

        tableView.getItems().addAll(DBUtility.getNetflixShows());
    }


    @FXML
    void applyFilter(ActionEvent event)  {
    }
}
