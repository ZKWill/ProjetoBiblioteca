
public class Editora {
	
	private int codigo;
	private String nome;
	private String localizacao;
	
	public Editora(int iCodigo, String iNome, String iLocalizacao) {
		
		this.codigo = iCodigo;
		this.nome = iNome;
		this.localizacao = iLocalizacao;
		
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
	
	public String GetLocalizacao() {
		
		return localizacao;
	}
	
	public void SetLocalizacao(String iLocalizacao) {
		
		this.localizacao = iLocalizacao;
		
	}
}
