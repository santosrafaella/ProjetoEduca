package br.com.educa;

import java.util.Scanner;

import javax.swing.JOptionPane;

	public class Login {

		    Scanner leia = new Scanner(System.in);
		    String usuario, senha;
		    int tentativas = 0;
		    	    
		    public void login() {
		    	JOptionPane.showMessageDialog(null, "Digite abaixo as suas informa��es de login:");
		        	        	        
		        while(tentativas <= 2) {
		            System.out.println("Usu�rio: ");
		            usuario = leia.next();
		            System.out.println("Senha: ");
		            senha = leia.next();
		            
		            if(usuario.equals("Rafaella") && senha.equals("123456")) {
		                tentativas = 3;
		                JOptionPane.showMessageDialog(null, "   Bem-Vindo " + usuario);
		                System.out.println("Digite aqui a sua op��o: ");
		            }
		            else {
		            	JOptionPane.showMessageDialog(null, "   Usuario ou senha incorretos. " );
		                tentativas++;
		                if(tentativas == 3) {
		                	JOptionPane.showMessageDialog(null, "Numero de tentativas esgotadas!" + "\n   Finalizando Programa..." );
		                    System.exit(0);    
		                }
		            }
		        }
		    }
		}