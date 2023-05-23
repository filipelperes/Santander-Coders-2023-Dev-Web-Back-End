package curso.java.lpoo.aula2;

public class Passaro extends Animal {
    static int nPassaros;

    public Passaro(String nome, String cor, int altura, double peso, String estadoEspirito) {
        super(nome, cor, altura, peso, estadoEspirito);
    }

    public Passaro() {

    }

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }
}
