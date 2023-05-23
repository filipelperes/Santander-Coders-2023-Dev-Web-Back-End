package curso.java.lpoo.aula2;

public class Cachorro extends Animal {
	// Atributos
	static int nDogs;
	private int tamanhoRabo;

	//Construtore
	public Cachorro() {
		super();
	}
	public Cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoEspirito) {
		super(nome, cor, altura, peso, estadoEspirito);
		this.tamanhoRabo = tamanhoRabo;
		nDogs++;
	}

	//Métodos

	public static int getnDogs() {
		return nDogs;
	}

	public static void setnDogs(int numeroObj) {
		Cachorro.nDogs = numeroObj;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamanhoRabo() {
		return tamanhoRabo;
	}

	public void setTamanhoRabo(int tamanhoRabo) {
		this.tamanhoRabo = tamanhoRabo;
	}

	public String getEstadoEspirito() {
		return estadoEspirito;
	}

	public void setEstadoEspirito(String estadoEspirito) {
		this.estadoEspirito = estadoEspirito;
	}

	public String pegar() {
		return "Bolinha";
	}

	public String interagir(String acao) {
//		if(acao.equals("carinho")) {
//			this.estadoEspirito = "feliz";
//		} else if(acao.equals("vai dormir")) {
//			this.estadoEspirito = "bravo";
//		}
//		else{
//			this.estadoEspirito = "Neutro";
//		}
//
//		return this.estadoEspirito;
		switch (acao) {
			case "carinho":
				this.estadoEspirito = "feliz";
				break;
			case "vai dormir":
				this.estadoEspirito = "bravo";
				break;
			default:
				this.estadoEspirito = "Neutro";
		}
		return this.estadoEspirito;
	}

	@Override
	public String toString() {
		return "Cachorro{" +
				"nome='" + nome + '\'' +
				'}';
	}

	@Override
	public void soar() {
		System.out.println("AU AU");
	}
}
