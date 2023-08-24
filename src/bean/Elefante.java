package bean;
public class Elefante extends Animal {
    public Elefante(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void hacerSonido() {
        System.out.println("El elefante barrita");
    }
}

