<!DOCTYPE html>
<%@page import="java.util.Collections"%>
<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="edu.cvtc.web.model.Movie"%>
<%@page import="edu.cvtc.web.util.WorkbookUtility"%>
<%@page import="edu.cvtc.web.comparators.directorComparator"%>
<%@page import="edu.cvtc.web.comparators.movieSeriesComparator"%>
<%@page import="edu.cvtc.web.comparators.releaseYearComparator"%>
<%@page import="edu.cvtc.web.comparators.titleComparator"%>
<%@page import="edu.cvtc.web.comparators.SortBy"%>
<html>
	<head>
		<title>Matthew's Movies</title>
		<link rel="icon" href="/Movies/assets/img/2koredsavatar.png"/>
		<%@ include file="includes/styles.jsp" %>
	</head>
	<body>
		<div id="wrapper">
			<div id="header">
				<img src="/Movies/assets/img/2koredsavatar.png"/>
				<h1>Movies</h1>
				<%@ include file="includes/navigation.jsp" %>
			</div>
			<div id="container">
				<h3>Welcome to the Movies Page of Matthew's Movies!</h3>
				<p>Below is a list of my favorite movies!</p>
				<hr>
				<div id="movies">
					<%
					
						try {
							List<Movie> movies = new ArrayList<>();
							
							final String filePath = session.getServletContext().getRealPath("/assets/spreadsheets/Movies_mgeorge8.xlsx");
							final File inputFile = new File(filePath);
							
							movies = WorkbookUtility.retrieveMoviesFromWorkBook(inputFile);
							
							final String sortType = request.getParameter("sort");
							
							if (null != sortType) {
								switch (sortType) {
									case SortBy.DIRECTOR:
										Collections.sort(movies, new directorComparator());
										break;
									case SortBy.MOVIE_SERIES:
										Collections.sort(movies, new movieSeriesComparator());
										break;
									case SortBy.RELEASE_YEAR:
										Collections.sort(movies, new releaseYearComparator());
										break;
									case SortBy.TITLE:
										Collections.sort(movies, new titleComparator());
										break;
									default:
										break;
								}
							}
							
							for (final Movie movie : movies) {
								// Create a new HTML div with a h2 header for the Movies name.
								// And a paragraph for the details about that movie		
						%>
						<div class ="movies">
							<h2><%=movie.getTitle() %> (<%=movie.getReleaseYear() %>)</h2>
							<p>Directed by: <%=movie.getDirector() %>.</p>
							<p><%=movie.getTitle() %> is <%=movie.getLengthInMinutes() %> minutes long.</p>
							<p>The IMDb web-site link for this site is found <a href= "<%=movie.getImdbLink() %>">here.</a></p>
							<hr>
						</div>
						<%
							}
						} catch (final Exception e) {
							e.printStackTrace();
							%>
							<h1>Error</h1>
							<p>Sorry, we were unable to retrieve the list of people.</p>
							<%
						}
					%>
				</div>
				<%@ include file="includes/footer.jsp" %>
			</div>
		</div>
		<!-- <%@ include file="includes/scripts.jsp" %> -->
	</body>
</html>