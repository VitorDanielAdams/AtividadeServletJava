package br.com.atividade;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {

	private static List<Aluno> listaAlunos = new ArrayList<>();
	
	public AlunoService() {
	}
	
	public void insertAluno(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	public List<Aluno> findAllAlunos(){
		return this.listaAlunos;
	}
	
	public Aluno findByIdAluno(Integer id) {
		return this.listaAlunos.get(id);
	}
	
	public void updateAluno(int id, Aluno aluno) {
		this.listaAlunos.set(id, aluno);
	}
	
	public void deleteAluno(int id) {
		this.listaAlunos.remove(id);
	}
	
}
