package br.com.atividade;

import java.util.ArrayList;
import java.util.List;

public class MateriaService {

	private List<Materia> listaMaterias = new ArrayList<>();
	
	public MateriaService() {
	}
	
	public void insertMateria(Materia materia) {
		this.listaMaterias.add(materia);
	}
	
	public List<Materia> findAllMaterias(){
		return this.listaMaterias;
	}
}
