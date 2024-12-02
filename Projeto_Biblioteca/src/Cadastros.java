import java.util.*;

public class Cadastros {
	
	Scanner ler = new Scanner(System.in);
	
	public void cadastrarAluno(ArrayList<Aluno> listaAlunos) {
		
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
		
		if (listaAlunos.add(new Aluno(numMat, aluNome, dataNascimento, telefone, aluRg, cpf))) {
		
			System.out.println("Registro adicionado com sucesso!");
			
		}
		
	}
	
	public void cadastrarAutor(ArrayList<Autor> listaAutores) {
		
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
		
		if(listaAutores.add(new Autor(autCodigo, autNome))) {
		
			System.out.println("Registro adicionado com sucesso!");
			
		}
	}
	
	public void cadastrarEditora(ArrayList<Editora> listaEditoras) {
		
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
		
		if(listaEditoras.add(new Editora(ediCodigo, ediNome, ediLocalizacao))) {
			
			System.out.println("Registro adicionado com sucesso!");
			
		}
		
	}
	
	public void cadastrarLivro(ArrayList<Material> listaMateriais, ArrayList<Livro> listaLivros) {
		
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
		
		if(listaMateriais.add(new Material(livTitulo, livAno, livEdicao, livEstante, nomAutor, "Livro")) && listaLivros.add(new Livro(livTitulo, livAno, livEdicao, livEstante, nomAutor, "Livro", isbn, nomEditora))) {
			
			System.out.println("Registro adicionado com sucesso!");
			
		}
		
	}
	
	public void cadastrarPeriodico(ArrayList<Material> listaMateriais, ArrayList<Periodico> listaPeriodicos) {
		
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
		
		if(listaMateriais.add(new Material(perTitulo, perAno, volume, perEstante, perAutor, "Periódico")) && listaPeriodicos.add(new Periodico(perTitulo, perAno, volume, perEstante, perAutor, "Periódico", issn))) {
			
			System.out.println("Registro adicionado com sucesso!");
			
		}
		
	}
	
}
