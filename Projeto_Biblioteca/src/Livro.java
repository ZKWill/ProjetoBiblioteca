
public class Livro {
	
	private int isbn;
	private String titulo;
	private int ano;
	private int edicao;
	private int numEstante;
	private String nomeEditora;
	private String nomeAutor;
	private int quantidadeEstoqueTotal;
	private int quantidadeEstoqueDisponiveis;
	
	public Livro(int iISBN, String iTitulo, int iAno, int iEdicao, int iNumEstante, String iNomeEditora, String iNomeAutor, int iQuantidadeEstoqueTotal, int iQuantidadeEstoqueDisponiveis) {
		
		this.isbn = iISBN;
		this.titulo = iTitulo;
		this.ano = iAno;
		this.edicao = iEdicao;
		this.numEstante = iNumEstante;
		this.nomeEditora = iNomeEditora;
		this.nomeAutor = iNomeAutor;
		this.quantidadeEstoqueTotal = iQuantidadeEstoqueTotal;
		this.quantidadeEstoqueDisponiveis = iQuantidadeEstoqueDisponiveis;
		
	}
	
	public int GetISBN() {
		
		return isbn;
	}
	
	public void SetISBN(int iISBN) {
		
		this.isbn = iISBN;
		
	}
	
	public String GetTitulo() {
		
		return titulo;
	}
	
	public void SetTitulo(String iTitulo) {
		
		this.titulo = iTitulo;
		
	}
	
	public int GetAno() {
		
		return ano;
	}
	
	public void SetGenero(int iAno) {
		
		this.ano = iAno;
		
	}
	
	public int GetEdicao() {
		
		return edicao;
	}
	
	public void SetEdicao(int iEdicao) {
		
		this.edicao = iEdicao;
		
	}
	
	public int GetNumEstante() {
		
		return numEstante;
	}
	
	public void SetNumEstante(int iNumEstante) {
		
		this.numEstante = iNumEstante;
		
	}
	
	public String GetNomeEditora() {
		
		return nomeEditora;
	}
	
	public void SetNomeEditora(String iNomeEditora) {
		
		this.nomeEditora = iNomeEditora;
		
	}
	
	public String GetNomeAutor() {

		return nomeAutor;
	}
	
	public void SetNomeAutor(String iNomeAutor) {
		
		this.nomeAutor = iNomeAutor;
		
	}
	
	public int GetQuantidadeEstoqueTotal() {
		
		return quantidadeEstoqueTotal;
	}
	
	public void SetQuantidadeEstoqueTotal(int iQuantidadeEstoqueTotal) {
		
		this.quantidadeEstoqueTotal = iQuantidadeEstoqueTotal;
		
	}
	
	public int GetQuantidadeEstoqueDisponiveis() {
		
		return quantidadeEstoqueDisponiveis;
	}
	
	public void SetQuantidadeEstoqueDisponiveis(int iQuantidadeEstoqueDisponiveis) {
		
		this.quantidadeEstoqueDisponiveis = iQuantidadeEstoqueDisponiveis;
		
	}
}
