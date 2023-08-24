package bean;
public class Pinguino extends Animal {
    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pingüino emite sonidos característicos");
    }
}
