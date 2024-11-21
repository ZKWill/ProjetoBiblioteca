
public class Periodico {
	
	private int issn;
	private String titulo;
	private int volume;
	private int numEstante;
	private int quantidadeEstoqueTotal;
	private int quantidadeEstoqueDisponiveis;
	
	public Periodico(int iISSN, String iTitulo, int iVolume, int iNumEstante, int iQuantidadeEstoqueTotal, int iQuantidadeEstoqueDisponiveis) {
		
		this.issn = iISSN;
		this.titulo = iTitulo;
		this.volume = iVolume;
		this.numEstante = iNumEstante;
		this.quantidadeEstoqueTotal = iQuantidadeEstoqueTotal;
		this.quantidadeEstoqueDisponiveis = iQuantidadeEstoqueDisponiveis;
		
	}
	
	public int GetISSN() {
		
		return issn;
	}
	
	public void SetISSN(int iISSN) {
		
		this.issn = iISSN;
		
	}
	
	public String GetTitulo() {
		
		return titulo;
	}
	
	public void SetTitulo(String iTitulo) {
		
		this.titulo = iTitulo;
		
	}
	
	public int GetVolume() {
		
		return volume;
	}
	
	public void SetVolume(int iVolume) {
		
		this.volume = iVolume;
		
	}
	
	public int GetNumEstante() {
		
		return numEstante;
	}
	
	public void SetNumEstante(int iNumEstante) {
		
		this.numEstante = iNumEstante;
		
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
