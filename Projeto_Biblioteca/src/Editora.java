
public class Editora {
	
	private String nome;
	private String localizacao;
	
	public Editora(String iNome, String iLocalizacao) {
		
		this.nome = iNome;
		this.localizacao = iLocalizacao;
		
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
