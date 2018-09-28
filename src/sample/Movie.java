package sample;

import javafx.scene.image.Image;

import static java.lang.String.format;

public class Movie {
    //create instance variables
    private String movieTitle, movieGenre;
    private Image movieImage;

    public Movie(String movieTitle, String movieGenre) {
        setMovieTitle(movieTitle);
        setMovieGenre(movieGenre);
        //setMovieImage(movieImage);
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        if (!movieTitle.isEmpty() || (movieTitle.length() > 5 && movieTitle.length() < 20)) {
            this.movieTitle = movieTitle;
        } else {
            throw new IllegalArgumentException("the movie title is empty ");
        }

    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        if (movieGenre.equals("action") || movieGenre.equals("comedy") || movieGenre.equals("drama"))
            this.movieGenre = movieGenre;
        else
            throw new IllegalArgumentException("error");


    }

    public Image getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(Image movieImage) {
        this.movieImage = movieImage;
    }

    @Override
    public String toString() {
        return String.format("%s %s", movieTitle, movieGenre);
    }
}
