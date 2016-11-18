/**
 * 
 */
package edu.cvtc.web.comparators;

import java.util.Comparator;

import edu.cvtc.web.model.Movie;

/**
 * @author mgeorge8
 *
 */
public class movieSeriesComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie firstMovie, Movie secondMovie) {
		return firstMovie.getMovieSeries().compareTo(secondMovie.getMovieSeries());
	}

}
