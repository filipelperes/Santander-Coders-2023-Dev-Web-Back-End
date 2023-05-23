package curso.java.lpoo;

import curso.java.lpoo.aula2.Animal;
import curso.java.lpoo.aula2.Cachorro;
import curso.java.lpoo.aula2.Gato;
import curso.java.lpoo.aula2.Passaro;
import curso.java.lpoo.polimorfismo.Petshop;

public class aula4_polimorfismo {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Passaro passaro = new Passaro();
        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro);
        System.out.println(cachorro.getEstadoEspirito());


        petshop.darBanho(gato);
        System.out.println(gato.getEstadoEspirito());


        petshop.tosar(cachorro);
        System.out.println(cachorro.getEstadoEspirito());


        Gato gato1 = new Gato("felix", "preto", 4);
        Animal gato2 = new Gato("felix", "preto", 4);
//        Gato gato3 = new Animal("felix", "preto", 4);
        Animal passaro3 = new Passaro("felix", "preto", 4);
    }

}
