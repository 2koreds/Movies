/**
 * 
 */
package edu.cvtc.web.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import edu.cvtc.web.model.Movie;

/**
 * @author mgeorge8
 *
 */
public class WorkbookUtility {
	// This method returns a List of Movie objects from a File
		public static List<Movie> retrieveMoviesFromWorkBook(final File inputFile) throws InvalidFormatException, IOException {
			
			// Empty list of Movie objects
			final List<Movie> movies = new ArrayList<>();
			
			// Getting the Workbook from our Excel spreadsheet
			final Workbook workbook = WorkbookFactory.create(inputFile);
			
			// Getting the first Worksheet in our Workbook
			final Sheet sheet = workbook.getSheetAt(0);
			
			for (final Row row : sheet) {
				
				// Retrieve the values from each cell and use them to create a new Movie object
				final Cell titleCell = row.getCell(0);
				final Cell directorCell = row.getCell(1);
				final Cell lengthInMinutesCell = row.getCell(2);
				final Cell releaseYearCell = row.getCell(3);
				final Cell imdbLinkCell = row.getCell(4);
				final Cell movieSeriesCell = row.getCell(5);
				
				
				final String title = titleCell.getStringCellValue().trim();
				final String director = directorCell.getStringCellValue().trim();
				final int lengthInMinutes = (int) lengthInMinutesCell.getNumericCellValue();
				final int releaseYear = (int) releaseYearCell.getNumericCellValue();
				final String imdbLink = imdbLinkCell.getStringCellValue().trim();
				final String movieSeries = movieSeriesCell.getStringCellValue().trim();
				

				Movie movie = new Movie(title, director, lengthInMinutes, imdbLink, releaseYear, movieSeries);
				movies.add(movie);
				
				
			}
			
			// Returns the populated list (but only if there were rows in the worksheet)
			return movies;
		}
}
