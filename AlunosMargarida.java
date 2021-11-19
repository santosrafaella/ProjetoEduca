package br.com.educa;

public class AlunosMargarida {
	/*
	Nome:
	Endere�o:
	Telefone:
	Observa��es sobre a situa��o do aluno:
	Est� entregando as atividades e participando das aulas?
	Tem acesso a internet?
	Tem um ambiente e recursos apropriados para estudos?
	Estado emocional: verde, amarelo, vermelho
	Est� enfrentando problemas familiares?
	Est� bem de sa�de?*/
	
	private String nome;
	private String endereco;
	private String telefone;
	private String atividades;
	private String internet;
	private String ambiente;
	private String emocional;
	private String problemas;
	private String saude;
		
		void saudar() {
			System.out.println("=============================================================================");
			System.out.println("\nBoas vindas � Turma Margarida!\n");
			System.out.println("=============================================================================");
		}
void apresentarAluno1() {
			
			nome = "Marcelo Augusto";
			endereco = "Rua das Amoreiras, N�: 245";
			telefone = "(11) 98175-1854";
			atividades = "Verde";
			internet = "Verde";
			ambiente = "Amarelo";
			emocional = "Vermelho";
			problemas = "Vermelho";
			saude = "Vermelho";
			
			System.out.printf("\n");
			System.out.printf("Aluno: " + nome 
								+ "\nEndere�o: "  + endereco
								+ "\nTelefone: " + telefone
								+ "\n\nObserva��es sobre a situa��o do aluno:\n "
								+ "\nEst� entregando as atividades e participando das aulas?" + " || " + atividades + " || "
								+ "\nTem acesso a internet? " + " || " + internet + " || " 
								+ "\nTem um ambiente e recursos apropriados para estudos? " + " || " + ambiente + " || " 
								+ "\nEstado emocional: " + " || " + emocional + " || " 
								+ "\nEst� enfrentando problemas familiares? " + " || " + problemas + " || " 
								+ "\nEst� bem de sa�de? " + " || " + saude + " || " );
			System.out.println("\n\n=============================================================================");
			
				
		}
void apresentarAluno2 () {
	
	nome = "Joana Gon�alves";
	endereco = "Avenida Norte e Sul, N�: 747";
	telefone = "(11) 98172-1434";
	atividades = "Amarelo";
	internet = "Verde";
	ambiente = "Verde";
	emocional = "Amarelo";
	problemas = "Amarelo";
	saude = "Verde";
	
	System.out.printf("\n");
	System.out.printf("Aluno: " + nome 
						+ "\nEndere�o: "  + endereco
						+ "\nTelefone: " + telefone
						+ "\n\nObserva��es sobre a situa��o do aluno:\n "
						+ "\nEst� entregando as atividades e participando das aulas?" + " || " + atividades + " || "
						+ "\nTem acesso a internet? " + " || " + internet + " || " 
						+ "\nTem um ambiente e recursos apropriados para estudos? " + " || " + ambiente + " || " 
						+ "\nEstado emocional: " + " || " + emocional + " || " 
						+ "\nEst� enfrentando problemas familiares? " + " || " + problemas + " || " 
						+ "\nEst� bem de sa�de? " + " || " + saude + " || " );
	System.out.println("\n\n=============================================================================");
		
}

void apresentarAluno3 () {
	
	nome = "Juan Medeiros de Oliveira";
	endereco = "Rua Ladeira Subindo, N�: 359";
	telefone = "(11) 92145-8774";
	atividades = "Vermelho";
	internet = "Amarelo";
	ambiente = "Amarelo";
	emocional = "Verde";
	problemas = "Amarelo";
	saude = "Verde";
	
	System.out.printf("\n");
	System.out.printf("Aluno: " + nome 
						+ "\nEndere�o: "  + endereco
						+ "\nTelefone: " + telefone
						+ "\n\nObserva��es sobre a situa��o do aluno:\n "
						+ "\nEst� entregando as atividades e participando das aulas?" + " || " + atividades + " || "
						+ "\nTem acesso a internet? " + " || " + internet + " || " 
						+ "\nTem um ambiente e recursos apropriados para estudos? " + " || " + ambiente + " || " 
						+ "\nEstado emocional: " + " || " + emocional + " || " 
						+ "\nEst� enfrentando problemas familiares? " + " || " + problemas + " || " 
						+ "\nEst� bem de sa�de? " + " || " + saude + " || " );
	System.out.println("\n\n=============================================================================");
}

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

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getAtividades() {
	return atividades;
}

public void setAtividades(String atividades) {
	this.atividades = atividades;
}

public String getInternet() {
	return internet;
}

public void setInternet(String internet) {
	this.internet = internet;
}
public String getAmbiente() {
	return ambiente;
}

public void setAmbiente(String ambiente) {
	this.ambiente = ambiente;
}

public String getEmocional() {
	return emocional;
}

public void setEmocional(String emocional) {
	this.emocional = emocional;
}

public String getProblemas() {
	return problemas;
}

public void setProblemas(String problemas) {
	this.problemas = problemas;
}

public String getSaude() {
	return saude;
}

public void setSaude(String saude) {
	this.saude = saude;
}
}
