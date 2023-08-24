package bean;
public class Leon extends Animal {
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El león ruge");
    }
}
