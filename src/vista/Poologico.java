package vista;

import bean.Animal;
import bean.Elefante;
import bean.Leon;
import bean.Pinguino;

public class Poologico {
    public static void mostrar() {
        //No se puede instanciar una clase abstracta
        //Animal animal = new Animal("Animal", 0);
        Animal leon = new Leon("Simba", 5);
        Animal elefante = new Elefante("Dumbo", 10);
        Animal pinguino = new Pinguino("Pingu", 3);

        leon.mostrarInfo();
        leon.hacerSonido();

        elefante.mostrarInfo();
        elefante.hacerSonido();

        pinguino.mostrarInfo();
        pinguino.hacerSonido();

        pinguino.setNombre("Pingu. JR");
        pinguino.mostrarInfo();
    }
}
