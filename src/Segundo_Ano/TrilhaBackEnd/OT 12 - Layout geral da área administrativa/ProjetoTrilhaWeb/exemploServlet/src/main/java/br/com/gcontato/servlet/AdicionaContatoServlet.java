package br.com.gcontato.servlet;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionaContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdicionaContatoServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {

		    String nome = request.getParameter("txtnome");
		    System.out.println(request.getParameter("txtnome"));
		    response.setContentType("text/html; charset=UTF-8");
		    PrintWriter out = response.getWriter();
		    out.println("<!DOCTYPE html>");
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<meta charset=\"UTF-8\">");
		    out.println("<title>" + nome + "</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<style>");
		    out.println("body {");
		    out.println("background-color: rgb(61, 61, 85);");
		    out.println("}");
		    out.println("</style>");
		    out.println("<h1>Nome: " + nome + "</h1>");
		    out.println("<p>Endereço: " + request.getParameter("txtendereco") + "</p>");
		    out.println("<p>Telefone: " + request.getParameter("txttelefone") + "</p>");
		    out.println("</body>");
		    out.println("</html>");
		}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	
	
}
