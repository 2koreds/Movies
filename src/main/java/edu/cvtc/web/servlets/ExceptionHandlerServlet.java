package edu.cvtc.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExceptionHandlerServlet
 */
@WebServlet("/ExceptionHandlerServlet")
public class ExceptionHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		final Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		if (servletName == null) {
			servletName = "Unknown";
		}
		
		String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");
		if (requestUri == null) {
			requestUri = "Unknown";
		}
		
		response.setContentType("text/html");
		
		final PrintWriter out = response.getWriter();
		
		out.write("<html>\n\t<head>\n\t\t<title>Exception/Error Detail</title>\n\t</head>\n\t<body>");
		
		if (statusCode != 500) {
			out.write("\n\t\t<h3>Error Details</h3>");
			out.write("\n\t\t<p><strong>Status Code</strong>: " + statusCode + "</p>");
			out.write("\n\t\t<p><strong>Requested URI</strong>: " + requestUri + "</p>");
		} else {
			out.write("\n\t\t<h3>Error Details</h3>");
			out.write("\n\t\t<ul><li><strong>Requested URI</strong>:" + requestUri + "</li>");
			out.write("\n\t\t\t<li>Servlet Name: " + servletName + "</li>");
			out.write("\n\t\t\t<li>Exception Name: " + throwable.getClass().getName() + "</li>");
			out.write("\n\t\t\t<li>Exception Message: " + throwable.getMessage() + "</li>");
			out.write("\n\t\t</ul>");
		}
		
		out.write("\n\t</body>\n</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
