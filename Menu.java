package br.com.educa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
	void bemvindo() {
		
		JOptionPane.showMessageDialog(null,"              BEM-VINDO" + "\n                     AO " + "\n                 EDUCA");   
}


public void opcoes() {
    Scanner leia = new Scanner(System.in);
    TurmaAluno t = new TurmaAluno();
    AlunosMargarida al = new AlunosMargarida();
    
    while(true) {
        
    	JOptionPane.showMessageDialog(null, "O que voc� deseja fazer? " + "\n1 - Criar Turma " + "\n2 - Ver Turmas" + "\n3 - Sair");
        
        
    	int opcao = leia.nextInt();
        switch(opcao) {
        
        case 1:
            t.turmaAlunos();
            break;
            
        case 2:
            al.saudar();
            al.apresentarAluno1();
            al.apresentarAluno2();
            al.apresentarAluno3();
            break;
        
        case 3:
        	JOptionPane.showMessageDialog(null, "   Programa Encerrado... \nObrigado por usar o Educa!");
        	leia.close();
            System.exit(0);
        default:
        	JOptionPane.showMessageDialog(null,"   Op��o Inv�lida. \nTente Novamente");
        	//System.out.println("\nOp��o Inv�lida");
           // System.out.println("\nTente Novamente");
            System.out.println();
            break;
            
        }    
    }
}


}
