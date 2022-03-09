package br.com.atividade;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {

	private List<Aluno> listaAlunos = new ArrayList<>();
	
	public AlunoService() {
	}
	
	public void insertAluno(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	public List<Aluno> findAllAlunos(){
		return this.listaAlunos;
	}
	
}
