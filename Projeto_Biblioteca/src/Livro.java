
public class Livro extends Material{
	
	private int isbn;
	private String nomeEditora;
	private boolean emprestado;
	
	public Livro(String iTitulo, int iAno, int iEdicao, int iNumEstante, String iNomeAutor, String iTipoMaterial,int iISBN, String iNomeEditora) {
		
		super(iTitulo, iAno, iEdicao, iNumEstante, iNomeAutor, iTipoMaterial);
		
		this.isbn = iISBN;
		this.nomeEditora = iNomeEditora;
		this.emprestado = false;
		
	}

	public int GetISBN() {
		
		return isbn;
	}
	
	public void SetISBN(int iISBN) {
		
		this.isbn = iISBN;
		
	}
	
	public String GetNomeEditora() {
		
		return nomeEditora;
	}
	
	public void SetNomeEditora(String iNomeEditora) {
		
		this.nomeEditora = iNomeEditora;
		
	}
	
	public boolean GetEmprestado() {
		
		return emprestado;
	}
	
	public void SetEmprestado(boolean iEmprestado) {
		
		this.emprestado = iEmprestado;
		
	}


}
