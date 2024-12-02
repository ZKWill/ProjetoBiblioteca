import java.util.*;

public class Gerenciamento {
	// empréstimos/devoluções
	
	Scanner leitor = new Scanner(System.in);
	Cadastros c2 = new Cadastros();
	
	ArrayList<Emprestado> listaEmprestados = new ArrayList<>();
	
	public ArrayList<Emprestado> GetListaEmprestados() {
		
	    return listaEmprestados;
	    
	}
	
	public void emprestarLivro(ArrayList<Livro> listaLivros, ArrayList<Periodico> listaPeriodicos, ArrayList<Aluno> listaAlunos) {
		
		String tipoMaterial;
		String nomeLiv;
		String nomePer;
		String nomeAluno;
		
		System.out.println("Qual o tipo do material a ser emprestado? ");
		tipoMaterial = leitor.nextLine();
		
		System.out.println("Qual aluno que irá emprestador o material? ");
		nomeAluno = leitor.nextLine();
		
		if(tipoMaterial.toUpperCase().equals("LIVRO")) {
			
			System.out.println("Qual o nome do livro que deseja ser emprestado?");
			nomeLiv = leitor.nextLine();
			
			for(int i = 0; i < listaLivros.size(); i++) {
				
				if(nomeLiv.toUpperCase().equals(listaLivros.get(i).GetTitulo().toUpperCase())) {
					
					System.out.println("Livro encontrado!");
					
					for(int j = 0; j < listaAlunos.size(); j++) {
					
						if(nomeAluno.toUpperCase().equals(listaAlunos.get(j).GetNome().toUpperCase())) {
							
							System.out.println("Aluno encontrado!");
							System.out.println("Adicionando registro");
							
							listaEmprestados.add(new Emprestado(listaLivros.get(i).GetTitulo(), listaLivros.get(i).GetISBN(), listaLivros.get(i).GetTipoMaterial(), listaAlunos.get(j).GetNome(), listaAlunos.get(j).GetCPF(), "02/12/2024"));
							
							listaLivros.get(i).SetEmprestado(true);
							
							break;
						
						}else {
							
							System.out.println("Aluno não encontrado! Faça o cadastro do aluno e em seguida tente novamente");
							c2.cadastrarAluno(listaAlunos);
							
						}
					
					}
						
				}else {
					
					System.out.println("Livro não encontrado, tente novamente!");
					break;
					
				}
			
			}
			
		}else if(tipoMaterial.toUpperCase().equals("PERIÓDICO")) {
			
			System.out.println("Qual o nome do periodico que deseja ser emprestado?");
			nomePer = leitor.nextLine();
			
			for(int i = 0; i < listaLivros.size(); i++) {
				
				if(nomePer.toUpperCase().equals(listaPeriodicos.get(i).GetTitulo().toUpperCase())) {
					
					System.out.println("Periodico encontrado!");
					
					for(int j = 0; j < listaAlunos.size(); j++) {
					
						if(nomeAluno.toUpperCase().equals(listaAlunos.get(j).GetNome().toUpperCase())) {
						
							System.out.println("Aluno encontrado!");
							System.out.println("Adicionando registro");
							
							listaEmprestados.add(new Emprestado(listaPeriodicos.get(i).GetTitulo(), listaPeriodicos.get(i).GetISSN(), listaPeriodicos.get(i).GetTipoMaterial(), listaAlunos.get(j).GetNome(), listaAlunos.get(j).GetCPF(), "02/12/2024"));
							
							listaPeriodicos.get(i).SetEmprestado(true);
							
							break;
						
						}else {
							
							System.out.println("Aluno não encontrado! Faça o cadastro do aluno e em seguida tente novamente");
							c2.cadastrarAluno(listaAlunos);
							
						}
					
					}
						
				}else {
					
					System.out.println("Periódico não encontrado, tente novamente!");
					break;
					
				}
			
			}
			
		}else {
			
			System.out.println("Tipo não encontrado, verifique a escrita e tente novamente");
			
		}
		
	}
	
