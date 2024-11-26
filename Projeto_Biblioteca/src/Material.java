
public class Material {

	private String titulo;
	private int ano;
	private int edicao;
	private int numEstante;
	private String nomeAutor;
	private String tipoMaterial;
	
	public Material(String iTitulo, int iAno, int iEdicao, int iNumEstante, String iNomeAutor, String iTipoMaterial) {
		
		this.titulo = iTitulo;
		this.ano = iAno;
		this.edicao = iEdicao;
		this.numEstante = iNumEstante;
		this.nomeAutor = iNomeAutor;
		this.tipoMaterial = iTipoMaterial;
		
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
	
	public String GetNomeAutor() {

		return nomeAutor;
	}
	
	public void SetNomeAutor(String iNomeAutor) {
		
		this.nomeAutor = iNomeAutor;
		
	}
	
	public String GetTipoMaterial() {
		
		return tipoMaterial;
	}
	
	public void SetTipoMaterial(String iTipoMaterial) {
		
		this.tipoMaterial = iTipoMaterial;
		
	}
}
