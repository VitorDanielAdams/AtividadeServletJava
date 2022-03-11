package br.com.atividade;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteAlunoServlet extends HttpServlet {

private AlunoService alunoService = new AlunoService();
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse) 
	throws IOException {
		
		int id = Integer.valueOf(httpServletRequest.getParameter("id"));
	
		alunoService.deleteAluno(id);
		
		httpServletResponse.sendRedirect("listarAluno.html");
		
	}
	
}
