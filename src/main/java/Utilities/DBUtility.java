package Utilities;

import com.example.f21comp1011gctest1student.NetflixShow;
import com.example.f21comp1011gctest1student.NetflixTableController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "student";
    private static String pw = "student";
    private static String connectURL = "jdbc:mysql://localhost:3306/javaTest";



    public static ArrayList<NetflixShow> getNetflixShows()
    {
        ArrayList<NetflixShow> netflixShow = new ArrayList<>();
        String sql = "SELECT * FROM netflix";

        try (   Connection conn = DriverManager.getConnection(connectURL, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while(resultSet.next()){
                String showId = resultSet.getString("showId");
                String type = resultSet.getString("type");
                String title = resultSet.getString("title");
                String director = resultSet.getString("director");
                String cast = resultSet.getString("cast");
                String country = resultSet.getString("country");
                String date_added = resultSet.getString("date_added");
                int release_year = resultSet.getInt("release_year");
                String rating = resultSet.getString("rating");
                String duration = resultSet.getString("duration");
                String listed_in = resultSet.getString("listed_in");
                 String description = resultSet.getString("description");

                NetflixShow netflix = new NetflixShow(showId,type,title,rating,director,cast,country,date_added,release_year,duration,listed_in,description);
                netflixShow.add(netflix);

                  }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return netflixShow;



        }
    }



