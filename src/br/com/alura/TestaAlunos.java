package br.com.alura;

import java.util.*;
public class TestaAlunos {
	 public static void main(String[] args) {

	        Set<String> alunos = new HashSet<>();
	        alunos.add("Rodrigo Turini");
	        alunos.add("Alberto Souza");
	        alunos.add("Nico Steppat");
	        alunos.add("Sergio Lopes");
	        alunos.add("Renan Saggio");
	        alunos.add("Mauricio Aniche");

	        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
	        System.out.println(pauloEstaMatriculado); 
	        
	        for (String aluno : alunos) {
	            System.out.println(aluno);
	        }
	        System.out.println(alunos);    
	    }

}
