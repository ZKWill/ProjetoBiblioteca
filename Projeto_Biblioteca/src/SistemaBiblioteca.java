import java.util.*;

public class SistemaBiblioteca {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int escolha;
		boolean continuar = true;
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		ArrayList<Autor> listaAutores = new ArrayList<>();
		ArrayList<Editora> listaEditoras = new ArrayList<>();
		ArrayList<Material> listaMateriais = new ArrayList<>();
		ArrayList<Livro> listaLivros = new ArrayList<>();
		ArrayList<Periodico> listaPeriodicos = new ArrayList<>();
		
		listaAlunos.add(new Aluno(1, "William Marschner", "28/06/2005", "98811-1111", "1.111.111-11", "111.111.111-11")); 
		listaAlunos.add(new Aluno(2, "Felipe Arenhart", "02/03/2004", "98822-2222", "2.222.222-22", "222.222.222-22"));
		listaAlunos.add(new Aluno(3, "Gabriel Costa", "22/08/2005", "98833-33333", "3.333.333-33", "333.333.333-33"));
		listaAlunos.add(new Aluno(4, "Moisés Sutil", "24/03/2004", "98844-4444", "4.444.444-44", "444.444.444-44"));
		listaAlunos.add(new Aluno(5, "Gabriel Biasoli", "14/10/2002", "98855-5555", "5.555.555-55", "555.555.555-55"));
		
		listaAutores.add(new Autor(1, "John Boyne"));
		listaAutores.add(new Autor(2, "Antoine de Saint-Exupéry"));
		listaAutores.add(new Autor(3, "Stephen King"));
		listaAutores.add(new Autor(4, "Miguel de Cervantes"));
		listaAutores.add(new Autor(5, "Stephen Hawking"));
		
		listaEditoras.add(new Editora(1, "Pandora", "Nacional"));
		listaEditoras.add(new Editora(2, "BlueBox", "Nacional"));
		listaEditoras.add(new Editora(3, "Flame", "Nacional"));
		listaEditoras.add(new Editora(4, "Grupo Planeta", "Internacional"));
		listaEditoras.add(new Editora(5, "Pearson", "Internacional"));
		
		listaMateriais.add(new Material("O Mequeno Principe", 2012, 43, 4, "Antoine de Saint-Exupéry", "Livro"));
		listaMateriais.add(new Material("O Menino do Pijama Listrado", 2010, 24, 6, "John Boyne", "Livro"));
		listaMateriais.add(new Material("O Iluminado", 2016, 75, 1, "Stephen King", "Livro"));
		listaMateriais.add(new Material("Doutor Sono", 2011, 65, 2, "Stephen King", "Livro"));
		listaMateriais.add(new Material("Dom Quixote", 2005, 40, 8, "Miguel de Cervantes", "Livro"));
		listaMateriais.add(new Material("O Dia", 2024, 41, 11, "O Dia", "Periódico"));
		listaMateriais.add(new Material("O Globo", 2024, 154, 15, "O Globo", "Periódico"));
		listaMateriais.add(new Material("A Voz da Serra", 2024, 62, 17, "A Voz da Serra", "Periódico"));
		listaMateriais.add(new Material("Jornal do Comércio", 2024, 46, 13, "Jornal do Comércio", "Periódico"));
		listaMateriais.add(new Material("Folha Dirigida", 2024, 105, 19, "Folha Dirigida", "Periódico"));
		
		listaLivros.add(new Livro("O Mequeno Principe", 2012, 43, 4, "Antoine de Saint-Exupéry", "Livro", 1, "Harper Collins"));
		listaLivros.add(new Livro("O Menino do Pijama Listrado", 2010, 24, 6, "John Boyne", "Livro", 2, "Grupo Companhia das Letras"));
		listaLivros.add(new Livro("O Iluminado", 2016, 75, 1, "Stephen King", "Livro", 3, "Editora Arqueiro"));
		listaLivros.add(new Livro("Doutor Sono", 2011, 65, 2, "Stephen King", "Livro", 4, "Editora Arqueiro"));
		listaLivros.add(new Livro("Dom Quixote", 2005, 40, 8, "Miguel de Cervantes", "Livro", 5, "Editora Arqueiro"));
		
		listaPeriodicos.add(new Periodico("O Dia", 2024, 41, 11, "O Dia", "Periódico", 1));
		listaPeriodicos.add(new Periodico("O Globo", 2024, 154, 15, "O Globo", "Periódico", 2));
		listaPeriodicos.add(new Periodico("A Voz da Serra", 2024, 62, 17, "A Voz da Serra", "Periódico", 3));
		listaPeriodicos.add(new Periodico("Jornal do Comércio", 2024, 46, 13, "Jornal do Comércio", "Periódico", 4));
		listaPeriodicos.add(new Periodico("Folha Dirigida", 2024, 105, 19, "Folha Dirigida", "Periódico", 5));
		
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
				String dataNascimento;
				String telefone;
				String aluRg;
				String cpf;
				
