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
		
		aluno.setNome(httpServletRequest.getParameter("nome"));
		aluno.setTurma(httpServletRequest.getParameter("turma"));
		
		System.out.println("Aluno: " + aluno.getNome() + " Turma:" + aluno.getTurma());
		
		alunoService.insertAluno(aluno);
		
		httpServletResponse.setContentType("text/html");
		PrintWriter printWriter = httpServletResponse.getWriter();
		printWriter.println("<a href='alunoform.html'>Adicionar mais Alunos</a>");
		printWriter.println("<h1>Lista De Alunos</h1>");
		
        List<Aluno> listAlunos = alunoService.findAllAlunos(); 
        
        printWriter.print("<table border='1' width='100%'>");
        printWriter.print("<tr><th>Nome</th><th>Turma</th></tr>");  
       for(Aluno a:listAlunos){  
    	   printWriter.print("<tr><td>"+ a.getNome() + "</td>"
    	   		+ "<td>" + a.getTurma() + "</td></tr>");
       }
       printWriter.print("</table>");
		
	}

}
