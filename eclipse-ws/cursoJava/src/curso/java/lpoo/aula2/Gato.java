package curso.java.lpoo.aula2;

public class Gato extends Animal {
    static int nGatos;

    public Gato(String nome, String cor, int altura, double peso, String estadoEspirito) {
        super(nome, cor, altura, peso, estadoEspirito);
    }

    public Gato() {
	}

	@Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }
}