	public void devolverLivro(ArrayList<Livro> listaLivros, ArrayList<Periodico> listaPeriodicos, ArrayList<Aluno> listaAlunos) {
		
		String tipoMaterial;
		String nomeAluno;
		int idenLiv;
		int idenPer;
		
		System.out.println("Qual o tipo do material que será devolvido? ");
		tipoMaterial = leitor.nextLine();
		
		System.out.println("Qual aluno que irá devolver o material? ");
		nomeAluno = leitor.nextLine();
		
		if(tipoMaterial.toUpperCase().equals("LIVRO")) {
			
			System.out.println("Qual o número de indetificação do livro que será devolvido?");
			idenLiv = leitor.nextInt();
			
			for(int i = 0; i < listaLivros.size(); i++) {
				
				// compara se o numero de indentificação do livro inserido se encontra na lista de empréstimos
				if(idenLiv == listaEmprestados.get(i).GetIdentificador() && listaEmprestados.get(i).GetTipo().equals("Livro")) {
					
					System.out.println("Livro encontrado!");
					
					for(int j = 0; j < listaAlunos.size(); j++) {
					
						// usando toUpperCase, compara se o nome do aluno inserido se encontra na lista de alunos registrados
						if(nomeAluno.toUpperCase().equals(listaAlunos.get(j).GetNome().toUpperCase())) {
							
							System.out.println("Aluno encontrado!");
							System.out.println("Adicionando registro");
							
							System.out.println("O livro " + listaEmprestados.get(i).GetTitulo() + " foi devolvido pelo aluno " + listaAlunos.get(j).GetNome());
							
							listaEmprestados.remove(i);
							
							listaLivros.get(i).SetEmprestado(false);
							
							break;
						
						}else {
							
							System.out.println("Aluno não encontrado! Faça o cadastro do aluno e em seguida tente novamente");
							c2.cadastrarAluno(listaAlunos);
							
						}
					
					}
						
				}else {
					
					System.out.println("Livro não encontrado, tente novamente!");
					break;
					
				}
			
			}
			
		}else if(tipoMaterial.toUpperCase().equals("PERIÓDICO")) {
			
			System.out.println("Qual o nome do periodico que deseja ser devolvido?");
			idenPer = leitor.nextInt();
			
			for(int i = 0; i < listaPeriodicos.size(); i++) {
				
				// compara se o numero de indentificação do periodico inserido se encontra na lista de empréstimos
				if(idenPer == listaEmprestados.get(i).GetIdentificador() && listaEmprestados.get(i).GetTipo().equals("Periódico")) {
					
					System.out.println("Periodico encontrado!");
					
					for(int j = 0; j < listaAlunos.size(); j++) {
					
						// usando toUpperCase, compara se o nome do aluno inserido se encontra na lista de alunos registrados
						if(nomeAluno.toUpperCase().equals(listaAlunos.get(j).GetNome().toUpperCase())) {
						
							System.out.println("Aluno encontrado!");
							System.out.println("Adicionando registro");
							
							System.out.println("O Periódico " + listaEmprestados.get(i).GetTitulo() + " foi devolvido pelo aluno " + listaAlunos.get(j).GetNome());
							
							listaEmprestados.remove(i);
							
							listaPeriodicos.get(i).SetEmprestado(false);
							
							break;
						
						}else {
							
							System.out.println("Aluno não encontrado! Faça o cadastro do aluno e em seguida tente novamente");
							c2.cadastrarAluno(listaAlunos);
							
						}
					
					}
						
				}else {
					
					System.out.println("Periódico não encontrado, tente novamente!");
					break;
					
				}
			
			}
			
		}else {
			
			System.out.println("Tipo não encontrado, verifique a escrita e tente novamente");
			
		}
		
		
	}
	
}
