
public class Autor {
	
	private int codigo;
	private String nome;
	
	public Autor(int iCodigo, String iNome) {
		
		this.codigo = iCodigo;
		this.nome = iNome;
		
	}
	
	public int GetCodigo() {
		
		return codigo;
	}
	
	public void SetCodigo(int iCodigo) {
		
		this.codigo = iCodigo;
		
	}
	
	public String GetNome() {
		
		return nome;
	}
	
	public void SetNome(String iNome) {
		
		this.nome = iNome;
		
	}
	
}
