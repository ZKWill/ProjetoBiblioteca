
public class Emprestado {
	
	private String titulo;
	private int identificador;
	private String tipo;
	private String nomeAluno;
	private String cpf;
	private String dataEmprestimo;
	
	public Emprestado(String iTitulo, int iIdentificador, String iTipo, String iNomeAluno, String iCPF, String iDataEmprestimo) {
		
		this.titulo = iTitulo;
		this.identificador = iIdentificador;
		this.tipo = iTipo;
		this.nomeAluno = iNomeAluno;
		this.cpf = iCPF;
		this.dataEmprestimo = iDataEmprestimo;
		
	}
	
	public String GetTitulo() {
		
		return titulo;
	}
	
	public void SetTitulo(String iTitulo) {
		
		this.titulo = iTitulo;
		
	}
	
	public int GetIdentificador() {
		
		return identificador;
	}
	
	public void SetIdentificador(int iIdentificador) {
		
		this.identificador = iIdentificador;
		
	}
	
	public String GetTipo() {
		
		return tipo;
	}
	
	public void SetTipo(String iTipo) {
		
		this.tipo = iTipo;
		
	}
	
	public String GetNomeAluno() {
		
		return nomeAluno;
	}
	
	public void SetNomeAluno(String iNomeAluno) {
		
		this.nomeAluno = iNomeAluno;
		
	}
	
	public String GetCPF() {
		
		return cpf;
	}
	
	public void SetCPF(String iCPF) {
		
		this.cpf = iCPF;
		
	}
	
	public String GetDataEmprestimo() {
		
		return dataEmprestimo;
	}
	
	public void SetDataEmprestimo(String iDataEmprestimo) {
		
		this.dataEmprestimo = iDataEmprestimo;
		
	}
}
