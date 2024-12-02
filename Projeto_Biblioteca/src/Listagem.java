import java.util.*;

public class Listagem {
	// funções de listagem
	
	Gerenciamento g2 = new Gerenciamento();
	
	// lista os livros disponíveis para o empréstimo
	public void listarLivrosDisponiveis(ArrayList<Livro> listaLivros) {
		
        System.out.println("Livros Disponíveis: \n");
        
        boolean encontrado = false;
        
        for (int i = 0; i < listaLivros.size(); i++) {
        	
            if (!listaLivros.get(i).GetEmprestado()) { 
            	// verifica se o livro não está emprestado
            	System.out.println("ISBN: " + listaLivros.get(i).GetISBN());
                System.out.println("Título: " + listaLivros.get(i).GetTitulo());
                System.out.println("Ano: " + listaLivros.get(i).GetAno());
                System.out.println("Edição: " + listaLivros.get(i).GetEdicao());
                System.out.println("Estante: " + listaLivros.get(i).GetNumEstante());
                System.out.println("Autor: " + listaLivros.get(i).GetNomeAutor());
                System.out.println("Editora: " + listaLivros.get(i).GetNomeEditora());
                System.out.println("-------------------------------------------------");
                
                encontrado = true;
                
            }
        }
        
        if (!encontrado) {
        	
            System.out.println("Não há livros disponíveis no momento");
            
        }
    }

    // lista os livros que estão emprestados
    public void listarLivrosEmprestados(ArrayList<Livro> listaLivros) {
    	
        System.out.println("Livros Emprestados: \n");
        
        boolean encontrado = false;
        
        for (int i = 0; i < listaLivros.size(); i++) {
        	
            if (listaLivros.get(i).GetEmprestado()) { 
            	// verifica se o livro está emprestado
                System.out.println("Título: " + listaLivros.get(i).GetTitulo());
                System.out.println("Ano: " + listaLivros.get(i).GetAno());
                System.out.println("Edição: " + listaLivros.get(i).GetEdicao());
                System.out.println("Estante: " + listaLivros.get(i).GetNumEstante());
                System.out.println("Autor: " + listaLivros.get(i).GetNomeAutor());
                System.out.println("Editora: " + listaLivros.get(i).GetNomeEditora());
                System.out.println("Data do Empréstimo: 02/12/2024");
                System.out.println("-------------------------------------------------");
                
                encontrado = true;
                
            }
        }
        
        if (!encontrado) {
        	
            System.out.println("Não há livros emprestados no momento");
            
        }
        
    }
    
    public void listarPeriodicosDisponiveis(ArrayList<Periodico> listaPeriodicos) {
    	
    	System.out.println("Periódicos Disponíveis: \n");
    	
    	boolean encontrado = false;
    	
    	for (int i = 0; i < listaPeriodicos.size(); i++) {
    		
    		if(!listaPeriodicos.get(i).GetEmprestado()) {
    			
    			System.out.println("ISSN: " + listaPeriodicos.get(i).GetISSN());
                System.out.println("Título: " + listaPeriodicos.get(i).GetTitulo());
                System.out.println("Ano: " + listaPeriodicos.get(i).GetAno());
                System.out.println("Edição: " + listaPeriodicos.get(i).GetEdicao());
                System.out.println("Estante: " + listaPeriodicos.get(i).GetNumEstante());
                System.out.println("Autor: " + listaPeriodicos.get(i).GetNomeAutor());
                System.out.println("-------------------------------------------------");
                
                encontrado = true;
    			
    		}
    		
    	}
    	
    	if (!encontrado) {
        	
            System.out.println("Não há periódicos disponíveis no momento");
            
        }
    	
    }
    
    public void listarPeriodicosEmprestados(ArrayList<Periodico> listaPeriodicos) {
    	
    	boolean encontrado = false;
    	
    	System.out.println("Periódicos Emprestados: \n");
    	
    	for (int i = 0; i < listaPeriodicos.size(); i++) {
    		
    		if(listaPeriodicos.get(i).GetEmprestado()) {
    			
    			System.out.println("ISSN: " + listaPeriodicos.get(i).GetISSN());
                System.out.println("Título: " + listaPeriodicos.get(i).GetTitulo());
                System.out.println("Ano: " + listaPeriodicos.get(i).GetAno());
                System.out.println("Edição: " + listaPeriodicos.get(i).GetEdicao());
                System.out.println("Estante: " + listaPeriodicos.get(i).GetNumEstante());
                System.out.println("Autor: " + listaPeriodicos.get(i).GetNomeAutor());
                System.out.println("Data do Empréstimo: 02/12/2024");
                System.out.println("-------------------------------------------------");
                
                encontrado = true;
    			
    		}
    		
    	}
    	
    	if (!encontrado) {
        	
            System.out.println("Não há periódicos emprestados no momento");
            
        }
    	
    }
	
}