package data;

import Exceptions.DataAccessException;
import Exceptions.DataReadException;
import Exceptions.DataWriteException;
import models.Movie;

import java.util.List;

public interface DataAccess {

    boolean exist(String resourceName) throws DataAccessException;

    List<Movie> toList(String resourceName) throws DataReadException;

    void write(Movie movie, String resourceName, boolean append) throws DataWriteException;

    String search(String resourceName, String search) throws DataReadException;

    void create(String resourceName) throws DataAccessException;

    void delete(String resourceName) throws DataAccessException;

}
