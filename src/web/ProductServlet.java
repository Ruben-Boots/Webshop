package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		response.getWriter().append("<html><head><link rel=\"stylesheet\" href=\"style.css\"></head><body>");
		
		response.getWriter().append("<div class=\"grid-container\">");
		
		response.getWriter().append("<div class=\"header\">");
		response.getWriter().append("<h1>" + Index.voorraad.get(id).getNaam() + "</h1>");
		response.getWriter().append("</div>");
		
		response.getWriter().append("<div class=\"content\">");
		response.getWriter().append("<p>De " + Index.voorraad.get(id).getNaam().toLowerCase() + " kost ");
		response.getWriter().append(Index.voorraad.get(id).getPrijsPerEenheid() + " monetaire eenheden per ");
		response.getWriter().append(Index.voorraad.get(id).getEenheidNaam() + ".");
		response.getWriter().append("<h2>Bestellen</h2>");
		response.getWriter().append("<form method=\"post\" action=\"\">");
		response.getWriter().append("Aantal: <input type=\"text\">");
		response.getWriter().append("<input type=\"submit\" value=\"aantal\">");
		response.getWriter().append("</form>");
		response.getWriter().append("</div>");
		
		response.getWriter().append("<div class=\"picture\">");
		response.getWriter().append("<img src=\"" + Index.voorraad.get(id).getImageUrl() + "\"");
		response.getWriter().append("title =\"" + Index.voorraad.get(id).getNaam() +"\">");
		response.getWriter().append("</div>");
		
		response.getWriter().append("<div class=\"menu\">");
		response.getWriter().append("<a href=\"index.html\"> Index </a>");
		response.getWriter().append("<a href=\"winkelwagen.html\"> Winkelwagen </a>");
		response.getWriter().append("</div>");
		
		response.getWriter().append("<div class=\"footer\"> <p>Dit is de voettekst van de mooiste webwinkel EVER!! </div>");		
		
		response.getWriter().append("</div>");
		response.getWriter().append("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}



}
