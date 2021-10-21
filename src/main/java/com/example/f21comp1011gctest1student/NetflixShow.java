package com.example.f21comp1011gctest1student;

import java.util.Arrays;
import java.util.List;

public class NetflixShow {
    private String showId;
    private String type;
    private String title;
    private String rating;
    private String director;
    private String cast ;
    private String country ;
    private String date_added ;
    private int release_year ;
    private String duration ;
    private String listed_in ;
    private String description ;


    public NetflixShow(String showId, String type, String title, String rating, String director, String cast,String country,String date_added,int release_year,String duration ,String listed_in ,String description) {
        setShowId(showId);
        setType(type);
        setTitle(title);
        setRating(rating);
        setDirector(director);
        setCast(cast);
        setDescription(description);
        setDate_added(date_added);
        setListed_in(listed_in);
        setRelease_year(release_year);
        setCountry(country);
        setDuration(duration);
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        if (showId.startsWith("s"))
            this.showId = showId;
        else
            throw new IllegalArgumentException(String.format("Show Id should be Start from Letter S"));

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        List<String> validTypes = Arrays.asList("Movie","TV Show");
        if (validTypes.contains(type))
            this.type = type;
        else
            throw new IllegalArgumentException("The Show Type should be Either a Movie or TV Show");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length()>=2)
        {
            this.title = title;
        }
        else
        {
            throw new IllegalArgumentException("Title name must be at least 2 characters");
        }

    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        List<String> validRates = Arrays.asList("PG-13","R","TV-14","TV-G","TV-MA","TV-Y","TV-Y7");
        if (validRates.contains(rating))
            this.rating = rating;
        else
            throw new IllegalArgumentException(String.format("%s is invalid, choose from %s",rating,
                    validRates));



    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (title.length()>=2)
        {
            this.director = director;
        }
        else
        {
            throw new IllegalArgumentException("Director name must be at least 2 characters");
        }

    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        if (title.length()>=5)
        {
            this.cast = cast;
        }
        else
        {
            throw new IllegalArgumentException("Cast name must be at least 5 characters");
        }

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getListed_in() {
        return listed_in;
    }

    public void setListed_in(String listed_in) {
        this.listed_in = listed_in;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

