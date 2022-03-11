package br.com.atividade;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditarAlunoServlet extends HttpServlet {
	
	private AlunoService alunoService = new AlunoService();
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse) 
	throws IOException {
		
		int id = Integer.valueOf(httpServletRequest.getParameter("id"));
		
		Aluno aluno = alunoService.findByIdAluno(id);
		
		httpServletResponse.setContentType("text/html");
		PrintWriter printWriter = httpServletResponse.getWriter();
		printWriter.println("<html><head><link href=\"index.css\" rel=\"stylesheet\"></head>");
		printWriter.println("<body><div class='link'>"
				+ "<a href='menu.html'>Voltar ao Menu</a>"
				+ "</div>");
		printWriter.println(""
				+ "<div class=\"container\">\r\n"
				+ "	<form action=\"cadastrarAluno\" method=\"post\">"
				+ "		<div class=\"box\">\r\n"
				+ "			<div class=\"title\">\r\n"
				+ "		    	<h1>Editar Aluno</h1>\r\n"
				+ "		    </div>\r\n"
				+ "		    <div class=\"input\">\r\n"
				+ "		        <label>Nome Aluno</label>\r\n"
				+ "		        <input type=\"text\" name=\"nome\" value='"+aluno.getNome()+"'>\r\n"
				+ "		    </div>\r\n"
				+ "		    <div class=\"input\">\r\n"
				+ "		    	<label>Turma</label>\r\n"
				+ "		        <input type=\"text\" name=\"turma\" value='"+aluno.getTurma()+"'>\r\n"
				+ "		    </div>\r\n"
				+ "         <input type='hidden' name='id' value='"+id+"'>"
				+ "		    <input type=\"submit\" class=\"button\" value='editar'>\r\n"
				+ "	    </div>\r\n"
				+ "	</form>\r\n"
				+ "</div>");
		printWriter.print("</body></html>");
		
	}

}
