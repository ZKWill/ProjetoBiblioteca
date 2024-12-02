import java.util.*;

public class SistemaBiblioteca {
	
	public static void main(String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Gerenciamento g1 = new Gerenciamento();
		Cadastros c1 = new Cadastros();
		Listagem l1 = new Listagem();
		
		int escolha;
		boolean continuar = true;
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		ArrayList<Autor> listaAutores = new ArrayList<>();
		ArrayList<Editora> listaEditoras = new ArrayList<>();
		ArrayList<Material> listaMateriais = new ArrayList<>();
		ArrayList<Livro> listaLivros = new ArrayList<>();
		ArrayList<Periodico> listaPeriodicos = new ArrayList<>();
		
		// adicionando registro para testes
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
		
		listaLivros.add(new Livro("O Pequeno Principe", 2012, 43, 4, "Antoine de Saint-Exupéry", "Livro", 1, "Harper Collins"));
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
					+ "8 - Listar Periódicos Disponíveis\n"
					+ "9 - Listar Periódicos Emprestados\n"
					+ "10 - Emprestar Livro\n"
					+ "11 - Devolver Livro\n"
					+ "12 - Sair\n"
					+ "-------------------------------------------------------------");
			escolha = ler.nextInt();
			
			switch (escolha) {
			
			case(1):
				
				c1.cadastrarAluno(listaAlunos);
				
				break;
			
			case(2):
				
				c1.cadastrarAutor(listaAutores);
				
				break;
			
			case(3):
				
				c1.cadastrarEditora(listaEditoras);
				
				break;
			
			case(4):
				
				c1.cadastrarLivro(listaMateriais, listaLivros);
				
				break;
			
			case(5):
				
				c1.cadastrarPeriodico(listaMateriais, listaPeriodicos);
				
				break;
			
			case(6):
				
				l1.listarLivrosDisponiveis(listaLivros);
				
				break;
			
			case(7):
				
				l1.listarLivrosEmprestados(listaLivros);
				
				break;
				
			case(8):
				
				l1.listarPeriodicosDisponiveis(listaPeriodicos);
				
				break;
			
			case(9):
				
				l1.listarPeriodicosEmprestados(listaPeriodicos);
				
				break;
			
			case(10):
				
				g1.emprestarLivro(listaLivros, listaPeriodicos, listaAlunos);
				
				break;
			
			case(11):
				
				g1.devolverLivro(listaLivros, listaPeriodicos, listaAlunos);
				
				break;
			
			case(12):
				
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
