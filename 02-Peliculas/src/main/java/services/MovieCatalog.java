package services;

public interface MovieCatalog {

    String RESOURCE_NAME = "movies.txt";

    void addMovie(String movieName);

    void listMovies();

    void searchMovie(String search);

    void startMovieCatalog();

}
