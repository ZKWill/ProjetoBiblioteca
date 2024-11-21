
public class Autor {
	
	private int codigo;
	private String nome;
	private String sobrenome;
	
	public Autor(int iCodigo, String iNome, String iSobrenome) {
		
		this.codigo = iCodigo;
		this.nome = iNome;
		this.sobrenome = iSobrenome;
		
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
	
	public String GetSobrenome() {
		
		return sobrenome;
	}
	
	public void SetSobrenome(String iSobrenome) {
		
		this.sobrenome = iSobrenome;
		
	}
	
}
