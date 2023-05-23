package curso.java.lpoo.polimorfismo;

import curso.java.lpoo.aula2.Animal;
import curso.java.lpoo.aula2.Cachorro;

public class Petshop {
    public void darBanho(Animal animal) {
        animal.setEstadoEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro) {
        cachorro.setEstadoEspirito("tosado");
    }

    public void deixarHotel(Animal animal) {
        animal.setEstadoEspirito("saudade");
    }
}
