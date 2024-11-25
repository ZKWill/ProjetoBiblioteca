import java.util.*;

public class SistemaBiblioteca {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int escolha;
		boolean continuar = true;
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		ArrayList<Autor> listaAutores = new ArrayList<>();
		ArrayList<Editora> listaEditoras = new ArrayList<>();
		ArrayList<Livro> listaLivros = new ArrayList<>();
		ArrayList<Periodico> listaPeriodicos = new ArrayList<>();
		
		// while usando uma variavel para controlar o loop devido ao switch
		while(continuar) {
			
			System.out.println("Sistema de Gerenciamento de Biblioteca Acadêmica\n"
					+ "1 - Cadastrar Aluno\n"
					+ "2 - Cadastrar Autor\n"
					+ "3 - Cadastrar Editora\n"
					+ "4 - Cadastrar Livro\n"
					+ "5 - Cadastrar Periodico\n"
					+ "6 - Listar Livros Disponíveis\n"
					+ "7 - Listar Livros Emprestados\n"
					+ "8 - Emprestar Livro\n"
					+ "9 - Devolver Livro\n"
					+ "10 - Sair\n"
					+ "-------------------------------------------------------------");
			escolha = ler.nextInt();
			
			switch (escolha) {
			
			case(1):
				
				// apenas teste com varíavel local...
				int numMat;
				String aluNome;
				String aluSobrenome;
				String dataNascimento;
				String aluRg;
				
				System.out.println("Digite o número da matrícula do aluno: ");
				numMat = ler.nextInt();
				System.out.println(numMat);
				
				System.out.println("Digite o nome do aluno: ");
				aluNome = ler.next();
				System.out.println(aluNome);
				
				System.out.println("Digite o sobrenome aluno: ");
				aluSobrenome = ler.next();
				System.out.println(aluSobrenome);
				
				System.out.println("Digite a data de nascimento do aluno: ");
				dataNascimento = ler.next();
				System.out.println(dataNascimento);
				
				System.out.println("Digite o RG do aluno: ");
				aluRg = ler.next();
				System.out.println(aluRg);
				
				// retorna bool, se printar, retornou true para o cadastro
				if (listaAlunos.add(new Aluno(numMat, aluNome, aluSobrenome, dataNascimento, aluRg))) {
					
					System.out.println("Aluno adicionado");
				}else {
					
					System.out.println("Erro na inserção");
				}
				
				break;
			
			case(2):
				
				// mesmos casos que o teste de inserção de aluno...
				int autCodigo;
				String autNome;
				String autSobrenome;
				
				System.out.println("Digite o código do autor: ");
				autCodigo = ler.nextInt();
				System.out.println(autCodigo);
				
				System.out.println("Digite o nome do autor: ");
				autNome = ler.next();
				System.out.println(autNome);
				
				System.out.println("Digite o sobrenome ator: ");
				autSobrenome = ler.next();
				System.out.println(autSobrenome);
				
				if (listaAutores.add(new Autor(autCodigo, autNome, autSobrenome))) {
					
					System.out.println("Autor adicionado");
				}else {
					
					System.out.println("Erro na inserção");
				}
				
				break;
			
			case(3):
				
				// mesmos casos que o teste de inserção de aluno...
				String ediNome;
				String ediLocalizacao;
				
				System.out.println("Digite o nome da editora: ");
				ediNome = ler.next();
				System.out.println(ediNome);
				
				System.out.println("Digite a localização da editora: ");
				ediLocalizacao = ler.next();
				System.out.println(ediLocalizacao);
				
				if (listaEditoras.add(new Editora(ediNome, ediLocalizacao))) {
					
					System.out.println("Editora adicionada");
				}else {
					
					System.out.println("Erro na inserção");
				}
				
				break;
			
			case(4):
				
				// mesmos casos que o teste de inserção de aluno...
				
				int isbn;
				String livTitulo;
				int livAno;
				int livEdicao;
				int livEstante;
				String nomEditora;
				String nomAutor;
				int quantTotal;
				int quantDisponivel;
				
				System.out.println("Digite a ISBN do livro: ");
				isbn = ler.nextInt();
				System.out.println(isbn);
				
				System.out.println("Digite o nome do livro: ");
				livTitulo = ler.nextLine();
				System.out.println(livTitulo);
				
				System.out.println("Digite o ano do livro: ");
				livAno = ler.nextInt();
				System.out.println(livAno);
				
				System.out.println("Digite a edição do livro: ");
				livEdicao = ler.nextInt();
				System.out.println(livEdicao);
				
				System.out.println("Digite o número da estante do livro: ");
				livEstante = ler.nextInt();
				System.out.println(livEstante);
				
				System.out.println("Digite o nome da editora: ");
				nomEditora = ler.next();
				System.out.println(nomEditora);
				
				System.out.println("Digite o nome do autor: ");
				nomAutor = ler.next();
				System.out.println(nomAutor);
				
				System.out.println("Digite a quantidade total de livros no estoque: ");
				quantTotal = ler.nextInt();
				System.out.println(quantTotal);
				
				System.out.println("Digite a quantidade de livros disponíveis para empréstimo: ");
				quantDisponivel = ler.nextInt();
				System.out.println(quantDisponivel);
				
				if (listaLivros.add(new Livro(isbn, livTitulo, livAno, livEdicao, livEstante, nomEditora, nomAutor, quantTotal, quantDisponivel))) {
					
					System.out.println("Livro adicionado");
				}else {
					
					System.out.println("Erro na inserção");
				}
				
				break;
			
			case(5):
				
				// mesmos casos para o teste de inserção de aluno...
				int issn;
				String perTitulo;
				int volume;
				int perEstante;
				int perTotal;
				int perDisponivel;
				
				System.out.println("Digite o ISSN do periódico: ");
				issn = ler.nextInt();
				System.out.println(issn);
				
				System.out.println("Digite o titulo do periódico: ");
				perTitulo = ler.nextLine();
				System.out.println(perTitulo);
				
				System.out.println("Digite o volume do periódico: ");
				volume = ler.nextInt();
				System.out.println(volume);
				
				System.out.println("Digite o número da estante do periódico: ");
				perEstante = ler.nextInt();
				System.out.println(perEstante);
				
				System.out.println("Digite a quantidade total do periódico: ");
				perTotal = ler.nextInt();
				System.out.println(perTotal);
				
				System.out.println("Digite a quantidade de periódicos disponíveis para empréstimo: ");
				perDisponivel = ler.nextInt();
				System.out.println(perDisponivel);
				
				if (listaPeriodicos.add(new Periodico(issn, perTitulo, volume, perEstante, perTotal, perDisponivel))) {
					
					System.out.println("Periódico adicionado");
				}else {
					
					System.out.println("Erro na inserção");
				}
				
				break;
			
			case(6):
				
				break;
			
			case(7):
				
				break;
			
			case(8):
				
				System.out.println("Qual o nome do livro que deseja ser emprestado?");
				System.out.println("Qual o usuário que irá emprestador o livro?");
				System.out.println("Informe seu CPF:");
				
				break;
			
			case(9):
				
				System.out.println("Qual o nome do usuário que o livro está emprestado?");
				System.out.println("Qual livro será devolvido?");
				
				break;
			
			case(10):
				
				System.out.println("Saindo do sistema");
				
				continuar = false;
				break;
			
				// default pega todos os valores que não estiverem dentro dos cases
			default:
				
				System.out.println("Opção inválida/Não encontrada");
				
				break;
			}
		}
		
		ler.close();
	}
	
}
