
public class Aluno {
	
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String rg;
	private String numMatricula;
	
	public Aluno (String iNome, String iSobrenome, String iDataNascimento, String iRg, String iNumMatricula) {
		
		this.nome = iNome;
		this.sobrenome = iSobrenome;
		this.dataNascimento = iDataNascimento;
		this.rg = iRg;
		this.numMatricula = iNumMatricula;
		
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
	
	public String GetDataNascimento() {
		
		return dataNascimento;
	}
	
	public void SetDataNascimento(String iDataNascimento) {
		
		this.dataNascimento = iDataNascimento;
		
	}
	
	public String GetRG() {
		
		return rg;
	}
	
	public void SetRG(String iRg) {
		
		this.rg = iRg;
		
	}
	
	public String GetNumMatricula() {
		
		return numMatricula;
	}
	
	public void SetNumMatricula(String iNumMatricula) {
		
		this.numMatricula = iNumMatricula;
		
	}
}
