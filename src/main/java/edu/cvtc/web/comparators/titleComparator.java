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
public class titleComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie firstMovie, Movie secondMovie) {
		return firstMovie.getTitle().compareTo(secondMovie.getTitle());
	}

}
