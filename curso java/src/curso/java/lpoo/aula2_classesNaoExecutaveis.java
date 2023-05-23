package curso.java.lpoo;

import curso.java.lpoo.aula2.Cachorro;

public class aula2_classesNaoExecutaveis {
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();

//		cachorro1.nome = "Puppy";
//		cachorro1.cor = "Marrom";
//		cachorro1.altura = 25;
//		cachorro1.peso = 5.5;
//		cachorro1.tamanhoRabo = 5;

		cachorro1.setNome("Puppy");
		cachorro1.setCor("Marrom");
		cachorro1.setAltura(25);
		cachorro1.setPeso(5.5);
		cachorro1.setTamanhoRabo(5);

		System.out.println(cachorro1);
	}
}