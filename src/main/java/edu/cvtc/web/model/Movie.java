/**
 * 
 */
package edu.cvtc.web.model;

/**
 * @author mgeorge8
 *
 */
public class Movie {
	private String title;
	private String director;
	private Integer lengthInMinutes;
	private String imdbLink;
	private Integer releaseYear;
	private String movieSeries;
	
	//Public Constructor for a new Movie object
	public Movie(final String title, final String director, final int lengthInMinutes, final String imdbLink, final int releaseYear, final String movieSeries) {
		this.title = title;
		this.director = director;
		this.lengthInMinutes = lengthInMinutes;
		this.imdbLink = imdbLink;
		this.releaseYear = releaseYear;
		this.movieSeries = movieSeries;
	}
	


	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public int getLengthInMinutes() {
		return lengthInMinutes;
	}

	public String getImdbLink() {
		return imdbLink;
	}
	
	public Integer getReleaseYear() {
		return releaseYear;
	}
	
	public String getMovieSeries() {
		return movieSeries;
	}

	
	@Override
	public String toString() {
		if (movieSeries.equalsIgnoreCase("")) {
			return "Movie [title=" + title + ", director=" + director + ", lengthInMinutes=" + lengthInMinutes + ", imdbLink=" + imdbLink + ", releaseYear=" + "]";
		} else {
			return "Movie [title=" + title + ", director=" + director + ", lengthInMinutes=" + lengthInMinutes + ", imdbLink=" + imdbLink + ", releaseYear=" + ", movieSeries=" + movieSeries + "]";
		}
	}
	
	
	
}
