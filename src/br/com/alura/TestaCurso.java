package br.com.alura;

public class TestaCurso {

	 public static void main(String[] args) {

	        Curso javaColecoes = new Curso("Dominando as cole��es do Java",
	                    "Paulo Silveira");

	        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
	        javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

	        System.out.println(javaColecoes.getAulas());
	    }
}
