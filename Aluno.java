package br.com.educa;

public class Aluno {
	// Atributos
		private String nome, endereco, entregaAtividade, observacoes;
		
		
		// Construtores

		public Aluno(String nome, String endereco, String entregaAtividade, String observacoes) {
			super();
			this.nome = nome;
			this.endereco = endereco;
			this.entregaAtividade = entregaAtividade;
			this.observacoes = observacoes;
		}
			
		// Metodos.
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getEntregaAtividade() {
			return entregaAtividade;
		}

		public String getObservacoes() {
			return observacoes;
		}

		public void setObservacoes(String observacoes) {
			this.observacoes = observacoes;
		}

		public void setEntregaAtividade(String entregaAtividade) {
			this.entregaAtividade = entregaAtividade;
		}

		public String toString() {
			return "\nNome do aluno: " + this.nome + "\nO Endere�o: " + this.endereco + "\nO aluno entregou a atividade? " + this.entregaAtividade + "\nObserva��es: " + this.observacoes;
		}
}