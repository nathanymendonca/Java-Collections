package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
	private String numeroMatricula;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
    
    public int getTempoTotal() {
        
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }
    
  
    
    public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		
	}
    
   

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
    
    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
	
}
