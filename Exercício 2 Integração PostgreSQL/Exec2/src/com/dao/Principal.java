package com.dao;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		DAO dao = new DAO();
		
		dao.conectar();

		int escolha = 0;
		
		
			System.out.println("1 - Listar");
			System.out.println("2 - Inserir");
			System.out.println("3 - Excluir");
			System.out.println("4 - Atualizar");
			System.out.println("5 - Sair");
			escolha = sc.nextInt();
		
			
			switch (escolha ) {
			case 1 :{
				escolha = 1; 
				System.out.println("Liste");
				break;
			}
			case 2 :{
				escolha = 2; 
				System.out.println("Insira");
				break;
			}
			case 3 :{
				escolha = 3; 
				System.out.println("Excluido com sucesso");
				break;
			}
			case 4 :{
				escolha = 4; 
				System.out.println("Atualizado com sucesso");
				break;
			}
			case 5 :{
				escolha = 5; 
				System.out.println("Saiu");
				break;
			}
			}
		
		
		dao.close();
	}
}