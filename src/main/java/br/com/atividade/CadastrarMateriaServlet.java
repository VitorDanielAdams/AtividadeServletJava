package br.com.atividade;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CadastrarMateriaServlet extends HttpServlet {

	private MateriaService materiaService = new MateriaService();
	
	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse) 
	throws IOException {
		
		Materia materia = new Materia();
		
		materia.setNome(httpServletRequest.getParameter("materia"));
		
		System.out.println("Matéria: " + materia.getNome());
		
		materiaService.insertMateria(materia);
		
		httpServletResponse.setContentType("text/html");
		PrintWriter printWriter = httpServletResponse.getWriter();
		printWriter.println("<a href='index.html'>Adicionar mais Matérias</a>");
		printWriter.println("<h1>Lista De Matérias</h1>");
		
        List<Materia> listMaterias = materiaService.findAllMaterias(); 
        
        printWriter.print("<table border='1' width='80%'>");
        printWriter.print("<tr><th>Matéria</th></tr>");  
       for(Materia m:listMaterias){  
    	   printWriter.print("<tr><td>"+ m.getNome() + "</td></tr>");
       }
       printWriter.print("</table>");
	}
	
}
