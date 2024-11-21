import java.util.*;

public class SistemaBiblioteca {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int escolha;
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("Sistema de Gerenciamento de Biblioteca Acadêmica\n"
					+ "1 - Cadastrar Aluno\n"
					+ "2 - Cadastrar Autor\n"
					+ "3 - Cadastrar Editora\n"
					+ "4 - Cadastrar Editora\n"
					+ "5 - Cadastrar Livro\n"
					+ "6 - Listar Livros Disponíveis\n"
					+ "7 - Listar Livros Emprestados\n"
					+ "8 - Emprestar Livro\n"
					+ "9 - Devolver Livro\n"
					+ "10 - Sair\n"
					+ "-------------------------------------------------------------");
			escolha = ler.nextInt();
			
			switch (escolha) {
			
			case(1):
				
				break;
			
			case(2):
				
				break;
			
			case(3):
				
				break;
			
			case(4):
				
				break;
			
			case(5):
				
				break;
			
			case(6):
				
				break;
			
			case(7):
				
				break;
			
			case(8):
				
				break;
			
			case(9):
				
				break;
			
			case(10):
				
				continuar = false;
				break;
			
			default:
				
				System.out.println("Opção inválida/Não encontrada");
				
				break;
			}
		}
		
		ler.close();
	}
	
}
