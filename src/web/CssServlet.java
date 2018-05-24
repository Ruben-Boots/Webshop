package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CssServlet
 */
@WebServlet("/style.css")
public class CssServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("body {			background-color: #f213af;		font-family: \"Comic Sans MS\", \"Comic Sans\", cursive;		position: relative;	}	body:after {		padding: 5%;	    content : \"\";	    display: block;	    position: absolute;	    top: 0;	    left: 0;	    background-image: url(topper.jpg);	    width: 100%;	    height: 100%;	    opacity : 0.4;	    z-index: -1;	}	h1 {		color: blue;	}	p {		color: #f213af;	}	ul {		color: #ff6100;		text-align: left;	}	table{		table-layout: fixed;		width: 300px;		border: 1px solid darkgray;		border-spacing: 0px;		background-opacity:	}	th{		color: blue;		height: 50px;	}	td{		height: 30px;		text-align: right;	}	tr:hover {		background-color: #f5f5f5;	}	tr:nth-child(even) {		background-color: #f2f2f2;	}	img {		border: 5px solid black;		border-radius: 33px 17px 50px 100px;	}	img:hover {		opacity: 0.4;		filter: alpha(opacity=40);	}	.grid-container {		display: grid;		grid-template-columns: 10% auto auto;		grid-gap: 50px;		grid-lines: 3px solid black;	}	.header {		grid-column-start: 1;		grid-column-end: 4;		text-align: center;		border: 5px solid black;		border-radius: 33px 17px 50px 100px;	}	.menu {		padding: 20px;		grid-row-start: 2;		text-align: right;		border: 5px dashed hotpink;		border-radius: 33px 17px 50px 100px;	}	.content {		text-align: center;		grid-row: 2;		grid-column: 2;		border: 5px solid orange;		border-radius: 33px 17px 50px 100px;	}	.content ul{		display:inline-block;		text-align:left;	}	.picture {		grid-row: 2;		grid-column: 3;		text-align: center;		border: 5px solid black;		border-radius: 33px 17px 50px 100px;	}	.footer {		grid-area: 3/1/4/4;		text-align: center;		border: 5px solid black;		border-radius: 33px 17px 50px 100px;	}");
	}


}
