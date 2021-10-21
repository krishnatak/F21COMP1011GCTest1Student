package com.example.f21comp1011gctest1student;

import java.util.Arrays;
import java.util.List;

public class NetflixShow {
    private String showId;
    private String type;
    private String title;
    private int rating;
    private String director;
    private String cast ;

    public NetflixShow(String showId, String type, String title, int rating, String director, String cast) {
        setShowId(showId);
        setType(type);
        setTitle(title);
        setRating(rating);
        setDirector(director);
        setCast(cast);
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
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
}

