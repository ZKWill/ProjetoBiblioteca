
public class Periodico extends Material{

	private int issn;
	private boolean emprestado;
	
	public Periodico(String iTitulo, int iAno, int iEdicao, int iNumEstante, String iNomeAutor, String iTipoMaterial,int iISSN) {
		
		super(iTitulo, iAno, iEdicao, iNumEstante, iNomeAutor, iTipoMaterial);
		
		this.issn = iISSN;
		this.emprestado = false;
		
	}
	
	public int GetISSN() {
		
		return issn;
	}
	
	public void SetISSN(int iISSN) {
		
		this.issn = iISSN;
		
	}
	
	public boolean GetEmprestado() {
		
		return emprestado;
	}
	
	public void SetEmprestado(boolean iEmprestado) {
		
		this.emprestado = iEmprestado;
		
	}	
	
}
