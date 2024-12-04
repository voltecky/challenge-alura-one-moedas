public class Moeda extends Cambio{

	private int id;
	private String nome;
	private String nomes;
	private String simbolo;
	private String iso;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getNomes() {
		return nomes;
	}

	protected void setNomes(String nomes) {
		this.nomes = nomes;
	}

	protected String getSimbolo() {
		return simbolo;
	}

	protected void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	protected String getIso() {
		return iso;
	}

	protected void setIso(String iso) {
		this.iso = iso;
	}

}