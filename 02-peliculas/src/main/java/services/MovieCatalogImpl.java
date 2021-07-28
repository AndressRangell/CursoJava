package services;

import Exceptions.DataAccessException;
import data.DataAccess;
import data.DataAccessImpl;
import models.Movie;

public class MovieCatalogImpl implements MovieCatalog{

    private final DataAccess data;

    public MovieCatalogImpl(){
        data = new DataAccessImpl();
    }

    @Override
    public void addMovie(String movieName) {
        Movie movie = new Movie(movieName);
        boolean append = false;
        try {
            append = data.exist(RESOURCE_NAME);
            data.write(movie, RESOURCE_NAME, append);
        } catch (DataAccessException e) {
            e.printStackTrace();
            System.out.println("Error de acceso a datos");
        }
    }

    @Override
    public void listMovies() {
        try {
            var movies = data.toList(RESOURCE_NAME);
            for(var movie: movies){
                System.out.println("Película = " + movie);
            }
        } catch (DataAccessException e) {
            e.printStackTrace();
            System.out.println("Error de acceso de datos");
        }
    }

    @Override
    public void searchMovie(String search) {
        String result = null;
        try {
            result = data.search(RESOURCE_NAME, search);
        } catch (DataAccessException e) {
            e.printStackTrace();
            System.out.println("Error de acceso de datos");
        }
        System.out.println("Resultado = " + result);
    }

    @Override
    public void startMovieCatalog() {
        try{
            if(data.exist(RESOURCE_NAME)){
                data.delete(RESOURCE_NAME);
                data.create(RESOURCE_NAME);
            }else{
                data.create(RESOURCE_NAME);
            }
        }catch (DataAccessException e){
            e.printStackTrace();
            System.out.println("Error al iniciar catálogo de películas");
        }
    }

}
