
public class Aluno {
	
	private int numMatricula;
	private String nome;
	private String dataNascimento;
	private String telefone;
	private String rg;
	private String cpf;
	
	public Aluno (int iNumMatricula, String iNome, String iDataNascimento, String iTelefone, String iRg, String iCPF) {
		
		this.numMatricula = iNumMatricula;
		this.nome = iNome;
		this.dataNascimento = iDataNascimento;
		this.telefone = iTelefone;
		this.rg = iRg;
		this.cpf = iCPF;
		
	}
	
	public int GetNumMatricula() {
		
		return numMatricula;
	}
	
	public void SetNumMatricula(int iNumMatricula) {
		
		this.numMatricula = iNumMatricula;
		
	}
	
	public String GetNome() {
		
		return nome;
	}
	
	public void SetNome(String iNome) {
		
		this.nome = iNome;
		
	}
	
	public String GetDataNascimento() {
		
		return dataNascimento;
	}
	
	public void SetDataNascimento(String iDataNascimento) {
		
		this.dataNascimento = iDataNascimento;
		
	}
	
	public String GetTelefone() {
		
		return telefone;
	}
	
	public void SetTelefone(String iTelefone) {
		
		this.telefone = iTelefone;
		
	}
	
	public String GetRG() {
		
		return rg;
	}
	
	public void SetRG(String iRg) {
		
		this.rg = iRg;
		
	}
	
	public String GetCPF() {
		
		return cpf;
	}
	
	public void SetCPF(String iCPF) {
		
		this.cpf = iCPF;
		
	}
	
}