				System.out.println("Digite o número da matrícula do aluno:");
				numMat = ler.nextInt();
				
				// para ler a quebra de linha do enter
				ler.nextLine();
				System.out.println(numMat);
				
				System.out.println("Digite o nome do aluno:");
				aluNome = ler.nextLine();
				System.out.println(aluNome);
				
				System.out.println("Digite a data de nascimento do aluno:");
				dataNascimento = ler.next();
				System.out.println(dataNascimento);
				
				System.out.println("Digite o telefone do aluno: ");
				telefone = ler.next();
				System.out.println(telefone);
				
				System.out.println("Digite o RG do aluno: ");
				aluRg = ler.next();
				System.out.println(aluRg);
				
				System.out.println("Digite o CPF do aluno: ");
				cpf = ler.next();
				System.out.println(cpf);
				
				// retorna bool, se printar, retornou true para o cadastro
				listaAlunos.add(new Aluno(numMat, aluNome, dataNascimento, telefone, aluRg, cpf));
				
				System.out.println("Registro adicionado com sucesso!");
				
				break;
			
			case(2):
				
				// mesmos casos que o teste de inserção de aluno...
				int autCodigo;
				String autNome;
				
				System.out.println("Digite o código do autor: ");
				autCodigo = ler.nextInt();
				
				// para ler a quebra de linha do enter 
				ler.nextLine();
				System.out.println(autCodigo);
				
				System.out.println("Digite o nome do autor: ");
				autNome = ler.nextLine();
				System.out.println(autNome);
				
				listaAutores.add(new Autor(autCodigo, autNome));
				
				System.out.println("Registro adicionado com sucesso!");
				
				break;
			
			case(3):
				
				// mesmos casos que o teste de inserção de aluno...
				int ediCodigo;
				String ediNome;
				String ediLocalizacao;
				
				System.out.println("Digite o codigo da editora: ");
				ediCodigo = ler.nextInt();
				
				// para ler a quebra de linha do enter
				ler.nextLine();
				System.out.println(ediCodigo);
				
				System.out.println("Digite o nome da editora: ");
				ediNome = ler.nextLine();
				System.out.println(ediNome);
				
				System.out.println("Digite a localização da editora: ");
				ediLocalizacao = ler.next();
				System.out.println(ediLocalizacao);
				
				listaEditoras.add(new Editora(ediCodigo, ediNome, ediLocalizacao));
				
				System.out.println("Registro adicionado com sucesso!");
				
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
				
				System.out.println("Digite a ISBN do livro: ");
				isbn = ler.nextInt();
				
				// para ler a quebra de linha do enter
				ler.nextLine();
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
				
				// para ler a quebra de linha do enter
				ler.nextLine();
				System.out.println(livEstante);
				
				System.out.println("Digite o nome da editora: ");
				nomEditora = ler.nextLine();
				System.out.println(nomEditora);
				
				System.out.println("Digite o nome do autor: ");
				nomAutor = ler.nextLine();
				System.out.println(nomAutor);
	
				listaMateriais.add(new Material(livTitulo, livAno, livEdicao, livEstante, nomAutor, "Livro"));
				listaLivros.add(new Livro(livTitulo, livAno, livEdicao, livEstante, nomAutor, "Livro", isbn, nomEditora));
				
				System.out.println("Registro adicionado com sucesso!");
				
				break;
			
			case(5):
				
				// mesmos casos para o teste de inserção de aluno...
				int issn;
				String perTitulo;
				int perAno;
				int volume;
				int perEstante;
				String perAutor;
				
				System.out.println("Digite o ISSN do periódico: ");
				issn = ler.nextInt();
				
				// para ler a quebra de linha do enter
				ler.nextLine();
				System.out.println(issn);
				
				System.out.println("Digite o titulo do periódico: ");
				perTitulo = ler.nextLine();
				System.out.println(perTitulo);
				
				System.out.println("Digite o ano de publicação do periódico: ");
				perAno = ler.nextInt();
				System.out.println(perAno);
				
				System.out.println("Digite o volume do periódico: ");
				volume = ler.nextInt();
				System.out.println(volume);
				
				System.out.println("Digite o número da estante do periódico: ");
				perEstante = ler.nextInt();
				
				// para ler a quebra de linha do enter
				ler.nextLine();
				System.out.println(perEstante);
				
				System.out.println("Digite o nome do autor: ");
				perAutor = ler.nextLine();
				System.out.println(perAutor);
				
				listaMateriais.add(new Material(perTitulo, perAno, volume, perEstante, perAutor, "Periódico"));
				listaPeriodicos.add(new Periodico(perTitulo, perAno, volume, perEstante, perAutor, "Periódico", issn));
				
				System.out.println("Registro adicionado com sucesso!");
				
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
		
		System.out.println("Sistem encerado...");
		
		ler.close();
	}
	
}
