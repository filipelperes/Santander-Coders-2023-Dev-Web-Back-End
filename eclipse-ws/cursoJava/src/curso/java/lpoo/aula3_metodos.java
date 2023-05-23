package curso.java.lpoo;

import curso.java.lpoo.aula2.Cachorro;

public class aula3_metodos {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "nada");


        System.out.println(cachorro1.pegar());
        System.out.println(cachorro1.interagir("carinho"));
    }
}