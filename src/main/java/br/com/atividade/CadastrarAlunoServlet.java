package br.com.atividade;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CadastrarAlunoServlet extends HttpServlet {
	
	private AlunoService alunoService = new AlunoService();
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse) 
	throws IOException {
		
		Aluno aluno = new Aluno();
		
		int id = -1;
		
		if(httpServletRequest.getParameter("id") != null) {
			id = Integer.valueOf(httpServletRequest.getParameter("id"));
		}
		
		aluno.setNome(httpServletRequest.getParameter("nome"));
		aluno.setTurma(httpServletRequest.getParameter("turma"));
		
		System.out.println("Aluno: " + aluno.getNome() + " Turma:" + aluno.getTurma());
		
		if(id >= 0) {
			alunoService.updateAluno(id, aluno);
		} else {
			alunoService.insertAluno(aluno);
		}
		
		httpServletResponse.sendRedirect("listarAluno.html");		
	}

}
