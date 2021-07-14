package data;

import Exceptions.DataAccessException;
import Exceptions.DataReadException;
import Exceptions.DataWriteException;
import models.Movie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataAccessImpl implements DataAccess{

    @Override
    public boolean exist(String resourceName) {
        var file = new File(resourceName);
        return file.exists();
    }

    @Override
    public List<Movie> toList(String resourceName) throws DataReadException {
        var file = new File(resourceName);
        List<Movie> movies = new ArrayList<>();
        try{
            var input = new BufferedReader(new FileReader(file));
            String line = null;
            line = input.readLine();
            while (line != null){
                var movie = new Movie(line);
                movies.add(movie);
                line = input.readLine();
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataReadException("Excepción al listar películas.\n" + e.getMessage());
        }
        return movies;
    }

    @Override
    public void write(Movie movie, String resourceName, boolean append) throws DataWriteException {
        var file = new File(resourceName);
        try{
            var output = new PrintWriter(new FileWriter(file, append));
            output.println(movie.toString());
            output.close();
            System.out.println("Se ha escrito información al archivo " + movie);
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataWriteException("Excepción al escribir películas.\n" + e.getMessage());
        }
    }

    @Override
    public String search(String resourceName, String search) throws DataReadException {
        var file = new File(resourceName);
        String result = null;
        try {
            var input = new BufferedReader(new FileReader(file));
            String line = null;
            line = input.readLine();
            var index = 1;
            while (line != null){
                if(search != null && search.equalsIgnoreCase(line)){
                    result = "Película " + line + " encontrada en el índice " + index;
                    break;
                }
                line = input.readLine();
                index++;
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataReadException("Excepción al buscar la película.\n" + e.getMessage());
        }
        return result;
    }

    @Override
    public void create(String resourceName) throws DataAccessException {
        var file = new File(resourceName);
        try {
            var output = new PrintWriter(new FileWriter(file));
            output.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataAccessException("Excepción al crear el archivo.\n" + e.getMessage());
        }
    }

    @Override
    public void delete(String resourceName) {
        var file = new File(resourceName);
        if(file.exists()) file.delete();
        System.out.println("Se ha borrado el archivo");
    }

}
